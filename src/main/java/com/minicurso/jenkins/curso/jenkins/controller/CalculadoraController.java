package com.minicurso.jenkins.curso.jenkins.controller;

import com.minicurso.jenkins.curso.jenkins.services.CalculadoraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculadoraController {

    @Autowired
    private CalculadoraService calculadoraService;

    @GetMapping("/ola")
    public String hello(){
        return calculadoraService.hello();
    }

    @GetMapping("/somar/{a}/{b}")
    public int somar(@PathVariable int a, @PathVariable int b){
        return calculadoraService.somar(a, b);
    }

    @GetMapping("/subtrair/{a}/{b}")
    public int subtrair(@PathVariable int a, @PathVariable int b){
        return calculadoraService.subtrair(a, b);
    }

    @GetMapping("/multiplicar/{a}/{b}")
    public int multiplicar(@PathVariable int a, @PathVariable int b){
        return calculadoraService.multiplicar(a, b);
    }

    @GetMapping("/dividir/{a}/{b}")
    public int dividir(@PathVariable int a, @PathVariable int b){
        return calculadoraService.dividir(a, b);
    }

}
