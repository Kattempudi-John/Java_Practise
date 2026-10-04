package Tasks.collections;

import java.util.List;

public class ArrayListPractise {

    public static void main(String[] args) {

        List<String> skills = new java.util.ArrayList<>();

        skills.add("Java");
        skills.add("Selenium");
        skills.add("TestNG");
        skills.add("RestAssured");
        skills.add("Postman");

        for(int i=0; i< skills.toArray().length;i++){
            System.out.println(skills.get(i));
        }

        System.out.println(skills.get(0));

        System.out.println(skills.get(2));

        System.out.println(skills.size());

        skills.remove("Postman");


        for(int i=0; i< skills.size();i++){
            System.out.println(skills);
        }

        for(String skill: skills){
            System.out.println(skill);
        }

    }
}
