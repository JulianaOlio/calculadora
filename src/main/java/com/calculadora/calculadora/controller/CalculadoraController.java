package com.calculadora.calculadora.controller;

import com.calculadora.calculadora.model.Calculadora;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculadoraController {

    @PostMapping("/calcular")
    public Double calcular(@RequestBody Calculadora calcular) {
        if (calcular.getOperacao().equals("soma")) {
            return calcular.getNumero1() + calcular.getNumero2();
        } else if (calcular.getOperacao().equals("subtração")) {
            return calcular.getNumero1() - calcular.getNumero2();
        }
        return null;
    }

}
