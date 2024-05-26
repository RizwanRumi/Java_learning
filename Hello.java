/**
 * Hello
 */
public class Hello {
    
    public static void main(String[] args) 
    {
        // literals

        // int num1 = 0b101; //binary format

        //int num1 =  0x7E; // hexa decimal

        // int num1 = 10_00_00_000; // easy to count zeros

        // double num1 = 12e10;

         //System.out.println(num1);

        // char ch = 'a';
        // ch++;
        // System.out.println(ch);

        String day = "Monday";
        String result = ""; 

        // result = switch (day) {
        //     case "Saturday", "Sunday" -> "6am";
            
        //     case "Monday", "Wednesday" -> "7am";
        
        //     default -> "8am";
        // };
       
        // another way 

         result = switch (day) {
            case "Saturday", "Sunday" : yield  "6am";
            
            case "Monday", "Wednesday" : yield "7am";
        
            default : yield "8am";
        };


        System.out.println(result);

    }  
      
}

