package com.project.clinic.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.clinic.entity.Patient;
import com.project.clinic.repository.PatientRepository;

@Service
public class PatientService {
	
	@Autowired
	private PatientRepository prepo;
	
	public void addPatient(Patient p) {
		prepo.save(p);
	}
	
	public List<Patient> getAllPatient() {
		return prepo.findAll();
	}
	
	public Patient getPatientById(String pid) {
		Optional<Patient> p= prepo.findById(pid);
		if(p.isPresent()) {
			return p.get();
		}
		return null;
	}
	
	public void deletePatient(String pid) {
		prepo.deleteById(pid);
	}
}
