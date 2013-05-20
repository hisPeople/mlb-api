import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * User: devon
 * Date: 5/9/13
 * Time: 9:50 AM
 */
public class Fetcher {
    private static final String BASE_URL = "http://gd2.mlb.com/components/game/mlb/";
    private static final String YEAR = "year_"; // year_yyyy
    private static final String MONTH = "/month_"; // month_mm
    private static final String DAY = "/day_"; // day_dd


    public Fetcher(String year, String month, String day){
        File yearDir = new File(year);
        yearDir.mkdir();
        File monthDir = new File(yearDir, month);
        monthDir.mkdir();
        File dayDir = new File(monthDir, day);
        dayDir.mkdir();
        // search mini scoreboard for all games
        // get the number innings for the game
        // loop through and save all the inning files;

        JSONObject jsonObject = null;
        JSONObject data = null;
        JSONObject games = null;
        JSONArray gameArray = null;
        String gamedayLink = null;
        String miniscoreboardurl = BASE_URL + YEAR + year + MONTH + month + DAY + day + "/miniscoreboard.json";
        try {
            URL msUrl = new URL(miniscoreboardurl);
            BufferedReader br = new BufferedReader(new InputStreamReader(msUrl.openStream()));
            String jsonIn;
            while((jsonIn = br.readLine()) != null) {
                jsonObject = new JSONObject(jsonIn);
            }

            data = jsonObject.getJSONObject("data");
            games = data.getJSONObject("games");
            gameArray = games.getJSONArray("game");

            for(int i = 0; i < gameArray.length(); i++) {
                JSONObject game = gameArray.getJSONObject(i);
                gamedayLink = "gid_" + game.getString("gameday_link");
                int innings = game.getInt("inning");
                String urlWithGamedayLink = BASE_URL + YEAR + year + MONTH + month + DAY + day + "/" + gamedayLink + "/inning";
                File gameDir = new File(dayDir, gamedayLink);
                gameDir.mkdir();
                for(int j = 1; j <= innings; j++) {
                    URL fileUrl = new URL(urlWithGamedayLink + "/inning_" + j + ".xml");
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileUrl.openStream()));
                    String inningIn;
                    File inningFile = new File(gameDir, "inning_" + j + ".xml");
                    inningFile.createNewFile();
                    if(inningFile.exists()) {
                        System.out.println("created file: " + inningFile.getAbsolutePath());
                    } else {
                        System.out.println("Should have saved but didn't :(");
                    }
                    FileWriter fileWriter = new FileWriter(inningFile);
                    while((inningIn = bufferedReader.readLine()) != null) {
                        fileWriter.write(inningIn);
                    }
                    fileWriter.close();
                }
            }
        } catch (FileNotFoundException e) {
            System.err.println("File not found... skipping...");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
