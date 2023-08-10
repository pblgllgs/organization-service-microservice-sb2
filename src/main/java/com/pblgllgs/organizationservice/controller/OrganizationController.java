package com.pblgllgs.organizationservice.controller;

import com.pblgllgs.organizationservice.dto.OrganizationDto;
import com.pblgllgs.organizationservice.service.OrganizationService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/organization")
@AllArgsConstructor
public class OrganizationController {

    private final OrganizationService organizationService;

    @PostMapping
    public ResponseEntity<OrganizationDto> createOrganization(
            @RequestBody OrganizationDto organizationDto
    ){
        return new ResponseEntity<>(organizationService.createOrganization(organizationDto), HttpStatus.CREATED);
    }

    @GetMapping("/{organizationCode}")
    public ResponseEntity<OrganizationDto> findByOrganizationCode(
            @PathVariable("organizationCode") String code
    ){
        return new ResponseEntity<>(organizationService.findByOrganizationCode(code), HttpStatus.OK);
    }
}
