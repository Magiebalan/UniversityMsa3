package com.example.university.CollegeController;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus.Series;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.university.entity.UniversityDetails;

@RestController
public class CollegeController {
	
	@Autowired
	private Completionserv serv;
	
	@GetMapping("/colleges/{id}")
	public UniversityDetails getcollegeById(@PathVariable int id) {
		serv.getcollegeById(id);
		return null;	
	}
	
	@GetMapping("/colleges")
	public List<UniversityDetails> getcolleges(){
		return serv.getAllcolleges();
	}
	
	@PostMapping("/colleges")
	public UniversityDetails savecolleges(@RequestBody UniversityDetails colleges) {	
		return serv.addcolleges(colleges);	
	}
	
	@PutMapping("/colleges")
	public UniversityDetails editcolleges(@RequestBody UniversityDetails colleges) {
		return serv.editcolleges(colleges);
	}
	
	@DeleteMapping("/colleges/{id}")
	public String deletecolleges(@PathVariable int id) {
		return serv.deletecolleges(id);
	}
}

