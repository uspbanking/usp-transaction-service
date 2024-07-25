package com.usp.banking.repository;

import com.usp.banking.entity.TsAddressDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TsAddressRepository extends TsRepository<TsAddressDetails,Long>, JpaRepository<TsAddressDetails,Long> {
}
