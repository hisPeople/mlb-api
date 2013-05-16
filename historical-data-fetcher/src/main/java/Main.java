/**
 * User: devon
 * Date: 5/9/13
 * Time: 9:48 AM
 */
public class Main {
    public static void main(String[] args) {
        String day = null;
        for(int i = 1; i <= 30; i++) {
            if(i < 10) {
                day = "0" + i;
            } else {
                day = String.valueOf(i);
            }
            Fetcher fetcher = new Fetcher("2013", "04", day);
        }
    }
}
