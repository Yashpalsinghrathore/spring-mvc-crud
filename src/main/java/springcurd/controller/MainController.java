package springcurd.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;

import springcurd.dao.ProductDao;
import springcurd.model.Product;

@Controller
public class MainController {

	@Autowired
	ProductDao productDao;
	
	@RequestMapping("/home")
	public String home(Model model)
	{

	List<Product> products =productDao.getAllProduct();
	
	model.addAttribute("product",products);
		
		System.out.println("home controller");
		
		return "home";
	}
	
	@RequestMapping("/addproduct")
	public String addProduct(Model model)
	{
		model.addAttribute("title","add-product");
		return "addproduct";
	}
	
	@RequestMapping(value ="/handleproduct",method=RequestMethod.POST)
	public RedirectView HandleProduct(@ModelAttribute Product product,HttpServletRequest request)
	{
		System.out.println("inside handle product");
		
		productDao.save(product);
		
		RedirectView redirectView = new RedirectView();
		
		redirectView.setUrl(request.getContextPath()+"/");
		
		
		return redirectView;
	}
	
	
	@RequestMapping("/delete/{id}")
	public RedirectView delteProduct(@PathVariable("id") int id,HttpServletRequest request)
	{
		
		productDao.delete(id);
		
		RedirectView redirectView = new RedirectView();
		
		redirectView.setUrl(request.getContextPath()+"/");
		
		return redirectView;
		
	}
	
	@RequestMapping("/update/{id}")
	public String updateProduct(@PathVariable("id") int id,HttpServletRequest request,Model model)
	{
		
		Product p = productDao.getProduct(id);
		
		model.addAttribute("product",p);
		
		return "update";
		
	}
}
