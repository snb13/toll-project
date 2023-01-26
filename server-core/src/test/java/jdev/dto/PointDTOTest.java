package jdev.dto;


import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class PointDTOTest {

    @Test
    public void toJson() throws Exception {
        PointDTO point = new PointDTO();
        point.setLat(56);
        point.setLon(74);
        point.setAutoId("o567gfd");
        //point.setTime(System.currentTimeMillis());
        assertTrue(point.toJson().contains("\"lat\":56"));
        //assertTrue(point.toJson().contains("\"time\":"));
        System.out.println(point.toJson());
    }

}
