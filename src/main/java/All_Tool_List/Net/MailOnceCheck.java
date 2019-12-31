package All_Tool_List.Net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;

public class MailOnceCheck {
    public String lifeCheck(String text) throws IOException {
        String requestUrl = "https://antibot.pw/api/disposable?email=" +  text;

        URL url= new URL(requestUrl);
        HttpURLConnection connection;
        BufferedReader reader = null;
        String line;
        connection = (HttpURLConnection) url.openConnection();// 根据URL生成HttpURLConnection
        connection.setRequestMethod("GET");// 默认GET请求
        connection.connect();// 建立TCP连接
        String resultend;
        StringBuilder result = new StringBuilder();
        if (connection.getResponseCode() == HttpURLConnection.HTTP_OK) {
            reader = new BufferedReader(new InputStreamReader(connection.getInputStream(), StandardCharsets.UTF_8));

            while ((line = reader.readLine()) != null) {
                result.append(line).append(System.getProperty("line.separator"));// "\n"
            }
        }
        if(result.toString().contains("true"))
        {
            resultend = "Disposable Email";
        }
        else
        {
            resultend = "Normal Email";
        }
        assert reader != null;
        reader.close();
        connection.disconnect();
        return resultend;
    }
}
