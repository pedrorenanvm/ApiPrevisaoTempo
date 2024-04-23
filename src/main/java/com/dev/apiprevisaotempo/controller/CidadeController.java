package com.dev.apiprevisaotempo.controller;

import com.dev.apiprevisaotempo.entity.Cidade;
import com.dev.apiprevisaotempo.repository.CidadeRepository;
import com.dev.apiprevisaotempo.service.LocalidadeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CidadeController {

    @Autowired
    private LocalidadeService localidadeService;

    @Autowired
    private CidadeRepository cidadeRepository;

    @GetMapping("/buscar-cidades")
    public ResponseEntity buscarCidades(@RequestParam String nomeCidade) {
        Cidade[] cidades = localidadeService.buscarCidades(nomeCidade);
        for (Cidade cidade : cidades) {
            cidadeRepository.insert(cidade);
        }
        return ResponseEntity.ok().build();
    }
}
