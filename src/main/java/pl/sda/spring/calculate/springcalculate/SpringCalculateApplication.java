package pl.sda.spring.calculate.springcalculate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringCalculateApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCalculateApplication.class, args);

        /*po staremu
        Calculator calculator = new Calculator();
        System.out.println(calculator.calculate("4+8"));*/
    }

}
