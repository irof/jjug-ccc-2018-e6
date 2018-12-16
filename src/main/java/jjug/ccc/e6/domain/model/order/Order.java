package jjug.ccc.e6.domain.model.order;

import jjug.ccc.e6.domain.model.customer.Customer;
import jjug.ccc.e6.domain.model.product.Product;
import jjug.ccc.e6.domain.model.stock.Stock;

/**
 * 受注
 */
public class Order {
    Customer customer;
    Product product;
    Stock stock;
}
