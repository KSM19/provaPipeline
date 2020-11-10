package com.illimity.test.service.impl;

import com.illimity.test.repository.CorporateRepository;
import com.illimity.test.service.CorporateService;
import org.springframework.beans.factory.annotation.Autowired;

public class CorporateServiceImp implements CorporateService {

    @Autowired
    private CorporateRepository corporateRepository;
}
