package com.starter.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Component;

import com.starter.model.Product;
import com.starter.repository.ProductRepository;

@Component
public class AppRunner implements CommandLineRunner {

	@Autowired
	private ProductRepository repo;
	@Override
	public void run(String... args) throws Exception {

		/*findAll()*/
//		List<Product> list = repo.findAll();
//		list.forEach(System.out::println);
		
		/*findAll(Sort)*/
//		repo.findAll(Sort.by(Direction.DESC, "prodCode")).forEach(System.out::println);
		
		/*findAll(Pageable)*/
//		PageRequest p = PageRequest.of(1, 3);
//		repo.findAll(p).forEach(System.out::println);
		
		/*findAll(Example)*/
		Product pod = new Product();
		pod.setProdCost(8.8);
		Example<Product> ex = Example.of(pod);
//		repo.findAll(ex).forEach(System.out::println);
//		repo.findAll(ex,PageRequest.of(1, 2)).forEach(System.out::println);
		repo.findAll(ex,Sort.by(Direction.DESC,"prodCode")).forEach(System.out::println);
		
		
		
	}

}
