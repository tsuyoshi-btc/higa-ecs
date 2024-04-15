// src/main/java/com/example/exptapprunnerspringboot/Application.java

package org.example;


// import java.util.logging.Logger;
// import java.util.logging.Handler;
// import java.util.logging.ConsoleHandler;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
public class Application {

    public static void main(String[] args) {
        System.out.println("hello");

        // Logger logger = Logger.getLogger("logger");
        // Handler handler = new ConsoleHandler();

        
    }

}