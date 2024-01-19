package com.sivalabs.bookmarker;

import java.time.Instant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.sivalabs.bookmarker.domain.Bookmark;
import com.sivalabs.bookmarker.domain.BookmarkRepository;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class DataInitializer implements CommandLineRunner {

	@Autowired
	private BookmarkRepository repository;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
//		repository.save(new Bookmark(null,"SivaLabs","https://sivalabs.in", Instant.now()));
//		repository.save(new Bookmark(null,"SpringBlog","https://spring.io/blog", Instant.now()));
//		repository.save(new Bookmark(null,"Quarkus","https://quarkus.io/", Instant.now()));
//		repository.save(new Bookmark(null,"Micronaut","https://micronaut.io/", Instant.now()));
//		repository.save(new Bookmark(null,"JOOQ","https://www.jooq.org/", Instant.now()));
//		repository.save(new Bookmark(null,"Kubernetes Docs","https://kubernetes.io/docs/home/", Instant.now()));
//		repository.save(new Bookmark(null,"ExpressJs","https://expressjs.com/", Instant.now()));
//		repository.save(new Bookmark(null,"DZone","https://dzone.com/", Instant.now()));
	}

}
