package com.vault.vault;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    private final MyConfiguration configuration;

    public Controller(MyConfiguration configuration) {
        this.configuration = configuration;
    }

    @GetMapping("")
    public MyConfiguration getConfiguration() {
        return configuration;
    }
}
