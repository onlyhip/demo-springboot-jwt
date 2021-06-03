package com.springboot.jwt.demo.payload.request;

import javax.validation.constraints.NotBlank;

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
public class LoginRequest {
    @NotBlank
    private String username;

    @NotBlank
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
