package com.illimity.test.repository;

import com.illimity.test.model.dto.DossierDTO;
import com.illimity.test.model.entity.Dossier;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DossierRepository extends MongoRepository<Dossier, String > {
}
