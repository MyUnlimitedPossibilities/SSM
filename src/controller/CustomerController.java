package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import po.Customer;
import service.CustomerService;

@Controller
public class CustomerController {
	@Autowired
	private CustomerService customerService;
	
	//insert操作返回值为null，这个问题尚未得到解释
	
	//注意：Controller的void方法中要尽量声明HttpServletResponse类型的方法入参
	//void方法不定义HttpServletResponse类型的入参，可能报错：
	//Circular view path []: would dispatch back to the current handler URL
	//Spring MVC会认为@RequestMapping注解中指定的路径就是要返回的视图name
	
	@RequestMapping("/findCustomerById")
	public String findCustomerById(Integer id,Model model){
		Customer customer=customerService.findCustomerById(id);
		model.addAttribute("customer",customer);
		return "customer";
	}
}
