package com.springboot.jwt.demo.repository;

import com.springboot.jwt.demo.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * Class information: UserRepository
 * Author: ChiPM
 * Version information: 1.0
 * Date: 6/3/2021
 * Copyright notice:
 * --------------------------------------------------------
 * Modification Logs:
 * DATE          AUTHOR         DESCRIPTION
 * --------------------------------------------------------
 * 6/3/2021      ChiPM          Description of modification
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    /**
     * Find User by field username
     * @param username
     * @return Optional<User>
     */
    Optional<User> findByUsername(String username);

    /**
     * Check username existence
     * @param username
     * @return Boolean type
     */
    Boolean existsByUsername(String username);

    /**
     * Check email existence
     * @param email
     * @return Boolean type
     */
    Boolean existsByEmail(String email);
}

