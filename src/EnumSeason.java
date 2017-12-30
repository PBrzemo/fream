
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.Set;


enum Season {
    SPRING, SUMMER, AUTUMN, WINTER;

    static public Season of ( Month month ) {
        switch ( month ) {
            // Spring.
            case MARCH:
                return Season.SPRING;
            case APRIL:
                return Season.SPRING;
            // Summer.
            case MAY:
                return Season.SUMMER;
            case JUNE:
                return Season.SUMMER;
            case JULY:
                return Season.SUMMER;
            case AUGUST:
                return Season.SUMMER;
            // AUTUMN.
            case SEPTEMBER:
                return Season.AUTUMN;
            case OCTOBER:
                return Season.AUTUMN;
            // Winter.
            case NOVEMBER:
                return Season.WINTER;
            case DECEMBER:
                return Season.WINTER;
            case JANUARY:
                return Season.WINTER;
            case FEBRUARY:
                return Season.WINTER;
            default:
                System.out.println ( "ERROR." );
                return null;
        }

    }


}



public class EnumSeason {

    public static void main(String[] args) {
        DateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        ZoneId zoneId = ZoneId.of ("Poland");
        ZonedDateTime zdt = ZonedDateTime.now (zoneId);
        Month month = Month.from (zdt);
        Season season = Season.of (month);
        Date date = new Date();
            System.out.println ("ZoneDataTime: " + sdf.format(date)/*albo zdt*/ + " Month: " + month + " " +"Season: " + season +" ");

            System.out.println("---------------------");

        Set<Season> set = EnumSet.of(Season.AUTUMN, Season.SPRING, Season.SUMMER, Season.WINTER);
        Iterator<Season> ite = set.iterator();
        while (ite.hasNext())
            System.out.println(ite.next());

        System.out.println("---------------------");

        for (Season s : Season.values())
            System.out.println(s); //



    }
}