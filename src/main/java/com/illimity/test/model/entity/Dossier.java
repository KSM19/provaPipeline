package com.illimity.test.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Document(collection = "dossier")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Dossier {
    @Id
    @JsonProperty(value = "_id")
    private String id;
    private String name;
    private LocalDateTime updatedAt;
    private LocalDateTime createdAt;
    private String iterId;
    private String businessAreaId;
    private String typologyId;
    private BigDecimal duration;
    private BigDecimal totalAmount;
    private String classificationStatusId;
    private BigDecimal rate;
    private BigDecimal commissionPercent;
    private BigDecimal commissionAmount;
    private BigDecimal loanAgencyFeePercent;
    private BigDecimal loanAgencyFeeAmount;
    private String industryId;
    private String tutorId;
    private String positionTypeId;
    private String assuranceTypeId;
    private String fundingTypeId;
    private BigDecimal successPercentage;
    private LocalDate engagementDate;
    private LocalDate deliberationDate;
    private LocalDate emanationDate;
    private BigDecimal priority;
    private String updatedBy;
    private List<User> teamIds;
    private String source;
    private List<String> corporateIds;
    private String notes;
}
