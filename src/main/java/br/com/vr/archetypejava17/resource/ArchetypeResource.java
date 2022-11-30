package br.com.vr.archetypejava17.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ArchetypeResource {

    @GetMapping(path = "/hello")
    public String getHello() {
        return "Hello World";
    }
}
