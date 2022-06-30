package com.thecitiprj.cicd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class TheCitizenPrjBackendApplication {

    @GetMapping("/welcome")
    public String welcome()
    {
        return "welcome to the citizen prj!";
    }

//    echo "# theCitiPrj_backend" >> README.md
//    git init
//    git add README.md
//    git commit -m "first commit"
//    git branch -M main
//    git remote add origin https://github.com/roujrouee/theCitiPrj_backend.git
//    git push -u origin main

    public static void main(String[] args) {
        SpringApplication.run(TheCitizenPrjBackendApplication.class, args);
    }

}
