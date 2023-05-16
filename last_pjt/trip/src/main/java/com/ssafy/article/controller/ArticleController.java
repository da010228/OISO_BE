package com.ssafy.article.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ssafy.article.model.Article;
import com.ssafy.article.model.service.ArticleService;

@RestController
@RequestMapping("/article")
public class ArticleController {
	
	private ArticleService service;

	public ArticleController(ArticleService service) {
		super();
		this.service = service;
	}

	@GetMapping("/board")
	public List<Article> getBoardList() throws Exception {
		List<Article> list = service.getBoardList();
		return list;
	}
	@GetMapping("/board/{articleNo}")
	public Article getBoard(@PathVariable int articleNo) throws Exception {
		Article board = service.getBoard(articleNo);
		return board;
	}
	@PutMapping("/board/{articleNo}")
	int putBoard(@RequestBody Article article) throws Exception {
		int cnt = service.putBoard(article);
		return cnt;
	}
	
	
	
	
//	int delBoard(@PathVariable int articleNo) throws Exception;
//	int postBoard(@PathVariable Article article) throws Exception;
	
}
