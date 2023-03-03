package com.example.demo.GroceryController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.GroceryService.GroceryService;
import com.example.demo.GroceryEntity.GroceryEntity;
@RestController

public class GroceryController {
	@Autowired
	GroceryService stuSer;
	@PostMapping("/add")
	public GroceryEntity addInfo( @RequestBody GroceryEntity st) {
		return stuSer.saveDetails(st);
	}
	@GetMapping("/show")
	public List<GroceryEntity> fetchDetails()
	{
		return stuSer.getDetails();
	}
	@PutMapping("/Update")
	public GroceryEntity updateInfo(@RequestBody GroceryEntity st1)
	{
		return stuSer.updateDetails(st1);
	}
	@DeleteMapping("/delete/{sid}")
	public String deleteInfo(@PathVariable("sid") int sid){
	stuSer.deleteDetails(sid);
	return "Deleted details";
	}
	//sorting
	@GetMapping("/product/{field}")
	public List<GroceryEntity> getWithSort(@PathVariable String field) {
	return stuSer.getSorted(field);
			}

	// pagination
	@GetMapping("/u/{offset}/{pageSize}")
	public List<GroceryEntity> productsWithPagination(@PathVariable int offset, @PathVariable int pageSize) {
	return stuSer.getWithPagination(offset, pageSize);
			}
	
	
}


	