package com.comercio.comercio.service;

import org.springframework.stereotype.Service;

import com.comercio.comercio.repository.ContatoRepository;

import java.util.List;

import com.comercio.comercio.entity.Contato;

@Service
public class ContatoService {

    private ContatoRepository contatoRepository;

    public ContatoService(ContatoRepository contatoRepository) {
        this.contatoRepository = contatoRepository;
    }

    public Contato create(Contato contato) {
        return contatoRepository.save(contato);
    }

    public List<Contato> list() {
        return contatoRepository.findAll();
    }

    public List<Contato> update(Contato contato) {
        contatoRepository.save(contato);
        return list();
    }

    public List<Contato> delete(Long id) {
        contatoRepository.deleteById(id);
        return list(); 
    }

}
