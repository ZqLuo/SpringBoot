package com.example.controller;

import com.example.entity.Person;
import com.example.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
public class PersonController {

    @Autowired
    private PersonService personService;

    @RequestMapping("/index")
    public String getPersonList(Model model){
        Person single = new Person("aa",11);
        List<Person> people = personService.getPersonList();
        model.addAttribute("singlePerson",single);
        model.addAttribute("people",people);
        return "index";
    }

}
