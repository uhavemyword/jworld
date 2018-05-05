package com.cp.jworld.controller;

import com.cp.jworld.model.Favorite;
import com.cp.jworld.model.User;
import com.cp.jworld.service.FavoriteService;
import com.cp.jworld.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/rest/favorites")
public class FavoriteController {

	@Autowired
	private FavoriteService service;

	@GetMapping("/all")
	public List<Favorite> getAll() {
		return this.service.getAll();
	}

	@GetMapping("/insert")
	public List<Favorite> insert() {
		Favorite favorite = new Favorite();
		favorite.setName("test1");
		favorite.setUrl("xxxx");

		this.service.insert(favorite);
		return this.service.getAll();
	}
}
