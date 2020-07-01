package com.test.mockito;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import static org.mockito.Mockito.when;
import static org.junit.Assert.assertEquals;

import com.test.data.TestDataRepository;
import com.test.service.TestService;

@RunWith(MockitoJUnitRunner.class)
public class MockitoTest {
	@Mock
	private TestDataRepository testDataRepository;
	
	@InjectMocks
	private TestService testService;
	
	@Test
	public void testFindTheMaxFromAllData() {
		when(testDataRepository.retrieveAllData()).thenReturn(new int[] { 24, 15, 3 });
		assertEquals(24, testService.findMaxNumber());
	}
	
	@Test
	public void testFindTheMaxFromAllData_ForOneValue() {
		when(testDataRepository.retrieveAllData()).thenReturn(new int[] { 15 });
		assertEquals(15, testService.findMaxNumber());
	}

	@Test
	public void testFindTheMaxFromAllData_NoValues() {
		when(testDataRepository.retrieveAllData()).thenReturn(new int[] {});
		assertEquals(Integer.MIN_VALUE, testService.findMaxNumber());
	}
}
