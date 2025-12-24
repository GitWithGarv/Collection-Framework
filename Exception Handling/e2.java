public class e2 {
    public static void main(String []args){
        int a = 10, b=2, c=0;
        int []arr = new int[5];
        String str = null;

        try{               
            c = a / b;
            System.out.println(str.length());   // This will throw NullPointerException)
            System.out.println(arr[0]);
            System.out.println(arr[5]);   // This will throw ArrayIndexOutOfBoundsException
            // to handle the array index out of bounds exception we have to create a separate catch block
        }

        catch(ArithmeticException e){         // e is like and object here
            System.out.println("Something went wrong..." + e.getMessage());
        }

        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Stay in your limit..." + e.getMessage());
        }

        catch(Exception e){            //exception is the parent class of all the exceptions and it is always written at the end  
            System.out.println("the string is null..." + e.getMessage());
        }

        System.out.println("The value of c is: " + c);
        System.out.println("BYE...");
    }
    
}
