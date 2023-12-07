package com.minicurso.jenkins.curso.jenkins.service;

import com.minicurso.jenkins.curso.jenkins.services.CalculadoraService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CalculadoraServiceTest {

    private CalculadoraService calculadoraService;

    @BeforeEach
    public void init(){
        calculadoraService = new CalculadoraService();
    }

    @Test
    public void deveRetornarUmaMensagem(){
        String hello = "Bem vindo ao curso de Jenkins";
        Assertions.assertEquals(hello, calculadoraService.hello());
    }

    public void deveSomarDoisValores(){
        int a = 2;
        int b = 3;
        int result = 5;
        Assertions.assertEquals(result, calculadoraService.somar(a, b));
    }

    public void deveSubtrairDoisValores(){
        int a = 2;
        int b = 3;
        int result = 5;
        Assertions.assertEquals(result, calculadoraService.subtrair(a, b));
    }

    public void deveMultiplicarDoisValores(){
        int a = 2;
        int b = 3;
        int result = 5;
        Assertions.assertEquals(result, calculadoraService.multiplicar(a, b));
    }

    public void deveDividirDoisValores(){
        int a = 2;
        int b = 3;
        int result = 5;
        Assertions.assertEquals(result, calculadoraService.dividir(a, b));
    }
}
