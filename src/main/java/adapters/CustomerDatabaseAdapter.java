package adapters;

import core.entity.Customer;
import core.port.CustomerRepositoryPort;
import jakarta.enterprise.context.ApplicationScoped;

import java.util.ArrayList;
import java.util.List;

@ApplicationScoped
public class CustomerDatabaseAdapter implements CustomerRepositoryPort {

    private final List<Customer> customerDatabase = new ArrayList<>();

    @Override
    public List<Customer> findAll() {
        return customerDatabase;
    }

    @Override
    public Customer findById(Long id) {
        return customerDatabase.stream().filter(c -> c.getId().equals(id)).findFirst().orElse(null);
    }

    @Override
    public void save(Customer customer) {
        customerDatabase.add(customer);
    }
}
