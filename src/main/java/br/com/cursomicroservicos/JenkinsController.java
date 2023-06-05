package br.com.cursomicroservicos;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/jenkins")
public class JenkinsController {

    @GetMapping
    public ResponseEntity<String> get(){
        System.out.println("API FUNCIONANDO");
        return ResponseEntity.ok("Chamando API - Teste Jenkins!!! - Teste alteração");
    }
}

