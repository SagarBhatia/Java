import java.util.*;
class InvalidEmail extends Exception
{
}

class InvalidPhone extends Exception
{
}

class employee
{
public static void main(String a[])
{
    Scanner sc=new Scanner(System.in);
    String email;
    String ph;
    System.out.println("Enter Email and Phone NO: ");
    email=sc.next();
    ph=sc.next();
    try
    {
        if(email.indexOf(".")<0 && email.indexOf("@")<0)
        {
            throw new InvalidEmail();
        }
        if(ph.length()>10)
        {
            throw new InvalidPhone();
        }
    }
    catch(InvalidEmail obj)
    {
        System.out.println("Invalid Email");
    }
    catch(InvalidPhone obj)
    {
        System.out.println("Invalid Phone NUmber");
    }
}
}
