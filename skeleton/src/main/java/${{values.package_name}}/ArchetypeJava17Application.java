package ${{values.java_package_name}};

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ArchetypeJava17Application {

    public static void main(String[] args) {
        SpringApplication.run(ArchetypeJava17Application.class, args);
    }

}