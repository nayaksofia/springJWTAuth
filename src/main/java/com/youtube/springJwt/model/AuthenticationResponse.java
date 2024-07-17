package com.youtube.springJwt.model;

public class AuthenticationResponse {
    private String token;

    //Generate constructor
    public AuthenticationResponse(String token) {
        this.token = token;
    }

    //Generate Getter and Setter
    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
