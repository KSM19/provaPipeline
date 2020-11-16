package com.illimity.test.controller;

import com.illimity.test.model.dto.DossierDTO;
import com.illimity.test.model.request.PatchDossierRequest;
import com.illimity.test.model.response.GetDossiersResponse;
import com.illimity.test.service.DossierService;
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
    private DossierService dossierService;

    @GetMapping(value = "/dossier")
    public GetDossiersResponse getDossiers(){
        return dossierService.getDossiers();
    }

    @PostMapping(value = "/dossier")
    public DossierDTO createDossier(@RequestBody DossierDTO dossierDTO){
        return dossierService.createDossier(dossierDTO);
    }

    @GetMapping(value = "/dossier/{id}")
    public DossierDTO findDossierById(@PathVariable(value = "id") String id){
        return dossierService.findDossierById(id);
    }

    @PutMapping(value = "/dossier")
    public DossierDTO updateDossier(@RequestBody DossierDTO dossierDTO){
       return dossierService.updateDossier(dossierDTO);
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

    @PostMapping
    public

}
