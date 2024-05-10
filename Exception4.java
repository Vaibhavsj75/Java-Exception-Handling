
// // Handling vs Ducking the Exception

// class Demo{
//     public void a() throws Exception
//     {   
//         b();
//     }
//     public void b() throws Exception   
//     {
//         int num1 = 6;
//         int num2 = 0;

//         int result = num1 / num2;
//         System.out.println(result);
//     }    
// }
// public class Exception4
// {
//     public static void main(String[] args) 
//     {
//         Demo obj = new Demo();

//         try
//         {
//             obj.a();
//         }
//         catch(Exception e)
//         {
//             System.out.println("Error");
//         }
//     }
// }


// class MyException extends Exception
// {
//     public MyException(){}

//     public MyException(String msg)
//     {
//         super(msg);
//     }
// }

// public class Exception4
// {
//     public static void main(String[] args) 
//     {
//         int num1 = 6;
//         int num2 = -2;
//         try
//         {
//         if(num2 < 0)
//         {
//             Exception e = new MyException("Negative Number");
//             throw e;
//         }
//         else
//         {
//             int result = num1 / num2;
//             System.out.println(result);
//         }
//         }
//         catch(Exception e)
//         {
//             System.out.println("Enter a valid number"+ e);
//         }
//     }
// }