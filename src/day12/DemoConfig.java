package day12;

import utilities.ConfigurationReader;

public class DemoConfig {
    public static void main(String[] args) {

        //We want to read the properties from the property file
        System.out.println(ConfigurationReader.getPropertyValue("username"));
        System.out.println(ConfigurationReader.getPropertyValue("password"));

        System.out.println(ConfigurationReader.getPropertyValue("username"));
        System.out.println(ConfigurationReader.getPropertyValue("password"));

        System.out.println(ConfigurationReader.getPropertyValue("username"));
        System.out.println(ConfigurationReader.getPropertyValue("password"));

        System.out.println(ConfigurationReader.getPropertyValue("username"));
        System.out.println(ConfigurationReader.getPropertyValue("password"));




    }
}
