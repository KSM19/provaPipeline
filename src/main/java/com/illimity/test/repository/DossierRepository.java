package com.illimity.test.repository;

import com.illimity.test.model.dto.DossierDTO;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DossierRepository {
    List<DossierDTO> findAll();
}
