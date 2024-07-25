package com.usp.banking.mapper;

import com.usp.banking.entity.TsBranchDetails;
import com.usp.banking.ui.dto.BranchDto;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring",unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface BranchMapper {

    BranchMapper MAPPER = Mappers.getMapper(BranchMapper.class);

    TsBranchDetails toEntity(BranchDto dto);
    BranchDto toDto(TsBranchDetails entity);

    List<BranchDto> toDto(List<TsBranchDetails> entities);
    List<TsBranchDetails> toEntity(List<BranchDto> dtos);
}
