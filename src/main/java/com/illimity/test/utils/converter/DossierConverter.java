package com.illimity.test.utils.converter;

import com.illimity.test.model.dto.DossierDTO;
import com.illimity.test.model.entity.Dossier;
import lombok.experimental.UtilityClass;

import java.util.Optional;

@UtilityClass
public class DossierConverter {
    public DossierDTO entityToDTO(Dossier dossier){
        return DossierDTO.builder()
                .assuranceTypeId(Optional.ofNullable(dossier.getAssuranceTypeId()).orElse(null))
                .businessAreaId(Optional.ofNullable(dossier.getBusinessAreaId()).orElse(null))
                .classificationStatusId(Optional.ofNullable(dossier.getClassificationStatusId()).orElse(null))
                .commissionAmount(Optional.ofNullable(dossier.getCommissionAmount()).orElse(null))

                .build();
    }
}
