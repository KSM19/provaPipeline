package com.illimity.test.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Corporate {
    private String id;
    private String name;
    private LocalDateTime updatedAt;
    private LocalDateTime createdAt;
    private String ndg;
    private String vatNumber;
    private String fiscalCode;
    private String notes;
    private String creditLineIds;
    private String updateBy;
}
