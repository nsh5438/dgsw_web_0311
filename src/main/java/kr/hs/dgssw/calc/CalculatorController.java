package kr.hs.dgssw.calc;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

    @GetMapping
    public String getString(){
        return "Hello World";
    }
}


// fe24ef1f56e2e07cbfd266f42fb2ab57c79ba487