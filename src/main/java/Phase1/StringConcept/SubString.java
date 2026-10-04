package Phase1.StringConcept;


public class SubString {

    public static void main(String[] args) {

            String name = "  John Developer  ";

            // 1. trim()
            String cleanedName = name.trim();
            System.out.println("Trim: " + cleanedName);


            // 2. length()
            System.out.println("Length: " + cleanedName.length());


            // 3. charAt()
            System.out.println("First Character: " + cleanedName.charAt(0));


            // 4. Traversing String
            System.out.println("Characters:");
            for(int i = 0; i < cleanedName.length(); i++){
                System.out.println(cleanedName.charAt(i));
            }


            // 5. equals()
            String user1 = "John";

            System.out.println(
                    "Equals: " + user1.equals("John")
            );


            // 6. equalsIgnoreCase()
            System.out.println(
                    "Ignore Case: " + user1.equalsIgnoreCase("john")
            );


            // 7. substring()
            String email = "john@gmail.com";

            int index = email.indexOf("@");

            String username = email.substring(0,index);

            System.out.println("Username: " + username);


            // 8. split()

            String data = "John,25,Developer";

            String[] values = data.split(",");

            System.out.println("Split Data:");

            for(String value : values){
                System.out.println(value);
            }


            // 9. replace()

            String message = "Java Backend";

            message = message.replace("Java","Spring");

            System.out.println("Replace: " + message);



            // 10. contains()

            String technology = "Java Spring Boot";

            System.out.println(
                    "Contains Spring: " +
                            technology.contains("Spring")
            );



            // 11. startsWith()

            String url = "https://company.com";

            System.out.println(
                    "Secure URL: " +
                            url.startsWith("https")
            );



            // 12. endsWith()

            String file = "profile.jpg";

            System.out.println(
                    "Image File: " +
                            file.endsWith(".jpg")
            );



            // 13. Uppercase and Lowercase

            String language = "java";

            System.out.println(
                    language.toUpperCase()
            );

            System.out.println(
                    language.toLowerCase()
            );



            // 14. StringBuilder

            StringBuilder builder = new StringBuilder();

            builder.append("Name: ");
            builder.append("John");
            builder.append(", Role: ");
            builder.append("Developer");


            System.out.println(
                    "Builder: " + builder
            );


            // 15. reverse()

            builder.reverse();

            System.out.println(
                    "Reverse: " + builder
            );


    }
}
