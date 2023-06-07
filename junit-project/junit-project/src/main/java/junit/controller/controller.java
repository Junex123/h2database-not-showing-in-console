package junit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import junit.repository.repository;
import junitentity.model;

@Controller
public class controller {

	@Autowired
	private repository repos;

	@RequestMapping("/home")
	public String home() {
		return "home.jsp";
	}
	
	@RequestMapping("/addEntry")
	public String addUpdateJournalEntry(model model) {
		
		
		repos.save(model);
		
		return "home.jsp";
		
	}
	

	@RequestMapping("/getAllEntries")
	public ModelAndView getAllJournalEntries() {
		ModelAndView mv = new ModelAndView();
		
	
		List<model> entries = repos.findAll();
		
		mv.addObject("entries",entries);
		mv.setViewName("getAllEntries.jsp");
		
		return mv;
	}
	
	@RequestMapping("/getEntry")
	public ModelAndView getJournalEntry(@RequestParam int id) {
		ModelAndView mv = new ModelAndView();
		model journalEntry = repos.findById(id).orElse(new model());
		
		mv.addObject("entry", journalEntry);
		mv.setViewName("getEntry.jsp");
		
		return mv;
	}
	
	@RequestMapping("/deleteEntry")
	public String deleteJournalEntry(@RequestParam int id) {

		repos.deleteById(id);
		
		return "home.jsp";
	}
}
