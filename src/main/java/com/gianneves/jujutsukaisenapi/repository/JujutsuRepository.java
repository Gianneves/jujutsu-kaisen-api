package com.gianneves.jujutsukaisenapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface JujutsuRepository extends JpaRepository<Character, UUID> {
}
