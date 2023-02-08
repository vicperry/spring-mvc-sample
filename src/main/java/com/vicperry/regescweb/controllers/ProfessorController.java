package com.vicperry.regescweb.controllers;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.vicperry.regescweb.models.Professor;
import com.vicperry.regescweb.models.StatusProfessor;
import com.vicperry.regescweb.repositories.ProfessorRepository;

@Controller
public class ProfessorController {
	@Autowired
	private ProfessorRepository professorRepository;
	
	@GetMapping("/professores")
	public ModelAndView index() {
		//Professor xavier = new Professor("Xavier", new BigDecimal(5000.0), StatusProfessor.ATIVO);
		//xavier.setId(1L);
		//Professor scott = new Professor("Scott", new BigDecimal(3000.0), StatusProfessor.ATIVO);
		//scott.setId(2L);
		//Professor logan = new Professor("Logan", new BigDecimal(2000.0), StatusProfessor.INATIVO);
		//logan.setId(3L);
		
		List<Professor> professores = professorRepository.findAll();//Arrays.asList(xavier, scott, logan);
		
		ModelAndView mv = new ModelAndView("professores/index");
		mv.addObject("professores", professores);
		
		return mv;
	}
	
	@GetMapping("/professor/new")
	public ModelAndView nnew() {
		ModelAndView mv = new ModelAndView("professores/new");
		mv.addObject("statusProfessor", StatusProfessor.values());
		return mv;
	}
}
