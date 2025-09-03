package com.example.demo.service;

import com.example.demo.domain.Order;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    private final ShippingService shippingService;

    public OrderService(ShippingService shippingService) {
        this.shippingService = shippingService;
    }

    public double total(Order order) {

        double valorComDesconto;
        double valorDoDesconto;
        double valorDoFrete;

        valorDoDesconto = (order.getBasic() * (order.getDiscount() / 100)) ;
        valorComDesconto = order.getBasic() - valorDoDesconto;
        valorDoFrete = shippingService.shipment(order);

        return valorComDesconto + valorDoFrete;
    }


}
