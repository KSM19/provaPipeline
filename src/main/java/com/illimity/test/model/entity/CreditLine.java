package com.illimity.test.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CreditLine {
    private String id;
    private String name;
    private LocalDateTime updatedAt;
    private LocalDateTime createdAt;
    private String technicalShapeId;
    private BigDecimal amount;
    private BigDecimal duration;
    private String classifiedStatusId;
    private BigDecimal rate;
    private BigDecimal commissionPercentage;
    private BigDecimal commissionAmount;
    private String positionTypeId;
    private String assuranceTypeId;
    private BigDecimal assuranceCoverage;
    private String fundingTypeId;
    private String amortisationTypeId;
    private BigDecimal frequency;
    private String pociId;
    private String nominal;
    private String purchasePrice;
    private String emanationDate;
}
