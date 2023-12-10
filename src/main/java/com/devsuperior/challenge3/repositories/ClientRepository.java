package com.devsuperior.challenge3.repositories;

import com.devsuperior.challenge3.entities.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;


public interface ClientRepository extends JpaRepository<Client, Long> {
}
