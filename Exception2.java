
public class Exception2
{
    public static void main(String[] args)
    {
        int num1 = 6;
        int num2 = 2;
        int result = 0;
        int Values[] = {1,2,3,4,5};
        String name = null;

        try
        {
            result = num1 / num2;
            System.out.println(Values[5]);
        }
        catch(ArithmeticException e) // use 'e' instead of 'obj'
        {
            System.out.println("Cannot divide by zero");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Stay in your limits");
        }
        catch(Exception e)
        {
            System.out.println("Something went wrong");
        }

        System.out.println(result);
        System.out.println("Bye...");
    }
}