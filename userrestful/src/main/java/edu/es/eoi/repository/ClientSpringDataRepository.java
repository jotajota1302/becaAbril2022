package edu.es.eoi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.es.eoi.entity.Cliente;

@Repository
public interface ClientSpringDataRepository extends JpaRepository<Cliente, String> {

}
