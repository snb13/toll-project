package jdev.tracker.controllers;

import jdev.server.consumer.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class TrackerController {


    @Autowired
    RestTemplate restTemplate;

    @RequestMapping(value = "/relay")
    public Product relay(){
        Product product = restTemplate.getForObject("https://therichpost.com/testjsonapi/product/1/", Product.class);
        return product;
    }

}
