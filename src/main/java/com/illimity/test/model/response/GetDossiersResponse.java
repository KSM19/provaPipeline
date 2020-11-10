package com.illimity.test.model.response;

import com.illimity.test.model.dto.DossierDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GetDossiersResponse {
    private BigDecimal count;
    private List<DossierDTO> data;
}
