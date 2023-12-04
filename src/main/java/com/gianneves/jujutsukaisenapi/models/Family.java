package com.gianneves.jujutsukaisenapi.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Table(name = "family")
@Entity(name = "family")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Family {

    private UUID id;
    private String family;
    private String description;
    List<Characters> familyCharacter = new ArrayList<>();
}
