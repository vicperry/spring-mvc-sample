package com.vicperry.regescweb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vicperry.regescweb.models.Professor;

@Repository
public interface ProfessorRepository extends JpaRepository<Professor, Long> {

}
