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

        List<String> product = new ArrayList<>();

        product.add("java");
        product.add("python");
        product.add("selenium");
        product.add("java");
        product.add("java");
        product.add("python");

        for(int i=0; i< product.size(); i++){

            boolean alreadyPrinted = false;

            for(int j= 0; j < i; j++){

                if(product.get(i).equals(product.get(j))){

                    alreadyPrinted = true;
                }
            }

            if(!alreadyPrinted){

                for(int j= i+1; j< product.size();j++){
                    if(product.get(i).equals(product.get(j))){
                        System.out.println("Duplicate String is: " + product.get(i));
                        break;
                    }
                }
            }
        }
    }
}