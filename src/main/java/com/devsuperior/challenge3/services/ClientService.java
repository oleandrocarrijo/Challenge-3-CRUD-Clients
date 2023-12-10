package com.devsuperior.challenge3.services;

import com.devsuperior.challenge3.dto.ClientDTO;
import com.devsuperior.challenge3.entities.Client;
import com.devsuperior.challenge3.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ClientService {

    @Autowired
    private ClientRepository repository;

    @Transactional(readOnly = true)
    public ClientDTO findById(Long id) {
        Client client = repository.findById(id).get();
        return new ClientDTO(client);
    }

}
