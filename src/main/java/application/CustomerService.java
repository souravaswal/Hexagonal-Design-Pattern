package application;

import core.entity.Customer;
import core.port.CustomerRepositoryPort;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

import java.util.List;

@ApplicationScoped
public class CustomerService {

    @Inject
    CustomerRepositoryPort customerRepositoryPort;

    public List<Customer> getAllCustomers() {
        return customerRepositoryPort.findAll();
    }

    public void createCustomer(Customer customer) {
        customerRepositoryPort.save(customer);
    }
}
