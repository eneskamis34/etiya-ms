package org.training.etiya.microservice.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class GreetingsRun implements CommandLineRunner {

    @Autowired
    @Qualifier("myGreetings")
    private GreetingsEng  greetingsEng1;

    private GreetingsEng greetingsEng2;

    private GreetingsEng greetingsEng3;


    /*
    Constructer injection tercih edilmelidir.
     */
    public GreetingsRun(@Qualifier("greetingsEng") GreetingsEng greetingsEng2) {
        this.greetingsEng2 = greetingsEng2;
    }

    public void GreetingsEngRun() {

    }
    @PostConstruct
    public void init() {
        System.out.println("Construct");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("destroy");
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println(greetingsEng1.hello("Enes 1"));
        System.out.println(greetingsEng2.hello("Enes 2"));
        System.out.println(greetingsEng3.hello("Enes 3"));

    }

    public GreetingsEng getGreetingsEng3() {
        return greetingsEng3;
    }

    @Autowired

    public void setGreetingsEng3(@Qualifier("myGreetings2") GreetingsEng greetingsEng3) {
        this.greetingsEng3 = greetingsEng3;
    }
}
