package com.fma.Fleet.Management.Api;

import com.fma.Fleet.Management.Api.repositories.TaxisRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
//permite realizar pruebas de controladores sin necesidad de desplegar la aplicación
// en un servidor web real.

class FleetManagementApiApplicationTests {

	@Autowired
	private MockMvc mockMvc;
	//@Autowired
	//private TaxisRepository taxisRepository;

	@Test
	@DisplayName("Probando mi primer endpoint de Taxis")
	void TestTaxis() throws Exception {
		mockMvc.perform(get("/taxis/list?page=0&size=10"))
				.andExpect(status().isOk())
				.andExpect(jsonPath("$.content").exists());
	}

}
