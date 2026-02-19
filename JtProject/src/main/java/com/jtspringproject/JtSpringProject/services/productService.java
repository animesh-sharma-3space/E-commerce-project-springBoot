package com.jtspringproject.JtSpringProject.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jtspringproject.JtSpringProject.dao.productDao;
import com.jtspringproject.JtSpringProject.models.Product;

@Service
public class ProductService {
	@Autowired
	public productDao ProductDao;
	
	public List<Product> getProducts(){
		return ProductDao.getProducts();
	}
	
	public Product addProduct(Product product) {
		return ProductDao.addProduct(product);
	}
	
	public Product getProduct(int id) {
		return ProductDao.getProduct(id);
	}

	public Product getProductByName(String name){return ProductDao.getProductByname(name);}

	public Product updateProduct(int id,Product product){
		product.setId(id);
		return ProductDao.updateProduct(product);
	}
	public Product updateProductPrice(int price, Product product){
		product.setPrice(price);
		return ProductDao.updateProduct(product);
	}
	public boolean deleteProduct(int id) {
		return ProductDao.deleteProduct(id);
	}
    public List<Product> sortonprice(){
		return ProductDao.sortonprice();
	}
	public List<Product> sortoncategory(String name){
		return ProductDao.sortonCategory(name);
	}

}
