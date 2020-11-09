package com.illimity.test.resource.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@AllArgsConstructor
@Data
@Builder
public class PatchDossierRequest {
    private String property;
}
