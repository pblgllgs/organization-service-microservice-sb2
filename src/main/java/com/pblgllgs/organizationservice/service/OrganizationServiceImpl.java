package com.pblgllgs.organizationservice.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.pblgllgs.organizationservice.dto.OrganizationDto;
import com.pblgllgs.organizationservice.entity.Organization;
import com.pblgllgs.organizationservice.exception.ResourceNotFoundException;
import com.pblgllgs.organizationservice.repository.OrganizationRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class OrganizationServiceImpl implements OrganizationService{
    private final OrganizationRepository organizationRepository;
    @Override
    public OrganizationDto createOrganization(OrganizationDto organizationDto) {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.registerModule(new JavaTimeModule());
        Organization organization = objectMapper.convertValue(organizationDto, Organization.class);
        Organization organizationSaved = organizationRepository.save(organization);
        return objectMapper.convertValue(organizationSaved,OrganizationDto.class);
    }

    @Override
    public OrganizationDto findByOrganizationCode(String code) {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.registerModule(new JavaTimeModule());
        Organization organization =
                organizationRepository.
                        findByOrganizationCode(code)
                        .orElseThrow( ()-> new ResourceNotFoundException("Organization code not found"));
        return objectMapper.convertValue(organization,OrganizationDto.class);
    }
}
