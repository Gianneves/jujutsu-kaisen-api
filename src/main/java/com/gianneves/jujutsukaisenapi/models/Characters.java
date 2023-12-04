package com.gianneves.jujutsukaisenapi.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Table(name = "characters")
@Entity(name = "characters")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Characters {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID id;
    private String characterName;
    private String family;
    private String cursedEnergy;
    private String cursedTechniques;
    private String cursedObjects;
    private String cursedCorpses;
    private String cursedRestrictions;
}
