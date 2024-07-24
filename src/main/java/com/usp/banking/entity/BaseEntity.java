package com.usp.banking.entity;

import jakarta.persistence.Column;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import lombok.Data;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

@EntityListeners(AuditingEntityListener.class)
@MappedSuperclass
@Data
public class BaseEntity {

    @CreatedBy
    @Column(updatable = false)
    protected String createdBy;

    @CreatedDate
    @Column(nullable = false,updatable = false)
    protected LocalDateTime createdDate;

    @LastModifiedBy
    protected String lastModifiedBy;

    @LastModifiedDate
    protected LocalDateTime lastModifiedDate;
}
