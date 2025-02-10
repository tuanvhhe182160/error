
package error;


public class Error {

    public static void main(String[] args) {
        //Err 1: Arithmetic Exception:
        int var1 = 15;
        int var2 = 0;
        // This statement causes a runtime error,
        // as 15 is getting divided by 0 here
        int ans = var1 / var2;

        System.out.println(
            "Division of va1"
            + " by var2 is: "
            + ans);
        
        //Err 2: Syntax Errors
        
        int a = 40, b = 60;

        // Declared variable Sum with Capital S
        int sum = a + b;

        //Missing semicolon
        System.out.println(
            "Sum of variables is "
            + sum)
        
        //Err 3: Off-by-one Errors: (Logical Error)
        int total = 0;  
        for (int i = 1; i <= 5; i++) {  
            total += i;  
        }  
        System.out.println("The sum of the numbers from 1 to 4 is: " + total); 
        
        //Err 4: Data Type Mismatch
        String text = "Hello";  
        int number = 5;  
        int result = number + text; // Type mismatch  
        System.out.println("Result: " + result);  
        
        //Err 5: invalid method declaration; return type required
        int x = getValue();
        System.out.println(x);
    }  
    
    public static getValue() { //missing type
        return 10;
    }
        
    
}

