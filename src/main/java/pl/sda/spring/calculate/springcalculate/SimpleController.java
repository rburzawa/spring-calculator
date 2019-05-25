package pl.sda.spring.calculate.springcalculate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller //singleton tworzony przez kontener Springa - 1 krok
public class SimpleController {

    @Autowired //wstrzyknięcie zależności przez kontener Springa - 2 krok; DEPENDENCY INJECTION
    private Calculator calculator;
    @Autowired
    private CalculatorDAO calculatorDAO;

    // odpowiednik mapowań serwletowych
    // @RequestMapping(value = "/calculate", method = RequestMethod.GET)
    @GetMapping(value = "/calculate")
    public String getCalculation(@RequestParam(required = false) String inputText, Model model) {
        model.addAttribute("info", "Czesc");
        if (inputText != null) {
            Double result = calculator.calculate(inputText);
            model.addAttribute("result", result);
            calculatorDAO.addToHistory(inputText + "=" + result);
        }
        model.addAttribute("history", calculatorDAO.getHistory());
        return "calculatorForm";
    }
}
