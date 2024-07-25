package com.usp.banking.service;

import com.usp.banking.entity.TsBranchDetails;
import com.usp.banking.exception.ApplicationException;
import com.usp.banking.mapper.BranchMapper;
import com.usp.banking.repository.TsBranchRepository;
import com.usp.banking.ui.dto.AddressDto;
import com.usp.banking.ui.dto.BranchDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class TsBranchService implements TsbaseService<BranchDto, Long> {

    private TsBranchRepository branchRepository;

    private TsAddressService addressService;

    public TsBranchService(TsBranchRepository branchRepository, TsAddressService addressService) {
        this.branchRepository = branchRepository;
        this.addressService = addressService;
    }

    @Override
    public <S extends BranchDto> BranchDto add(BranchDto dto) throws ApplicationException {
        //Save address first.
        log.info("First we are going to save address details");
        AddressDto addressDto = addressService.add(dto.getAddress());
        log.info("Address details are saved successfully");
        TsBranchDetails entity = BranchMapper.MAPPER.toEntity(dto);
        entity.setAddressId(addressDto.getAddrId());
        entity = branchRepository.save(entity);
        log.info("Branch details saved successfully");
        BranchDto branchDto = BranchMapper.MAPPER.toDto(entity);

        branchDto.setAddress(addressDto);

        return branchDto;
    }

    @Override
    public BranchDto update(BranchDto dto) throws ApplicationException {
        return null;
    }

    @Override
    public BranchDto fetchById(Long branchId) throws ApplicationException {
        BranchDto branchDto = null;
        Optional<TsBranchDetails> branchDetails = branchRepository.findById(branchId);
        log.info("Got branch details from repository");
        if (branchDetails.isPresent()) {
            branchDto = BranchMapper.MAPPER.toDto(branchDetails.get());
        }
        if (branchDto != null) {
            AddressDto addressDto = addressService.fetchById(branchDto.getSeqId());
            log.info("Got Address details from repository");
            branchDto.setAddress(addressDto);
        }
        return branchDto;
    }

    @Override
    public List<BranchDto> fetchAll() throws ApplicationException {
        List<TsBranchDetails> branchDetails = branchRepository.findAll();
        List<BranchDto> branchDtos = BranchMapper.MAPPER.toDto(branchDetails);
        return branchDtos;
    }

    @Override
    public List<BranchDto> fetchAllById(Long aLong) throws ApplicationException {
        return null;
    }

    @Override
    public void delete(BranchDto dto) throws ApplicationException {

    }

    @Override
    public void deleteById(Long aLong) throws ApplicationException {

    }

    @Override
    public long getRowCount(BranchDto dto) throws ApplicationException {
        return 0;
    }
}
