package com.programoo.myapi;

import static org.junit.jupiter.api.Assertions.assertNotNull;

//src/test/java/com/example/demo/HelloServiceIntegrationTest.java

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.programoo.myapi.controller.HelloController;

@SpringBootTest
class HelloServiceIntegrationTest {

 @Autowired
 private HelloController helloService;

 @Test
 void contextLoads() {
     assertNotNull(helloService);
 }

 @Test
 void greetShouldReturnExpectedValue() {
     assertEquals("Hello, world!", helloService.hello().get("message"));
 }
}
