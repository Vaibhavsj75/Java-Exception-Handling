
public class ExceptionFirst
{
    public static void main(String[] args)
    {
        int num1 = 6;
        int num2 = 2;
        int result = 0;

        try
        {
            result = num1 / num2;
        }
        catch(Exception e) // use 'e' instead of 'obj'
        {
            System.out.println("Something went wrong");
        }

        System.out.println(result);
        System.out.println("Bye...");
    }
}