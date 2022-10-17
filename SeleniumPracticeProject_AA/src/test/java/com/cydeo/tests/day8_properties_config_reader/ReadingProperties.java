package com.cydeo.tests.day8_properties_config_reader;

import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadingProperties {

    @Test
    public void reading_from_properties_test() throws IOException {

        // 1. Create the object of Properties

        Properties properties = new Properties();

        // 2. We need to open the file using FileInputStream

        FileInputStream file = new FileInputStream("configuration.properties");

        // right click over the file > Copy Path/Reference > Path From Content Root

        // 3. Load the Properties object using FileInputStream object

        properties.load(file);

        // 4. Use Properties object to read value

        System.out.println("properties.getProperty(\"browser\") = " + properties.getProperty("browser"));
        System.out.println("properties.getProperty(\"env\") = " + properties.getProperty("env"));
        System.out.println("properties.getProperty(\"username\") = " + properties.getProperty("username"));

    }
}
