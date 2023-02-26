package jdev.tracker.controllers;

import jdev.server.consumer.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class TrackerController {

    @Autowired
    RestTemplate restTemplate;
    private static final String template = "It's yours, %s!";
    private final AtomicLong counter = new AtomicLong();
    @RequestMapping("/counter")
    public CurrentState greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return new CurrentState(counter.incrementAndGet(),
                String.format(template, name));
    }

    @RequestMapping(value = "/coords", method = RequestMethod.GET)
    public Response setCoords(@RequestParam(value="location") String location){
        System.out.println(location);
        Response response;
        if (location.split(",").length == 2) {
            response = new Response("ok", true);
        } else {
            response = new Response("fail", false);
        }

        return response;
    }

    @RequestMapping("/relay")
    public Product relay(){
        Product product = restTemplate.getForObject("https://therichpost.com/testjsonapi/product/1/", Product.class);
        return product;
    }

}
