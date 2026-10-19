package Tasks.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListPractise {

    public static void main(String[] args) {

        List<String> subject = new ArrayList<>();

        subject.add("Java");
        subject.add("selenium");
        subject.add("Java");
        subject.add("Rest Assured");

        System.out.println(subject);

        System.out.println("3rd subject is: "+ subject.get(2));

        subject.remove(2);

        System.out.println("subjects after removing java: " + subject);

        for(int i =0 ; i < subject.size();i++){
            System.out.println(subject.get(i));
        }

        for(String subjects: subject){
            System.out.println(subjects);
        }

        subject.add(2, "SQL");

        System.out.println(subject);

        subject.set(1, "Playwright");

        System.out.println(subject);

        System.out.println(subject.contains("Playwright"));

        System.out.println(subject.isEmpty());

    }
}
