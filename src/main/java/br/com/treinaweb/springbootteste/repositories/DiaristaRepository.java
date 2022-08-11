package br.com.treinaweb.springbootteste.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.treinaweb.springbootteste.models.Diarista;

public interface DiaristaRepository extends JpaRepository< Diarista, Long > {
  
}
