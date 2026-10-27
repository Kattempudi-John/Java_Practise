package Tasks.collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapDemo {

    public static void main(String[] args) {

        int qaCount =0;
        int mapCount =0;
        Map<String, String> qaenv = new LinkedHashMap<>();

        qaenv.put("browser","Chrome");
        qaenv.put("environment", "QA");
        qaenv.put("execution", "Local");
        qaenv.put("report","Allure");

        for(Map.Entry<String, String> entry: qaenv.entrySet()){
            System.out.println(
                    entry.getKey() + " : " + entry.getValue()
            );

            mapCount++;
        }

        System.out.println(qaenv.size());
        System.out.println(mapCount);

        for(String key: qaenv.keySet()){
            System.out.println("Key: " + key);
        }

        for(String value: qaenv.values()){
            System.out.println("Values: " + value);
            if (value.equals("QA")){
                qaCount++;
            }
        }

        System.out.println("QA count" + qaCount);

//        System.out.println(employee.get("name"));
//        System.out.println(employee.get("department"));
//        System.out.println(employee.containsKey("salary"));
//        System.out.println(employee.size());
//
//        employee.put("department" , "Automation QA");
    }
}
