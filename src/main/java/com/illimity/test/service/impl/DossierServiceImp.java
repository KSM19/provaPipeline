package com.illimity.test.service.impl;

import com.illimity.test.model.entity.Dossier;
import com.illimity.test.model.response.GetDossiersResponse;
import com.illimity.test.repository.DossierRepository;
import com.illimity.test.model.dto.DossierDTO;
import com.illimity.test.model.request.PatchDossierRequest;
import com.illimity.test.service.DossierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class DossierServiceImp implements DossierService {

    @Autowired
    private DossierRepository dossierRepository;

    @Override
    public GetDossiersResponse getDossiers() {
        List<Dossier> list = dossierRepository.findAll();
        GetDossiersResponse response = new GetDossiersResponse();
        response.setCount(BigDecimal.valueOf(list.size()-1));
        for (Dossier d: list)
            response.getData().add(

            );
        return response;
    }

    @Override
    public DossierDTO createDossier(DossierDTO dossierDTO) {
        //convert DTO to Entity
        Dossier dossier = new Dossier();
        dossierRepository.save(dossier);
        return DossierDTO.builder()
                .build();
    }

    @Override
    public DossierDTO findDossierById(String id) {
        return null;
    }

    @Override
    public DossierDTO updateDossier(DossierDTO dossierDTO) {
        //convert DTO to Entity
        Dossier dossier = new Dossier();
        dossierRepository.save(dossier);
        return DossierDTO.builder()
                .build();
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
