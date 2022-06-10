package edu.es.eoi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.es.eoi.entity.Stats;

public interface StatsRepository extends JpaRepository<Stats, Integer>{

}
