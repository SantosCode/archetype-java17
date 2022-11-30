package ${{values.java_package_name}}.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApplicationResource {

    @GetMapping(path = "/hello")
    public String getHello() {
        return "Hello World";
    }
}
