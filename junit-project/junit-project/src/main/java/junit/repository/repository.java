package junit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import junitentity.model;

public interface repository extends JpaRepository<model,Integer>{

}
