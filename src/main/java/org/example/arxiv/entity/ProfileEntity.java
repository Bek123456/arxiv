package org.example.arxiv.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.example.arxiv.enums.ProfileRole;

@Entity
@Getter
@Setter
@Table(name = "profile_entity")
public class ProfileEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String surname;
    private String password;
    @Column(unique = true)
    private String username;
    @Column(name = "phone_number")
    private String phoneNumber;
    @Column(name = "profile_role")
    @Enumerated(EnumType.STRING)
    private ProfileRole profileRole;
}
