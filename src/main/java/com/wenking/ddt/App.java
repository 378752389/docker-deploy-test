package com.wenking.ddt;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;

@SpringBootApplication
@RestController
public class App {

    @Value("${spring.application.name}")
    private String projectName;



    @GetMapping("/")
    public String info() throws UnknownHostException {
        InetAddress addr = InetAddress.getLocalHost();
        String hostAddress = addr.getHostAddress();
        String hostName = addr.getHostName();

        return "this is " + projectName+ "; hostname: " + hostName + ", address: " + hostAddress;
    }

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
