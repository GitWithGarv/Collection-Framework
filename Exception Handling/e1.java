public class e1 {
    public static void main(String []args){
        
        int a = 10, b=0, c=0;

        try{               // try block is used to check for exceptions
            c = a / b;   // Arithmetic Exception(Dividing any number by 0 give this exception)
        }

        // catch block is used to handle the exception
        catch(ArithmeticException e){         // e is like and object here
            System.out.println("Something went wrong..." + e.getMessage());
        }
        System.out.println("The value of c is: " + c);
        System.out.println("BYE...");
    }
}
