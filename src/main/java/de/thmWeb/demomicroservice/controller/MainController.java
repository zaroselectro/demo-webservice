package de.thmWeb.demomicroservice.controller;

import de.thmWeb.demomicroservice.domain.BaseCredentials;
import de.thmWeb.demomicroservice.domain.Person;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class MainController {

    private final String credentialUsername;
    private final String credentialPassword;

    public MainController(@Value("${credentials.username}") String credentialUsername, @Value("${credentials.password}") String credentialPassword) {
        this.credentialUsername = credentialUsername;
        this.credentialPassword = credentialPassword;
        
    }

    @GetMapping("/person-with-credentials")
    public Person getPersonWithCredentials() {
        final Person person = new Person();
        person.setIdx(UUID.randomUUID().toString());
        person.setEmail("person1@foobar.de");

        final BaseCredentials credentials = new BaseCredentials();
        credentials.setUsername(credentialUsername);
        credentials.setPassword(credentialPassword);

        person.setCredentials(credentials);

        return person;
    }
}
