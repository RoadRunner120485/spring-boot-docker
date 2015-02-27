package de.sturmm.app;

import de.sturmm.app.config.ApplictionConfig;
import org.springframework.boot.SpringApplication;

/**
 * Created by sturmm on 27.02.15.
 */
public class App {

    public static void main(String[] args) {
        SpringApplication.run(ApplictionConfig.class, args);
    }

}
