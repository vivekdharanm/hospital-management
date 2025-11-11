package com.example.HospitalManagement.hospital.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.HospitalManagement.hospital.model.Patient;
import com.example.HospitalManagement.hospital.repository.PatientRepository;

@Service
public class PatientService 
{
	@Autowired
	private PatientRepository patientRepository;
	
	public List<Patient> getAllPatients()
	{
		return patientRepository.findAll();
	}
	
	public Patient savePatient(Patient patient)
	{
		return patientRepository.save(patient);
	}
	
	public void deletePatient(Long id)
	{
		patientRepository.deleteById(id);
	}
	
	public Optional<Patient> getPatientById(Long id)
	{
		return patientRepository.findById(id);
	}

}
