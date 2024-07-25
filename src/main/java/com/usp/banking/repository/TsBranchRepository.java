package com.usp.banking.repository;

import com.usp.banking.entity.TsBranchDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TsBranchRepository extends TsRepository<TsBranchDetails,Long>, JpaRepository<TsBranchDetails,Long> {
}
