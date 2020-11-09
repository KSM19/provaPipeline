package com.illimity.test.controller;

import com.illimity.test.resource.dto.DossierDTO;
import com.illimity.test.resource.request.PatchDossierRequest;
import com.illimity.test.service.IDossierService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;
import java.util.Map;

@RestController
public class DossierController {
    private static final Logger LOGGER = LogManager.getLogger(DossierController.class);

    @Autowired
    private IDossierService dossierService;

    @GetMapping(value = "/dossier")
    public List<DossierDTO> getDossiers(){
        return dossierService.getDossiers();
    }

    @PostMapping(value = "/dossier")
    public void createDossier(@RequestBody DossierDTO dossierDTO){
        dossierService.createDossier(dossierDTO);
    }

    @GetMapping(value = "/dossier/{id}")
    public DossierDTO findDossierById(@PathVariable(value = "id") String id){
        return dossierService.findDossierById(id);
    }

    @PutMapping(value = "/dossier/{id}")
    public void updateDossier(@PathVariable(value = "id") String id,
                              @RequestBody DossierDTO dossierDTO){
        dossierDTO.setId(id);
        dossierService.updateDossier(dossierDTO);
    }

    @DeleteMapping(value = "/dossier/{id}")
    public void deleteDossier(@PathVariable(value = "id") String id){
        dossierService.deleteDossier(id);
    }

    @PatchMapping(value = "/dossier/{id}")
    public void patchDossier(@PathVariable(value = "id") String id,
                             @RequestBody PatchDossierRequest request){
        dossierService.patchDossier(id,request);
    }

    @GetMapping(value = "/dossier/{id}/pdf")
    public Map<String,byte[]> getDossierPDF(@PathVariable(value = "id") String id){
        return Collections.singletonMap("fileExcel", dossierService.getDossierPDF(id));
    }

    @GetMapping(value = "/dossier/{id}/corporates")
    public List<DossierDTO> getDossierCorporates(@PathVariable(value = "id") String id){
        return dossierService.getDossierCorporates(id);
    }

    @PostMapping(value = "/creditLine")
    public void createCreditLineDossier(@RequestBody DossierDTO dossierDTO){
        dossierService.createDossier(dossierDTO);
    }

}
