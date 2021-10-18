package com.mcfp.api.mock.mockapi.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/orders")
public class OrdersMockController {

    @GetMapping("/total")
    ResponseEntity<String> getTotalSalesfromOrders(){
        String totalSales = "{\"currentSales\":50000000," +
                "\"goalSales\":5000000000," +
                "\"achievementRate\":0.01}";
        return new ResponseEntity<String>(totalSales, HttpStatus.OK);
    }
    //domain으로 옮겨야할지 고민
    @GetMapping("/products")
    ResponseEntity<String> getSalesByProductsfromOrders(){
        String productsSales ="{[" +
                "{\"productName\":\"product1\",\"dailySales\":14000400,\"monthlySales\":14000400}," +
                "{\"productName\":\"product2\",\"dailySales\":14000400,\"monthlySales\":14000300}," +
                "{\"productName\":\"product3\",\"dailySales\":14000400,\"monthlySales\":14000200}," +
                "{\"productName\":\"product4\",\"dailySales\":14000400,\"monthlySales\":14000100}," +
                "{\"productName\":\"product5\",\"dailySales\":14000400,\"monthlySales\":13000400}," +
                "{\"productName\":\"product6\",\"dailySales\":14000400,\"monthlySales\":12000400}," +
                "{\"productName\":\"product7\",\"dailySales\":14000400,\"monthlySales\":11000400}," +
                "{\"productName\":\"product8\",\"dailySales\":14000400,\"monthlySales\":10000400}" +
                "]}";
        return new ResponseEntity<String>(productsSales, HttpStatus.OK);
    }
    //domain으로 옮겨야할지 고민
    @GetMapping("/employees")
    ResponseEntity<String> getSalesByEmployeesfromOrders(){
        String employeeSales = "{[" +
                "{\"name\":\"test1\",\"dailySales\":14000400,\"totalSales\":14000400}," +
                "{\"name\":\"test2\",\"dailySales\":14000400,\"totalSales\":14000300}," +
                "{\"name\":\"test3\",\"dailySales\":14000400,\"totalSales\":14000200}," +
                "{\"name\":\"test4\",\"dailySales\":14000400,\"totalSales\":14000100}," +
                "{\"name\":\"test5\",\"dailySales\":14000400,\"totalSales\":13000400}," +
                "{\"name\":\"test6\",\"dailySales\":14000400,\"totalSales\":12000400}," +
                "{\"name\":\"test7\",\"dailySales\":14000400,\"totalSales\":11000400}," +
                "{\"name\":\"test8\",\"dailySales\":14000400,\"totalSales\":10000400}" +
                "]}";
        return new ResponseEntity<String>(employeeSales, HttpStatus.OK);
    }

}
