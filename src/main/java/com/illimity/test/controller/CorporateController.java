package com.illimity.test.controller;

import com.illimity.test.model.dto.CorporateDTO;
import com.illimity.test.model.dto.CreditLineDTO;
import com.illimity.test.model.request.PatchCorporateCreditLineRequest;
import com.illimity.test.model.request.PatchCorporateRequest;
import com.illimity.test.service.CorporateService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class CorporateController {
    private static final Logger LOGGER = LogManager.getLogger(CorporateController.class);

    @Autowired
    private CorporateService corporateService;

    @GetMapping(value = "/corporate")
    public List<CorporateDTO> getCorporate() {
        return null;
    }

    @PostMapping(value = "/corporate")
    public void createCorporate(@RequestBody CorporateDTO corporateDTO) {

    }

    @PutMapping(value = "/corporate")
    public void updateCorporate(@RequestBody CorporateDTO corporateDTO) {

    }

    @GetMapping(value = "/corporate/{id}")
    public CorporateDTO findCorporateById(@PathVariable(value = "id") String id) {
        return null;
    }

    @PutMapping(value = "/corporate/{id}")
    public void updateCorporate(@PathVariable(value = "id") String id,
                                @RequestBody CorporateDTO corporateDTO) {
    }

    @DeleteMapping(value = "/corporate/{id}")
    public void deleteCorporate(@PathVariable(value = "id") String id) {
    }

    @PatchMapping(value = "/corporate/{id}")
    public void patchCorporate(@PathVariable(value = "id") String id,
                             @RequestBody PatchCorporateRequest request) {

    }

    @GetMapping(value = "/corporate/{id}/creditLines")
    public List<CreditLineDTO> getCorporateCreditLines(){
        return null;
    }

    @PostMapping(value = "/corporate/{id}/creditLines")
    public void createCorporateCreditLines(@PathVariable(value = "id") String id, @RequestBody CreditLineDTO creditLineDTO){

    }

    @PutMapping(value = "/corporate/{id}/creditLine/{fk}")
    public void updateCorporateCreditLines(@PathVariable(value = "id") String id, @PathVariable(value = "fk") String fk, @RequestBody CreditLineDTO creditLineDTO) {
    }

    @DeleteMapping(value = "/corporate/{id}/creditLine/{fk}")
    public void deleteCorporateCreditLine(@PathVariable(value = "id") String id, @PathVariable(value = "fk") String fk){
    }

    @PatchMapping(value = "/corporate/{id}/creditLine/{fk}")
    public void patchCorporateCreditLine(@PathVariable(value = "id") String id, @PathVariable(value = "fk") String fk,
                             @RequestBody PatchCorporateCreditLineRequest request) {

    }

}
