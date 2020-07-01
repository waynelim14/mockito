package com.test.controller;

import org.junit.Before;
import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

public class HelloWorldControllerTest {

	private MockMvc mockMvc;
	
	@Before
    public void setup() {
        this.mockMvc = MockMvcBuilders.standaloneSetup(new HelloWorldController()).build();
    }
	
	@Test
	public void helloWorldWithName_StatusOk() throws Exception {
		this.mockMvc.perform(
				get("/hello/{player}", "Wayne")
					.sessionAttr("JSESSIONID", "63b0e69f0a2ba27da356e93417254d7d"))
				.andExpect(status().isOk())
				.andExpect(content().string("Hello, Wayne"));
	}

}
