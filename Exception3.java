// import java.util.InputMismatchException;
// import java.util.Scanner;

// public class Exception3
// {
//     public static void main(String[] args) 
//     {
//         int num = 0;
//         Scanner sc = new Scanner(System.in);

//         try
//         {
//             num = sc.nextInt();
//         }
//         catch(InputMismatchException e)
//         {
//             System.out.println("Enter a number");
//         }
//         finally
//         {
//             sc.close();
               // System.out.println("Resource closed")
//         }
//         System.out.println(num);
        
//     }
// }
// DRY = Do not repeat yousrself

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception3
{
    public static void main(String[] args) 
    {
        int num = 0;
        
        // try with resources
        try( Scanner sc = new Scanner(System.in);)
        {
            num = sc.nextInt();
        }
    
        System.out.println(num);
        
    }
}
