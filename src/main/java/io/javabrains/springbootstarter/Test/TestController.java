package io.javabrains.springbootstarter.Test;

import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public class TestController {
    @GetMapping("/Test")
    public List<Test> getAllTests(){
        return TestService.getAllTest();
    }
}
