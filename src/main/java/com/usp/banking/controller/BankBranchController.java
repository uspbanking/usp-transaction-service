package com.usp.banking.controller;

import com.usp.banking.exception.ApplicationException;
import com.usp.banking.service.TsBranchService;
import com.usp.banking.ui.dto.BranchDto;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Tag(name = "Bank Branch Controller", description = "Manipulate Branch details")
@RestController
@Slf4j
public class BankBranchController extends TsBaseController {

    private TsBranchService branchService;

    public BankBranchController(TsBranchService branchService) {
        this.branchService = branchService;
    }

    @PostMapping("/add")
    public ResponseEntity<?> addBranchDetails(@RequestBody BranchDto branchDto) throws ApplicationException {
        try {
            BranchDto dto = null;
            if (branchDto != null) {
                dto = branchService.add(branchDto);
                log.info("Branch added successfully");
            }
            return new ResponseEntity<>(dto, HttpStatus.CREATED);
        } catch (ApplicationException ex) {
            log.info("Exception while creating branch Details" + branchDto.getIfsc(), ex.getMessage());
            throw ex;
        }
    }

    @GetMapping("/fetch/{branchId}")
    public ResponseEntity<?> fetchBranchDetails(@PathVariable Long branchId) throws ApplicationException {
        try {
            BranchDto dto = branchService.fetchById(branchId);
            log.info("Got Branch details from DB");
            return new ResponseEntity<>(dto,HttpStatus.OK);
        } catch (ApplicationException ex) {
            log.info("Exception while fetching branch details" + ex.getErrorcode(), ex.getMessage());
            throw ex;
        }
    }

    @Override
    public void nullfy() {

    }
}
