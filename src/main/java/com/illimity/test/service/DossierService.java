package com.illimity.test.service;

import com.illimity.test.model.dto.DossierDTO;
import com.illimity.test.model.request.PatchDossierRequest;
import com.illimity.test.model.response.GetDossiersResponse;

import java.util.List;

public interface DossierService {
    GetDossiersResponse getDossiers();

    DossierDTO createDossier(DossierDTO dossierDTO);

    DossierDTO findDossierById(String id);

    DossierDTO updateDossier(DossierDTO dossierDTO);

    void deleteDossier(String id);

    void patchDossier(String id, PatchDossierRequest request);

    byte[] getDossierPDF(String id);

    List<DossierDTO> getDossierCorporates(String id);
}
