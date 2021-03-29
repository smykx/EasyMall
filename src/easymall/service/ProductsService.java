package easymall.service;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import easymall.po.Category;
import easymall.po.Products;
import easymall.pojo.MyProducts;

public interface ProductsService {
	
	public List<Category> allcategorys();
	public List<Products> prodlist(Map<String,Object> map);
	public Products oneProduct(String pid);
	public List<Products> proclass(Integer proclass);
	public String save(MyProducts myproducts,HttpServletRequest request);



}
