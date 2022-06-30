package com.example.ex7;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
public class RestController {

    @ResponseBody
    @GetMapping("/api/pairs/{name}")
    public NamedPairs showDetails(@PathVariable String name) {

        return NamedPairs.builder().firstName(name).pairs(Map.of()).build();
    }
}
