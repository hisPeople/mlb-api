import java.util.Calendar;

/**
 * User: devon
 * Date: 5/9/13
 * Time: 9:48 AM
 */
public class Main {
    public static void main(String[] args) {
        int startYear = 2011;
        int endYear = 2012;
        String day = null;
        Calendar cal = Calendar.getInstance();
        for(int year = startYear; year <= endYear; year++) {
            cal.set(Calendar.YEAR, year);
            for(int month = 10; month < 11; month++) {
                cal.set(Calendar.MONTH, month-1);
                for(int i = 1; i <= cal.getActualMaximum(Calendar.DAY_OF_MONTH); i++) {
                    if(i < 10) {
                        day = "0" + i;
                    } else {
                        day = String.valueOf(i);
                    }
                    String monthString = null;
                    if(month < 10) {
                        monthString = "0" + month;
                    } else {
                        monthString = String.valueOf(month);
                    }

                    //System.out.println(year + "/" + monthString + "/" + day);
                    Fetcher fetcher = new Fetcher(String.valueOf(cal.get(Calendar.YEAR)), monthString, day);
                }
            }
        }
    }
}
