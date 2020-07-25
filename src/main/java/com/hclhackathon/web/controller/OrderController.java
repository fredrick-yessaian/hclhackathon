package com.hclhackathon.web.controller;

import com.hclhackathon.model.Order;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.List;

@Controller
public class OrderController {

    @RequestMapping("/AllOrders")
    @ResponseBody
    public List<Order> getAllOrders() {
        List<Order> orders = Arrays.asList(
                new Order(1, "Alejandro", "Luna", "50")
        );
        return orders;
    }
}
