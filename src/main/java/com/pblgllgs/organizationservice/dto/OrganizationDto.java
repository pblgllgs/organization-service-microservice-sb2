package com.pblgllgs.organizationservice.dto;

import lombok.*;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class OrganizationDto {
    private String id;
    private String organizationName;
    private String organizationDescription;
    private String organizationCode;
    private LocalDateTime createdAt;
}
