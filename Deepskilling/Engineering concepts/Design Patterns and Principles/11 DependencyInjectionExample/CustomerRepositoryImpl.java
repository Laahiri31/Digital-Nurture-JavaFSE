package DependencyInjectionExample;

public class CustomerRepositoryImpl implements CustomerRepository {

    @Override
    public String findCustomerById(int id) {

        if (id == 101) {
            return "Alice";
        } else if (id == 102) {
            return "Bob";
        } else {
            return "Customer Not Found";
        }
    }
}