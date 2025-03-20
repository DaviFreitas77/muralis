package com.comercio.comercio.service;

import org.springframework.stereotype.Service;
import com.comercio.comercio.repository.ClienteRepository;
import java.util.List;
import com.comercio.comercio.entity.Cliente;

@Service
public class ClienteService {

    private ClienteRepository clienteRepository;

    public ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    public Cliente create(Cliente cliente) {
        return clienteRepository.save(cliente);

    }

    public List<Cliente> list() {
        return clienteRepository.findAll();
    }

    public List<Cliente> update(Cliente cliente) {
        clienteRepository.save(cliente);
        return list();
    }

    public List<Cliente> delete(Cliente cliente) {
        clienteRepository.deleteById(cliente.getId());
        return list();
    }
}
