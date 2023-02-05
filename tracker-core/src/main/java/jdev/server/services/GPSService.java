package jdev.server.services;


import org.springframework.stereotype.Service;


import java.util.Random;

@Service
public class GPSService {


    private String coords;

    public String getCoords() {
        Random rand = new Random();
        double lat = rand.nextDouble(90);
        double lon = rand.nextDouble(180);
        double azim = rand.nextDouble(360);
        int speed = rand.nextInt(100);
        return String.format("{" +
                "\"lat\" : %.2f,  \"lon\" : %.2f, \"Azim\" : %.2f, \"Speed\" : %d}", lat, lon, azim, speed);
    }


/*
    private String coords = String.format("{" +
            "\"lat\" : %.2f,  \"lon\" : %.2f, \"Azim\" : %.2f, \"Speed\" : %d}", lat, lon, azim, speed);
*/


/*    @PostConstruct
    public void init() {
        System.out.println(getCoords());
        System.out.printf("Latitude =  %.1f \n", lat);
        System.out.printf("Longitude = %.1f \n", lon);
        System.out.printf("Azimuth = %.1f \n", azim);
        System.out.printf("Speed = %d", speed);
    }*/


}
