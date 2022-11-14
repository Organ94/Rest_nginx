package com.example.controller;

import com.example.data.Authorities;
import com.example.service.AuthorizationService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class AuthorizationController {

    AuthorizationService service;

    @GetMapping("/authorize")
    public List<Authorities> getAuthorities(
            @RequestParam("user") String user, @RequestParam("password") String password) {
        return service.getAuthorities(user, password);
    }
}
