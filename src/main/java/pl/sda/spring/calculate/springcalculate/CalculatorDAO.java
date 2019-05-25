package pl.sda.spring.calculate.springcalculate;

import lombok.Getter;
import org.springframework.stereotype.Component;

import java.util.LinkedHashSet;
import java.util.Set;

@Getter
@Component
public class CalculatorDAO {

    public Set<String> history = new LinkedHashSet<>();

    public void addToHistory (String inputAndResult){
        history.add(inputAndResult);
    }

}
