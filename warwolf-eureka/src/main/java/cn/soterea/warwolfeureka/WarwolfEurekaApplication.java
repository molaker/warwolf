package cn.soterea.warwolfeureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class WarwolfEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(WarwolfEurekaApplication.class, args);
    }

}
