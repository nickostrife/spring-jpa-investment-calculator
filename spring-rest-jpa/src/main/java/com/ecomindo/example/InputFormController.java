package com.ecomindo.example;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InputFormController {
	private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping(value="/greeting")
    public InputForm inputForm(@RequestParam(value="name", defaultValue="World") String name) {
        return new InputForm(counter.incrementAndGet(),
                            String.format(template, name), null, null);
    }
}
