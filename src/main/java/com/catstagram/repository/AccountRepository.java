package com.catstagram.repository;

import com.catstagram.domain.Account;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @authors Sonja Mäkipaja, Elsa Nyrhinen & Harri Kähkönen
 */
public interface AccountRepository extends JpaRepository<Account, Long> {
    Account findByUsername(String username);
}