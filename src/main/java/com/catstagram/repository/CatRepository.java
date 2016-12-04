package com.catstagram.repository;

import com.catstagram.domain.Cat;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @authors Sonja Mäkipaja, Elsa Nyrhinen & Harri Kähkönen
 */
public interface CatRepository extends JpaRepository<Cat, Long> {
}
