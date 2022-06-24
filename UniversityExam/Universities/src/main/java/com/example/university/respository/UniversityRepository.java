package com.example.university.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.university.entity.UniversityDetails;

public interface UniversityRepository extends JpaRepository<UniversityDetails, Integer>{

}
