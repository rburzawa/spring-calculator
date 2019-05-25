package pl.sda.spring.calculate.springcalculate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller //singleton tworzony przez kontener Springa - 1 krok
public class SimpleController {

    @Autowired //wstrzyknięcie zależności przez kontener Springa - 2 krok; DEPENDENCY INJECTION
    private Calculator calculator;

    // odpowiednik mapowań serwletowych
    // @RequestMapping(value = "/calculate", method = RequestMethod.GET)
    @GetMapping(value = "/calculate")
    public String getCalculation(Model model) {
        model.addAttribute("info", "Czesc");

        return "calculatorForm";

    }
}
