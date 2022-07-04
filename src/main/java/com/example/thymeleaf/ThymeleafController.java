package com.example.thymeleaf;

import com.example.exceptions.SdaException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@Controller

public class ThymeleafController {
    @GetMapping("/hello")
    public String helloWorld(ModelMap model){
        model.addAttribute("var","Ioana are pere");
        List<String> list = List.of("Ana","are", "mere");
        model.addAttribute("listKey",list);
        return "/helloPage";
    }

    @GetMapping("/formUrl")
    public String showForm(Model model){
        model.addAttribute("formObject", new FormObject());
        return "formHtml";
    }

    @PostMapping("/formUrl")
    public String showForm(@Valid @ModelAttribute("formObject") FormObject form, Errors errors, Model model) {
        if(errors.hasErrors()){
            System.out.println("Am errori");
        }else {
            System.out.println(form);
        }
        model.addAttribute("formObject", form);
        return "formHtml";
    }

    @GetMapping("/boom")
    public String shouldThrow() {
        throw new SdaException("Boom...");
    }
}
