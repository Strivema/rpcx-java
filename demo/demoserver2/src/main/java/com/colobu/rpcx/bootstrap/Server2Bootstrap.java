package com.colobu.rpcx.bootstrap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author goodjava@qq.com
 */
@EnableAutoConfiguration
@ComponentScan(basePackages = {"com.colobu.rpcx"})
@RestController
public class Server2Bootstrap {

    private static final Logger logger = LoggerFactory.getLogger(Server2Bootstrap.class);

    public static void main(String... args) {
        logger.info("Server2Bootstrap start");
        try {
            SpringApplication.run(Server2Bootstrap.class, args);
        } catch (Throwable ex) {
            logger.error(ex.getMessage(), ex);
            System.exit(0);
        }
    }

}
