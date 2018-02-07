package org.freda.cooper4.service.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.system.ApplicationPidFileWriter;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 *
 */
@SpringBootApplication
@EnableZuulProxy
public class Application
{
    public static void main(String[] args) throws Exception
    {
        SpringApplication springApplication = new SpringApplication(Application.class);

        springApplication.addListeners(new ApplicationPidFileWriter());

        springApplication.run(args);
    }
}
