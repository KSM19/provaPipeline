package com.illimity.test.service.impl;

import com.illimity.test.repository.DossierRepository;
import com.illimity.test.resource.dto.DossierDTO;
import com.illimity.test.resource.request.PatchDossierRequest;
import com.illimity.test.service.IDossierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DossierService implements IDossierService {

    @Autowired
    private DossierRepository dossierRepository;

    @Override
    public List<DossierDTO> getDossiers() {
        return null;
    }

    @Override
    public void createDossier(DossierDTO dossierDTO) {

    }

    @Override
    public DossierDTO findDossierById(String id) {
        return null;
    }

    @Override
    public void updateDossier(DossierDTO dossierDTO) {

    }

    @Override
    public void deleteDossier(String id) {

    }

    @Override
    public void patchDossier(String id, PatchDossierRequest request) {

    }

    @Override
    public byte[] getDossierPDF(String id) {
        return new byte[0];
    }

    @Override
    public List<DossierDTO> getDossierCorporates(String id) {
        return null;
    }
}
