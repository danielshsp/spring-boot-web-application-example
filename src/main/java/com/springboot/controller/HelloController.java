package com.springboot.controller;

import com.springboot.domain.Customer;
import net.sourceforge.tess4j.TesseractException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {

   @Autowired
   Customer customer;

   @RequestMapping("/")
   public String index(Model model) throws TesseractException {
      customer.setCustomerId(customer.getCustomerId());
      model.addAttribute("Customer", customer);
      return "index";
   }

   @PostMapping("/hello")
   public String sayHello(@RequestParam("customerId") String name, Model model) {
      model.addAttribute("name", name);
      return "hello";
   }
}
