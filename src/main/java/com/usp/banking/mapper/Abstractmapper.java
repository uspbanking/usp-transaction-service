package com.usp.banking.mapper;

import java.util.List;

public interface Abstractmapper<D,E> {

    public E toEntity(D dto);
    public D toDto(E entity);

    List<D> toDto(List<E> entities);
    List<E> toEntity(List<D> dtos);
}
