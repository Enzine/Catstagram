package com.catstagram.repository;

import com.catstagram.domain.Cat;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author sonjamak
 */
public interface CatRepository extends JpaRepository<Cat, Long> {
}
