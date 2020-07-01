package com.test.service;

import org.springframework.stereotype.Service;

import com.test.data.TestDataRepository;

@Service
public class TestService {
	//A simple service class that resembles EJB implementations
	private TestDataRepository testDataRepository;
	
	public TestService(TestDataRepository testDataRepository) {
		super();
		this.testDataRepository = testDataRepository;
	}
	
	public int findMaxNumber() {
		int[] dataFromRepo = testDataRepository.retrieveAllData();
		int max = Integer.MIN_VALUE;

		for (int value : dataFromRepo) {
			if (value > max) {
				max = value;
			}
		}
		
		return max;
	}
}
