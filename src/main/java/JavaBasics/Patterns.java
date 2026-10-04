package JavaBasics;
//printSquare()
//printRightTriangle()
//printReverseTriangle()
//printNumberTriangle()

public class Patterns {

    public static void main(String[] args) {
        System.out.println("Printing the Square pattern");
        printSquare();

        System.out.println("printing the RightTriangle");
        printRightTriangle();

        System.out.println("printing the ReverseTriangle");
        printReverseTriangle();

        System.out.println("printing the NumberTriangle");
        printNumberTriangle();
    }

    public static void printSquare(){
        int n =4;
        for(int i=1; i<=n;i++){
            for(int j=1; j<=n; j++){
                System.out.print(" * ");
            }
            System.out.println("");
        }
    }

    public static void printRightTriangle(){
        int n =4;
        for(int i=1; i<=n;i++){
            for(int j=1; j<=i; j++){
                System.out.print(" * ");
            }
            System.out.println("");
        }
    }


    public static void printReverseTriangle(){
        int n =4;
        for(int i=n; i>=1;i--){
            for(int j=1; j<=i; j++){
                System.out.print(" * ");
            }
            System.out.println("");
        }
    }

    public static void printNumberTriangle(){
        int n =4;
        for(int i=1; i<=n;i++){
            for(int j=1; j<=i; j++){
                System.out.print(j + "");
            }
            System.out.println("");
        }
    }

}
