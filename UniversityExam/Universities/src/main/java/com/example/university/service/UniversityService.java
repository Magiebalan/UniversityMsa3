package com.example.university.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.university.entity.UniversityDetails;
import com.example.university.respository.UniversityRepository;

@Service
	public class UniversityService {

		@Autowired
		private UniversityRepository repository;

		// to add the College
		public UniversityDetails addCollege(UniversityDetails College) {
			return repository.save(College);
		}

		// to get the College based on his id
		public UniversityDetails getCollegeById(int id) {
			return repository.findById(id).orElse(null);
		}

		// to get all the Colleges
		public List<UniversityDetails> getAllColleges() {
			return repository.findAll();
		}		

		// to edit the College
		public UniversityDetails editCollege(UniversityDetails College) {
			UniversityDetails ExistingCollege = repository.findById(College.getId()).orElse(null);
			ExistingCollege.setName(College.getName());
			return repository.save(ExistingCollege);
		}

		// to delete the College
		public String deleteCollege(int id) {
			repository.deleteById(id);
			return "College deleted";
		}

	}
