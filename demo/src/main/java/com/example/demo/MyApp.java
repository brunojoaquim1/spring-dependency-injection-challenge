package com.example.demo;

import com.example.demo.domain.Order;
import com.example.demo.service.OrderService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class MyApp implements CommandLineRunner {

    private final OrderService orderService;

    public MyApp(OrderService orderService) {
        this.orderService = orderService;
    }

    public static void main(String[] args) {
		SpringApplication.run(MyApp.class, args);
	}

    @Override
    public void run(String... args) throws Exception{

        List<Order> orders = new ArrayList<>();
        orders.add(new Order(1034, 150.0, 20.0));
        orders.add(new Order(2282, 800.0, 10.0));
        orders.add(new Order(1309, 95.9, 0.0));

        for (Order order : orders) {
            System.out.println("Número Pedido: " + (order.getCode()));
            System.out.println("Valor Total: R$" + orderService.total(order));
        }
    }

}
