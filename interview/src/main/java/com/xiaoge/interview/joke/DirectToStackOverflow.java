package com.xiaoge.interview.joke;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class DirectToStackOverflow {

    public static void main(String[] args)
    {
        int a=0;
        int b=1;
        try{
            System.out.println(Integer.MAX_VALUE);
            float c= b/a;
        }catch(Exception e)
        {
            String url = "http://stackoverflow.com/search?q=java";
            url= url+e.getMessage().replaceAll("/", "");
            url =url.replaceAll(" ", "+");
            try {
                URI uri= new URI(url);
                Desktop.getDesktop().browse(uri);
            } catch (URISyntaxException e1) {
                e1.printStackTrace();
            } catch (IOException e1) {
                e1.printStackTrace();
            }
            
        }
    }
}
