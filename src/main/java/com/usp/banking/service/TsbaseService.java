package com.usp.banking.service;

import com.usp.banking.exception.ApplicationException;

import java.util.List;

public interface TsbaseService<D,ID> {


    <S extends D> D add(D dto) throws ApplicationException;

    D update(D dto) throws ApplicationException;

    D fetchById(ID id) throws ApplicationException;

    List<D> fetchAll() throws ApplicationException;

    List<D> fetchAllById(ID id) throws ApplicationException;

    void delete(D dto) throws ApplicationException;
    void deleteById(ID id) throws ApplicationException;

    long getRowCount(D dto) throws ApplicationException;

}
