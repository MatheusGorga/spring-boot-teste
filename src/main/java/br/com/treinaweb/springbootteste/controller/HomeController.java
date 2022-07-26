package br.com.treinaweb.springbootteste.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class HomeController {

  @RequestMapping(name = "/", method = RequestMethod.GET)
  public String home(){
    return "home";
  }

  @GetMapping("/modelmap")
  public String home2(ModelMap modelMap){
    modelMap.addAttribute("name", "Gorga");
    return "home";
  }

  @GetMapping("/modelandview")
  public ModelAndView home3(){
    var modelAndView = new ModelAndView("home");
    modelAndView.addObject("name", "Matheus");
    return modelAndView;
  }

}
