package com.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/Books")
public class IBookController {
	@Autowired
	private IBookServiceImpl ibs;
	
	
	@PostMapping(value="/save")
	public String save(@RequestBody Book b) {
		return ibs.save(b);
	}
	@GetMapping(value="/findall")
	public List<Book> findall() {
		return ibs.findall();
	}

}
