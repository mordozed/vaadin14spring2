package org.vaadin.v14s2.backend.service;

import org.springframework.stereotype.Service;
import org.vaadin.v14s2.backend.entity.Company;
import org.vaadin.v14s2.backend.repository.CompanyRepository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class CompanyService {

    private CompanyRepository companyRepository;

    public CompanyService(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }

    public List<Company> findAll() {
        return companyRepository.findAll();
    }

}
