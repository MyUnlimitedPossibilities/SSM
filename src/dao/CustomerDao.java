package dao;

import org.apache.ibatis.annotations.Select;

import po.Customer;

public interface CustomerDao {
	//可以删除映射xml文件，写上这句注解
	//@Select("select * from t_customer where id=#{id}")
	public Customer findCustomerById(Integer id);
}
