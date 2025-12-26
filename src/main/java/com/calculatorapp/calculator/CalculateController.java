package com.calculatorapp.calculator;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/api")
public class CalculateController {

    CalculateService ref;

    @Autowired
    public CalculateController(CalculateService ref) {
        this.ref = ref;
    }

    @GetMapping("/index")
    String index() {
        return "index";
    }


    @PostMapping("/calculate")
    public String calculate(@RequestParam double num1,@RequestParam double num2,@RequestParam String operation ,Model model) {

        double result;
        switch (operation) {
            case "add":
                result = ref.add(num1,num2);
                model.addAttribute("result", result);
                break;
            case "subtract":
                result = ref.subtract(num1, num2);
                model.addAttribute("result",result);
                break;
            case "multiply":
                result = ref.multiply(num1, num2);
                model.addAttribute("result", result);
                break;
            case "divide":
                result = ref.divide(num1, num2);
                model.addAttribute("result", result);
                break;
            default:
                String message = "Invalid Operation";
                model.addAttribute("result", message);
        }
        return  "result";
    }
}
