package com.sivalabs.bookmarker.domain;

import java.awt.print.Pageable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import lombok.RequiredArgsConstructor;

@Service
@Transactional
@RequiredArgsConstructor
public class BookmarkService {

	@Autowired
	private BookmarkRepository repository ;
	
	@Autowired
	private BookmarkMapper bookmarkMapper;
	
	@Transactional(readOnly = true)
	public BookmarksDTO getBookmarks(Integer page){
		int pageNo = page < 1 ? 0 : page -1;
		PageRequest pageable  = PageRequest.of(pageNo, 2, Sort.Direction.DESC,"createdAt");
		Page<BookmarkDTO> bookMarkPage = repository.findAll(pageable).map(bookmarkMapper::toDTO);
		return new BookmarksDTO(bookMarkPage);
	}
	
}
