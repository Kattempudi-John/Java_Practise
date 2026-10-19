package Tasks.collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDuplicate {

    public static void main(String[] args) {

        List<String> products = new ArrayList<>();

        products.add("Laptop");
        products.add("Mobile");
        products.add("Tablet");
        products.add("Laptop");
        products.add("Laptop");
        products.add("Mobile");
        products.add("Mobile");

        System.out.println(products);
        System.out.println("Total elements are: " + products.size());

        for(int i=0; i<products.size();i++){

            boolean alreadyPrinted = false;

            for(int j=i+1; j < products.size();j++){

                if(products.get(i).equals(products.get(j))){

                    alreadyPrinted = true;
                    break;
                }
            }

            if(!alreadyPrinted){
                
            }


        }

    }
}