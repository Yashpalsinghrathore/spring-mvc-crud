package springcurd.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import springcurd.model.Product;

@Repository
public class ProductDao {

	@Autowired
	HibernateTemplate hibernateTemplate;
	//save object
	
	@Transactional
	public void save(Product product)
	{
		
		this.hibernateTemplate.saveOrUpdate(product);
		
		System.out.println("product saved successfully");
		
	}
	
	//get all prduct
	
	public List<Product> getAllProduct()
	{
		
		List<Product> list = this.hibernateTemplate.loadAll(Product.class);
		
		return list;
	}
	
	
	//get single product
	public Product getProduct(int id)
	{
		

		Product p = this.hibernateTemplate.get(Product.class, id);
		
		return p;
		
	}
	
	//for delteing the product 
	@Transactional
	public void delete(int id)
	{
		
		Product p = this.hibernateTemplate.get(Product.class, id);
		
		this.hibernateTemplate.delete(p);
		
		System.out.println("product delted");
		
	}
	
	
}
