package service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import dao.CustomerDao;
import po.Customer;
import service.CustomerService;
@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerDao customerDao;
	@Override
	public Customer findCustomerById(Integer id) {
		return this.customerDao.findCustomerById(id);
	}

}
