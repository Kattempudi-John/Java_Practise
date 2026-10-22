package Tasks.collections;

import java.util.ArrayList;
import java.util.List;

//1. Create an ArrayList of product names.
//2. Add Laptop, Mobile, Tablet, Laptop, and Mobile.
//3. Print the complete list.
//4. Print the total number of elements.
//5. Use nested loops to identify duplicate product names.
//6. Print each duplicate product name only once.


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

                for(int j = i+1; j< products.size();j++){
                    if(products.get(i).equals(products.get(j))){
                        System.out.println("Duplicate: " + products.get(j));
                        break;
                    }
                }
            }
        }
    }
}