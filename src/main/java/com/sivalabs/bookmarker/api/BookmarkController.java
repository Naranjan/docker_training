package com.sivalabs.bookmarker.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sivalabs.bookmarker.domain.BookmarkService;
import com.sivalabs.bookmarker.domain.BookmarksDTO;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/bookmarks")
@RequiredArgsConstructor
public class BookmarkController {

	@Autowired
	private  BookmarkService bookmarkService;

	@GetMapping
	public BookmarksDTO getBookmarks(@RequestParam(name = "page", defaultValue = "1") Integer page) {
		
		return bookmarkService.getBookmarks(page);
	}
}
