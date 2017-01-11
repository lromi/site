package com.lromi.controller;

import com.lromi.domains.Factor;
import com.lromi.domains.Scenario;
import com.lromi.services.FactorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by lromi on 23.11.2016.
 */
@Controller
public class ScenarioController {

//    @RequestMapping("/greeting")
//    public String greeting(@RequestParam(value = "name", required = false, defaultValue = "World") String name, Model model) {
//        model.addAttribute("name", name);
//        return "greeting";
//    }

    @Autowired
    FactorService factorService;
    @RequestMapping(value= "/greeting", method = RequestMethod.GET)
    public String getAllFactors(Model model) {
        List<Factor> factors = factorService.getAll();
        model.addAttribute("factors", factors);
        return "greeting";
    }
    @RequestMapping(value= "/hello", method = RequestMethod.GET)
    public String  hello(Model model) {
        return "hello";
    }

    @RequestMapping(value= "/factors/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Factor getFactor(@PathVariable("id") long id) {
        return factorService.getByID(id);
    }
    
     @RequestMapping(value= "/factors", method = RequestMethod.GET)
    @ResponseBody
    public List<Factor> getFactors() {
        return factorService.getAll();
    }



}
