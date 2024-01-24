package com.example.demo1.controller;

import com.example.demo1.model.Product;
import com.example.demo1.service.IproductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@Controller
@RequestMapping("/products")
public class ProductController {
    @Autowired
    private IproductService iStudentService;

    //show
    @GetMapping("")
    public ModelAndView home(){
        ModelAndView modelAndView = new ModelAndView("/home");
        modelAndView.addObject("Home", iStudentService.findAll());
        return modelAndView;
    }

    //create
    @GetMapping("/create")
    public ModelAndView showCreate(){
        ModelAndView modelAndView = new ModelAndView("/create");
        modelAndView.addObject("add",new Product());
        return modelAndView;
    }
//save
    @PostMapping("/save")
    public ModelAndView Create(@Valid Product student){
        ModelAndView modelAndView = new ModelAndView("redirect:/products");
        iStudentService.save(student);
        return modelAndView;
    }
    //form delete
    @GetMapping("{id}/delete")
    public String showDelete(@PathVariable Long id){
        iStudentService.delete(id);
        return "redirect:/products";
    }

    //form update
    @GetMapping("/{id}/edit")
    public ModelAndView showEdit(@PathVariable Long id){
        ModelAndView modelAndView = new ModelAndView("/update");
        modelAndView.addObject("update", iStudentService.findById(id).get());
        return modelAndView;
    }
    @PostMapping("/edit")
    public String editStudent(@ModelAttribute Product student) {
        iStudentService.edit( student);
        return "redirect:/products";
    }

}
