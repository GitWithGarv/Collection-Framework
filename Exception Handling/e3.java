
public class e3 {
    public static void main(String []args){
        
        int a = 10, b=20, c=0;

        try{                   // try block is used to check for exceptions
            c = a / b;  
            if(c == 0){
                throw new ArithmeticException("c cannot be zero");   // throwing an exception manually
            } 
        }

        // catch block is used to handle the exception
        catch(ArithmeticException e){

            c = a / 2;   // handling the exception by changing the value of b to 2
            System.out.println("default output: " + e.getMessage());
        }

        finally{                    // finally block is always executed
            System.out.println("The value of c is: " + c);
            System.out.println("BYE...");    
        }
    }
}