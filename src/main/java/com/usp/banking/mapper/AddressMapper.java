package com.usp.banking.mapper;

import com.usp.banking.entity.TsAddressDetails;
import com.usp.banking.ui.dto.AddressDto;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring",unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface AddressMapper {

    AddressMapper MAPPER = Mappers.getMapper(AddressMapper.class);

    TsAddressDetails toEntity(AddressDto dto);
    AddressDto toDto(TsAddressDetails entity);

    List<AddressDto> toDto(List<TsAddressDetails> entities);
    List<TsAddressDetails> toEntity(List<AddressDto> dtos);
}
