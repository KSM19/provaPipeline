package com.illimity.test.model.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@AllArgsConstructor
@Data
@Builder
public class PatchCorporateRequest {
    private String property;
}
