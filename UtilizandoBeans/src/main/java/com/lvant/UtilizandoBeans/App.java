package com.lvant.UtilizandoBeans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext factory  = new AnnotationConfigApplicationContext(AppConfig.class);

        Livro livro = factory.getBean(Livro.class);
        livro.setNome("Harry Potter");
        livro.setCodigo("Dbruxaria17");
        livro.exibir();

        Autor autor = factory.getBean(Autor.class);
        autor.setNomeAutor("JK Rowling");
        livro.exibir();

       ((AbstractApplicationContext) factory).close();
    }
}
