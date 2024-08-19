package br.com.ballexca.algafood.api;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/application")
public class ApplicationController {

    @Value("${email.port}")
    private String emailPort;

    @Value("${email.host.url}")
    private String emailURL;

    @GetMapping(value = "/hello", produces = MediaType.TEXT_PLAIN_VALUE)
    public String sayHello() {

        return "Email Port: " + emailPort + "/n" +
               "Email Host URL: " + emailURL + "/n";
    }
}
