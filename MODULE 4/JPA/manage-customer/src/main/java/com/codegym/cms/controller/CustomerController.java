package com.codegym.cms.controller;

import com.codegym.cms.model.Customer;
import com.codegym.cms.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class CustomerController {
    @Autowired
    private ICustomerService customerService;

    @GetMapping("/create-customer")
    public ModelAndView showCreateForm() {
        ModelAndView modelAndView = new ModelAndView("/create");
        modelAndView.addObject("huy", new Customer());
        //mới 1 new ví dụ như: new Customer("Văn",23,"Huế")
        return modelAndView;
    }

    @PostMapping("/create-customer")

    public ModelAndView saveCustomer(@ModelAttribute("huy") Customer customer) {
        customerService.save(customer);
        ModelAndView modelAndView = new ModelAndView("/create");
        modelAndView.addObject("huy", customer);
        modelAndView.addObject("message", "New customer created successfully");
        return modelAndView;
    }
    @GetMapping("/customers")
    public ModelAndView listCustomers() {
        List<Customer> customers = customerService.findAll();
        ModelAndView modelAndView = new ModelAndView("/list");
        modelAndView.addObject("customers", customers);
        return modelAndView;
    }
}
