package com.pblgllgs.organizationservice.repository;

import com.pblgllgs.organizationservice.entity.Organization;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface OrganizationRepository extends MongoRepository<Organization, String> {

    Optional<Organization> findByOrganizationCode(String code);
}
