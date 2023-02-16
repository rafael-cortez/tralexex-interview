package br.com.confidencecambio.javabasico.controllers;

import br.com.confidencecambio.javabasico.DTOs.IMCDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.math.MathContext;

@RestController
@RequestMapping("/imc")
public class IMCRestController {


    @PostMapping("/calculate")
    public String calculateIMC (@RequestBody @Valid IMCDTO body){
        MathContext mc = new MathContext(4);
        var imc = body.getWeight().divide(body.getHeight().pow(2), mc);
        return imc.toString();


    }

}
