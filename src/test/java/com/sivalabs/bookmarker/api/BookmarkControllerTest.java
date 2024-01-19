package com.sivalabs.bookmarker.api;

import org.hamcrest.CoreMatchers;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
public class BookmarkControllerTest {

	@Autowired
	private MockMvc mockMvc ;
	
	@ParameterizedTest
	@CsvSource({
		"1,8,4,1,true,false,true,false",
		"2,8,4,2,false,false,true,false",
		"3,8,4,3,false,false,true,false",
		"4,8,4,4,false,true,false,true"

	})
	void shoudGetBookmarks(int pageNo, int totalElements, int totalPages, int currentPage, boolean isFirst, 
			boolean isLast, boolean hasNext, boolean hasPrevious) throws Exception {
		mockMvc.perform(MockMvcRequestBuilders.get("/api/bookmarks?page="+pageNo))
				.andExpect(MockMvcResultMatchers.status().isOk())
				.andExpect(MockMvcResultMatchers.jsonPath("$.totalElements",CoreMatchers.equalTo(totalElements)))
				.andExpect(MockMvcResultMatchers.jsonPath("$.totalPages",CoreMatchers.equalTo(totalPages)))
				.andExpect(MockMvcResultMatchers.jsonPath("$.currentPage",CoreMatchers.equalTo(currentPage)))
				.andExpect(MockMvcResultMatchers.jsonPath("$.isFirst",CoreMatchers.equalTo(isFirst)))
				.andExpect(MockMvcResultMatchers.jsonPath("$.isLast",CoreMatchers.equalTo(isLast)))
				.andExpect(MockMvcResultMatchers.jsonPath("$.hasNext",CoreMatchers.equalTo(hasNext)))
				.andExpect(MockMvcResultMatchers.jsonPath("$.hasNext",CoreMatchers.equalTo(hasNext)))
				;
				
		
	}
}
