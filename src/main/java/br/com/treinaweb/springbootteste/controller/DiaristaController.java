package br.com.treinaweb.springbootteste.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.treinaweb.springbootteste.repositories.DiaristaRepository;

@Controller
@RequestMapping("/diaristas")
public class DiaristaController {

  @Autowired
  private DiaristaRepository repository;

  @GetMapping
  public ModelAndView buscarTodos(){
      var modelAndView = new ModelAndView("Listar_diaristas");
      modelAndView.addObject("diaristas", repository.findAll());
      return modelAndView;
    }

}
