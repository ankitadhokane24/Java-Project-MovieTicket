package simple;
import java.util.*;

//usermanagerclass login,creating account;
public class Usermanager
{
    private Map<String,String> customerinfo;
    private Map<String,String> ownerinfo;

    public usermanager()
    {
        this.customerinfo=new HashMap<>();
        this.ownerinfo=new HashMap<>();
    }

    //get customer info
    public void registercustomer(String username,String Password)
    {
        customerinfo.put(username, Password);
        System.out.println("Customer Registration successfull");
        System.out.println();
    }

   
    //if sucessfully login or not
    public boolean authenticatecustomer(String username,String password)
    {
        return customerinfo.containsKey(username) && customerinfo.get(username).equals(password);
    }

}




/*ain class
//public class userauthentication
//{
    public static void main(String[] args)
    {
        usermanager user=new usermanager();
        Scanner sinput=new Scanner(System.in);

        boolean running=true;

        while(running)
        {
            System.out.println("WELCOME TO USER AUTHENTICATION");
            System.out.println("1.Register as Customer");
            System.out.println("2.Register as Owner");
            System.out.println("3.Login");
            System.out.println("4.Exit");

            System.out.println("Choose an Option:");
            int choice=sinput.nextInt();

            switch(choice)
            {
                case 1:
                    System.out.print("Enter Customer Username:");
                    String customerusername=sinput.next();
                    System.out.print("Enter Customer Password:");
                    String customerpassword=sinput.next();
                    user.registercustomer(customerusername, customerpassword);
                break;

                case 2:
                    System.out.print("Enter Owner Username:");
                    String ownerrusername=sinput.next();
                    System.out.print("Enter Owner Password:");
                    String ownerpassword=sinput.next();
                    user.registerowner(ownerrusername, ownerpassword);
                break;

                case 3:
                    System.out.print("Enter Username:");
                    String username=sinput.next();
                    System.out.print("Enter Password:");
                    String password=sinput.next();

                    //checking of each register person
                    if(user.authenticatecustomer(username, password))
                    {
                        System.out.println("Customer Login Sucessfull");
                        System.out.println();
                    }
                    else if(user.authenticateowner(username, password))
                    {
                        System.out.println("Owner Login Successfull");
                        System.out.println();
                    }
                    else
                    {
                        System.out.println("Invalid Username and password...Please Try Again!!");
                    }
                break;

                case 4:
                    System.out.println("Exiting from user Authentication");
                    running=false;
                break;

                default:
                    System.out.println("Invalid User");
                }
        }

   }
}*/