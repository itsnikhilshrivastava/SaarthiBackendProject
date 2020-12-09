/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package search;

/**
 *
 * @author NIKHIL
 */
import java.net.*;
import java.io.*;

public class URLConnectionReader {
    public static String getText(String url) throws Exception {
        URL website = new URL(url);
        URLConnection connection = website.openConnection();
        BufferedReader in = new BufferedReader(
                                new InputStreamReader(
                                    connection.getInputStream()));

        StringBuilder response = new StringBuilder();
        String inputLine;
        int c=0;
        while ((inputLine = in.readLine()) !=null && c!=200)
        {
            response.append(inputLine);
            c++;
        }

        in.close();

        return response.toString();
    }
}
