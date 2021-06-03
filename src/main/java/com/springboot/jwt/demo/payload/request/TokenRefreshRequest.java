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
public class TokenRefreshRequest {
    @NotBlank
    private String refreshToken;

    public String getRefreshToken() {
        return refreshToken;
    }

    public void setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
    }
}
