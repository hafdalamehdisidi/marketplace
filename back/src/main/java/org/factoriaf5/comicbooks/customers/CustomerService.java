package org.factoriaf5.comicbooks.customers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    CustomerRepository repository;

    @Autowired
    public CustomerService(CustomerRepository repository) {
        this.repository = repository;
    }

    public Customer create(Customer customer) {
        return repository.save(customer);
    }

    public Customer findByEmail(String email) {
        return repository.findByEmail(email).orElseThrow();
    }

    public Customer update(String email, Customer newCustomer) {

        Customer currentCustomer = repository.findByEmail(email).orElseThrow();

        currentCustomer.setEmail(newCustomer.getEmail());
        currentCustomer.setDni(newCustomer.getDni());
        currentCustomer.setNombre(newCustomer.getNombre());
        currentCustomer.setApellido1(newCustomer.getApellido1());
        currentCustomer.setApellido2(newCustomer.getApellido2());
        currentCustomer.setCalle(newCustomer.getCalle());
        currentCustomer.setNumero(newCustomer.getNumero());
        currentCustomer.setPortal(newCustomer.getPortal());
        currentCustomer.setEscalera(newCustomer.getEscalera());
        currentCustomer.setPiso(newCustomer.getPiso());
        currentCustomer.setLetra(newCustomer.getLetra());
        currentCustomer.setCodigopostal(newCustomer.getCodigopostal());
        currentCustomer.setMunicipio(newCustomer.getMunicipio());
        currentCustomer.setProvincia(newCustomer.getProvincia());
        currentCustomer.setPassword(newCustomer.getPassword());
        return repository.save(currentCustomer);
    }

    public Customer delete(String email, Customer customer) {
        Customer customer1 = repository.findByEmail(email).orElseThrow();
        customer1.setEmail(customer.getEmail());
        repository.delete(customer1);
        return customer1;
    }

    public List<Customer> getAll() {
        return repository.findAll();
    }
}
