package org.vaadin.v14s2.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.vaadin.v14s2.backend.entity.Contact;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Long> {

}
