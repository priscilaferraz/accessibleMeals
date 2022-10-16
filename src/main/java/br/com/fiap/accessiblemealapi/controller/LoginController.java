package br.com.fiap.accessiblemealapi.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.fiap.accessiblemealapi.model.Login;
import br.com.fiap.accessiblemealapi.service.ClienteService;

@RestController
@RequestMapping("/api/cliente/login/")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class LoginController {

    @Autowired
    private ClienteService service;

    @PostMapping
    public ResponseEntity<Map<String, Object>> login(@RequestBody Login login) {
        return ResponseEntity.ok(service.login(login.getEmail(), login.getPassword()));
    }
}
