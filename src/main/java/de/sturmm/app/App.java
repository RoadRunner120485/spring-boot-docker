package de.sturmm.app;

import de.sturmm.app.config.ApplicationConfig;
import org.springframework.boot.SpringApplication;

/**
 * Created by sturmm on 27.02.15.
 */
public class App {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationConfig.class, args);
    }

}
