package com.sap.tomthymeleaf;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller

public class DemoController {
  @RequestMapping(path = "/")
  public String index(){
    return "index";
  }

  @PostMapping("/save")
  public ModelAndView save(@ModelAttribute User user){
    ModelAndView modelAndView = new ModelAndView();
    modelAndView.addObject(user);
    modelAndView.setViewName("user-data");
    return modelAndView;
  }
}
