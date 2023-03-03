package com.example.demo.GroceryRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.GroceryEntity.GroceryEntity;
@Repository
public interface GroceryRepository extends JpaRepository<GroceryEntity,Integer>
{
}
