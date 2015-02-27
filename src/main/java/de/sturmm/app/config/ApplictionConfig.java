package de.sturmm.app.config;

import de.sturmm.app.rest.HelloWorldController;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Created by sturmm on 27.02.15.
 */
@Configuration
@EnableWebMvc
@EnableAutoConfiguration
@ComponentScan(basePackageClasses = HelloWorldController.class)
public class ApplictionConfig {

}
