package jdev.server.consumer;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.io.IOUtils;
import java.io.IOException;
import java.net.URL;
import java.nio.charset.StandardCharsets;

public class ProductConsumer {
    public static void main(String... args) throws IOException {
        // получаем строку JSON от REST
//        String response = IOUtils.toString(new URL("https://therichpost.com/testjsonapi/product/1/"), "UTF8");
        String response = IOUtils.toString(new URL("http://localhost:8080/relay"), StandardCharsets.UTF_8);
//        String response = "{\"RestResponse\" : {\"result\" : " + resp + "}}";
        System.out.println(response);

        // преобразуем строку JSON в объект
//        ObjectMapper mapper = new ObjectMapper();
//        Product product = mapper.readValue(response, Product.class);
//        System.out.println(product.RestResponse.result.entrySet());


        // преобразуем строку JSON в объект
        /*ObjectMapper mapper = new ObjectMapper();
        Country country = mapper.readValue(response, Country.class);
        System.out.println(country.RestResponse.result.entrySet());
        System.out.println(country.RestResponse.messages.length);
        System.out.println(country.RestResponse.messages[0]);*/

    }
}
