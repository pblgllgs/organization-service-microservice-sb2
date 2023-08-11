package com.pblgllgs.organizationservice.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity(name = "Organization")
@Table(
        name = "organizations",
        uniqueConstraints = {
                @UniqueConstraint(
                        name = "organization_UK",
                        columnNames = "organization_code"
                )
        }
)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Organization {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(
            name = "organization_id_sequence",
            sequenceName = "organization_id_sequence",
            allocationSize = 1
    )
    private Long id;

    @Column(
            name = "organization_name",
            nullable = false
    )
    private String organizationName;
    @Column(
            name = "organization_description",
            nullable = false
    )
    private String organizationDescription;
    @Column(
            name = "organization_code",
            nullable = false
    )
    private String organizationCode;
    @CreationTimestamp
    private LocalDateTime createdAt;
}
