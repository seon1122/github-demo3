import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Seasons {

    public enum Season {
        WINTER, SPRING, SUMMER, AUTUMN
    }


    public static void main(String[] args) throws IOException {

        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));


        Season season = null;
        String month = rd.readLine();

        switch (month) {
            case "December":
            case "January":
            case "February":
                season = Season.WINTER;
                break;
            case "March":
            case "April":
            case "May":
                season = Season.SPRING;
                break;
            case "June":
            case "July":
            case "August":
                season = Season.SUMMER;
                break;
            case "September":
            case "October":
            case "November":
                season = Season.AUTUMN;
                break;
            default:
                System.out.println("No this month");
        }

        System.out.println(season.toString());

    }

}
