import java.awt.*;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
//        byte age = 30;
//        int likeCount = 406_768_788;
//        long viewCount = 3_406_768_788L;
//        float price = 14.40F;
//        Date now = new Date();

        Point point1 = new Point(1,1);
        Point point2 =  point1;
        point1.y = 30;
        System.out.println(point2.y);
    }
}