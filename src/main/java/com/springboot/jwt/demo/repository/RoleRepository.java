package com.springboot.jwt.demo.repository;

import com.springboot.jwt.demo.entities.Role;
import com.springboot.jwt.demo.utils.ERole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * Class information: RoleRepository
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
public interface RoleRepository extends JpaRepository<Role, Long> {

    /**
     * Find Role by name of role
     * @param name
     * @return Optional<Role>
     */
    Optional<Role> findByName(ERole name);

}
