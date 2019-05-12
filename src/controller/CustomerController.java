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
	
	//insert��������ֵΪnull�����������δ�õ�����
	
	//ע�⣺Controller��void������Ҫ��������HttpServletResponse���͵ķ������
	//void����������HttpServletResponse���͵���Σ����ܱ���
	//Circular view path []: would dispatch back to the current handler URL
	//Spring MVC����Ϊ@RequestMappingע����ָ����·������Ҫ���ص���ͼname
	
	@RequestMapping("/findCustomerById")
	public String findCustomerById(Integer id,Model model){
		Customer customer=customerService.findCustomerById(id);
		model.addAttribute("customer",customer);
		return "customer";
	}
}
