package jjug.ccc.e6.domain.model.shipment;

import jjug.ccc.e6.domain.model.order.Order;
import jjug.ccc.e6.domain.model.stock.Stock;

/**
 * 出荷
 */
public class Shipment {
    Order order;
    Stock stock;
}
