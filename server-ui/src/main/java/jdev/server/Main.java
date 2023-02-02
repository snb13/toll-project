package jdev.server;

import jdev.dto.PointDTO;


public class Main {
    public static void main(String... args) throws Exception {
        for (int i=0; i<5; i++) {
            System.out.println("Main.main say Hello!!!!");
            PointDTO point = new PointDTO();
            point.setLat(45);
            System.out.println(point.toJson());
            Thread.sleep(1000);
        }
        for (int i=0; i<5; i++) {
            System.out.println("Hello from decodeDTO!!!");
            PointDTO dto = new PointDTO();
            dto.setLat(45);
            dto.setLon(60);
            dto.setAutoId("\"o567gfd\"");
            dto.setJson();
            //dto.setTime(1674685823415L);
            System.out.println(dto.decodeDTO());
            Thread.sleep(1000);
        }
    }
}
