package guru.springframework;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GreetingTest {
    Greeting greeting;

    @BeforeAll
    static void beforeClass() {
        System.out.println("@BeforeAll - I am only called once...");
    }
   
    @BeforeEach
    void setUp() {
        System.out.println("In @BeforeEach...");
        greeting = new Greeting();
    }

    @Test
    void testHelloWorld() {
        System.out.println(greeting.helloWorld());
    }

    @Test
    void testHelloWorld2() {
        System.out.println(greeting.helloWorld("John"));
    }

    @AfterEach
    void tearDown() {
        System.out.println("In @AfterEach...");
    }

    @AfterAll
    static void afterClass() {
        System.out.println("@AfterAll - I am only called once...");
    }
}
