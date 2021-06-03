package com.springboot.jwt.demo.repository;

import com.springboot.jwt.demo.entities.RefreshToken;
import com.springboot.jwt.demo.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * Class information:
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
public interface RefreshTokenRepository extends JpaRepository<RefreshToken, Long> {

    /**
     *
     * @param token
     * @return
     */
    Optional<RefreshToken> findByToken(String token);

    /**
     *
     * @param user
     * @return
     */
    @Modifying
    int deleteByUser(User user);
}

