package org.vaadin.v14s2.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.vaadin.v14s2.backend.entity.Company;

@Repository
public interface CompanyRepository extends JpaRepository<Company, Long> {

}
