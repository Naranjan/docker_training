package com.sivalabs.bookmarker.domain;

import org.springframework.stereotype.Component;

@Component
public class BookmarkMapper {
	
	public BookmarkDTO toDTO(Bookmark bookmark) {
	BookmarkDTO bookmarkDTO = new BookmarkDTO();
	bookmarkDTO.setCreatedAt(bookmark.getCreatedAt());
	bookmarkDTO.setId(bookmark.getId());
	bookmarkDTO.setTitle(bookmark.getTitle());
	bookmarkDTO.setUrl(bookmark.getUrl());
	return bookmarkDTO;
	}
	
}
