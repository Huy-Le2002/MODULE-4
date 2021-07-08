package service;

import model.Customer;

public interface ICustomerService extends IGeneralService<Customer>{
    Iterable<Customer> findAllByOrderByIdDesc();
}
