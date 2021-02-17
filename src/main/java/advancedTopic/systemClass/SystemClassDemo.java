package advancedTopic.systemClass;

import java.util.Properties;

public class SystemClassDemo {
    public static void main(String[] args) {

        Properties properties = System.getProperties();
        System.out.println(properties.getProperty("favorite.day"));
        System.out.println(properties.getProperty("favorite.car"));
    }
}
