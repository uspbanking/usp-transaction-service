package com.usp.banking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TsRepository<T,ID> extends JpaRepository<T,ID> {
}
