package core.port;

import core.entity.Customer;

import java.util.List;

public interface CustomerRepositoryPort {

    List<Customer> findAll();
    Customer findById(Long id);
    void save(Customer customer);
}
