package orders.db;

import orders.Order;

import java.util.List;

public class OrderRepositoryImpl implements OrderRepository {

    @Override
    public List<Order> findByCustomer(String customer) {
        return null;
    }

    @Override
    public List<Order> findByCustomerLike(String customer) {
        return null;
    }

    @Override
    public List<Order> findByCustomerAndType(String customer, String type) {
        return null;
    }

    @Override
    public List<Order> getByType(String type) {
        return null;
    }
}
