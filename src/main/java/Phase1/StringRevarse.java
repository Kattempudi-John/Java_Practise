package Phase1;

public class StringRevarse {
    public static void main(String[] args) {
        String name = "Backend";
        String revarse= "";
        for (int i=name.length() -1 ; i >= 0 ; i--) {
            revarse = revarse + name.charAt(i);
//            System.out.print(name.charAt(i));
        }
        System.out.println(revarse);

        if(name.equals(revarse)){
            System.out.println(true);
        }else {
            System.out.println(false);
        }



    }
}
