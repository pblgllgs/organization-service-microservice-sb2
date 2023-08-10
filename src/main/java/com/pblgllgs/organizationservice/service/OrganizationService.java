package com.pblgllgs.organizationservice.service;

import com.pblgllgs.organizationservice.dto.OrganizationDto;

public interface OrganizationService {
    OrganizationDto createOrganization(OrganizationDto organizationDto);
    OrganizationDto findByOrganizationCode(String code);
}
