package com.devsuperior.challenge3.dto;

import com.devsuperior.challenge3.entities.Client;

import java.time.LocalDate;

public class ClientDTO {

    private Long id;
    private String name;
    private String cpf;
    private Double income;
    private LocalDate birthdate;
    private Integer children;

    public ClientDTO(Long id, String name, String cpf, Double income, LocalDate birthdate, Integer children) {
        this.id = id;
        this.name = name;
        this.cpf = cpf;
        this.income = income;
        this.birthdate = birthdate;
        this.children = children;
    }

    public ClientDTO(Client entity) {
        id = entity.getId();
        name = entity.getName();
        cpf = entity.getCpf();
        income = entity.getIncome();
        birthdate = entity.getBirthdate();
        children = entity.getChildren();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCpf() {
        return cpf;
    }

    public Double getIncome() {
        return income;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public Integer getChildren() {
        return children;
    }
}
