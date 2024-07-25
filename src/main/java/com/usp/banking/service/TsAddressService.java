package com.usp.banking.service;

import com.usp.banking.entity.TsAddressDetails;
import com.usp.banking.mapper.AddressMapper;
import com.usp.banking.repository.TsAddressRepository;
import com.usp.banking.ui.dto.AddressDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class TsAddressService implements TsbaseService<AddressDto, Long> {

    private TsAddressRepository addressRepository;

    public TsAddressService(TsAddressRepository repository) {
        this.addressRepository = repository;
    }

    @Override
    public <S extends AddressDto> AddressDto add(AddressDto dto) {
        TsAddressDetails addressDetails = AddressMapper.MAPPER.toEntity(dto);

        addressDetails = addressRepository.save(addressDetails);
        log.info("Address details saved successfully");
        AddressDto addressDto = AddressMapper.MAPPER.toDto(addressDetails);
        return addressDto;
    }

    @Override
    public AddressDto update(AddressDto dto) {
        return null;
    }

    @Override
    public AddressDto fetchById(Long id) {
        Optional<TsAddressDetails> addressDetails = addressRepository.findById(id);
        log.info("Got Address details from repository");
        AddressDto addressDto = null;
        if (addressDetails.isPresent()) {
            addressDto = AddressMapper.MAPPER.toDto(addressDetails.get());
        }
        return addressDto;
    }

    @Override
    public List<AddressDto> fetchAll() {
        return null;
    }

    @Override
    public List<AddressDto> fetchAllById(Long aLong) {
        return null;
    }

    @Override
    public void delete(AddressDto dto) {

    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public long getRowCount(AddressDto dto) {
        return 0;
    }
}
