package com.pblgllgs.organizationservice.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document(value = "organization")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class Organization {
    @Id
    private String id;
    private String organizationName;
    private String organizationDescription;
    private String organizationCode;
    private LocalDateTime createdAt;
}
