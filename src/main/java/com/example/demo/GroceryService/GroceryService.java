package com.example.demo.GroceryService;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.data.domain.Page;
import com.example.demo.GroceryEntity.GroceryEntity;
import com.example.demo.GroceryRepository.GroceryRepository;
@Service

public class GroceryService 

	{
		@Autowired(required=true)
		GroceryRepository stRepo;
		
		public GroceryEntity saveDetails(GroceryEntity e)
		{
			return stRepo.save(e);
		}
		public List<GroceryEntity> getDetails()
		{
			return stRepo.findAll();
		}
		public GroceryEntity updateDetails(GroceryEntity e1)
		{
			return stRepo.saveAndFlush(e1);
		}
		public void deleteDetails(int id)
		{
			stRepo.deleteById(id);
		}
		public List<GroceryEntity> getSorted(String field)
		{
			return stRepo.findAll(Sort.by(Sort.Direction.ASC,field));
		}
		public List<GroceryEntity> getWithPagination(@PathVariable int offset, @PathVariable int pageSize) {
			Page<GroceryEntity> page =stRepo.findAll(PageRequest.of(offset, pageSize));
			return page.getContent();
		}   
		
	}