package com.usp.banking.mapper;

import java.util.List;

//@Mapper(componentModel = "spring",unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface Abstractmapper<D,E> {

    E toEntity(D dto);
    D toDto(E entity);

    List<D> toDto(List<E> entities);
    List<E> toEntity(List<D> dtos);
}
