package com.vault.vault;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("key")
public class MyConfiguration {

    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
