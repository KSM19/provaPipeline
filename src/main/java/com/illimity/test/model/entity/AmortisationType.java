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
public class AmortisationType {
    private String id;
    private String name;
    private LocalDateTime updatedAt;
    private LocalDateTime createdAt;
    private String code;
}
