package com.test.data;

import org.springframework.stereotype.Repository;

@Repository
public class TestDataRepository {
	//A simple data class that has similarity to JPA/Hibernate
	public int[] retrieveAllData() {
		return new int[] {1, 2, 3, 4, 5};
	}
}
