package cn.soterea.warwolf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class WarwolfApplication {

    @RequestMapping(value = "/hello")
    public String greetiong() {
        return "hello moto!";

    }

    public static void main(String[] args) {
        SpringApplication.run(WarwolfApplication.class, args);
    }

}
