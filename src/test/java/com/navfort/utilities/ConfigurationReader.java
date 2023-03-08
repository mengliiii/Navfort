package com.navfort.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {

    //4 steps
    //1-create properties obj and make it private static
    private static Properties properties = new Properties();

    //2 create file input stream obj and provide the file name to constructor, to open the file
    //3 load the file to properties obj
    static {
        try{
            FileInputStream fileInputStream = new FileInputStream("configuration.properties");

            properties.load(fileInputStream);


        }catch (IOException e){

        }

    }
   //4 return the provided key's value
    public static String getProperty(String key){
       return properties.getProperty(key);

    }

}
