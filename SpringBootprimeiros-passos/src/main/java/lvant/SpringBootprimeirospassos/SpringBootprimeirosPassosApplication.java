package lvant.SpringBootprimeirospassos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.w3c.dom.ls.LSOutput;

@SpringBootApplication
public class SpringBootprimeirosPassosApplication {

    public static void main(String[] args) {

        SpringApplication.run(SpringBootprimeirosPassosApplication.class, args);


        Calculadora calculadora = new Calculadora();

        System.out.println("o resultado é " + calculadora.somar(2, 7));
    }
}


