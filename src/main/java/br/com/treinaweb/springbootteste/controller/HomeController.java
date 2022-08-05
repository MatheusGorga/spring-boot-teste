package br.com.treinaweb.springbootteste.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class HomeController {

  @RequestMapping(name = "/", method = RequestMethod.GET)
  public String home(){
    return "home";
  }
}
