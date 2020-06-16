import java.util.*;

public class Project_1_WidgetOrderingSystem
{
  public static void main(String[] args)

  {

    Random RandNumObj = new Random();
    int RandNum = RandNumObj.nextInt(999999999);

    String[] OrderInfo=new String[7];
    Scanner user_input= new Scanner(System.in);

    System.out.println("Welcome to the Widgets Inc. ordering system.\n");
    
    System.out.println("Enter Company Name:");
    OrderInfo[0]=user_input.nextLine();    
    
    System.out.println("Enter number of widgets needed:");
    OrderInfo[1]=user_input.nextLine();

    System.out.println("Enter Shipping Address:");
    OrderInfo[2]=user_input.nextLine();

    System.out.println("Enter Shipping Zip Code:");
    OrderInfo[3]=user_input.nextLine();

    System.out.println("Enter Shipping State:");
    OrderInfo[4]=user_input.nextLine();

    System.out.println("Enter e-mail address for invoicing:");
    OrderInfo[5]=user_input.nextLine();

    System.out.println("Enter contact phone number:");
    OrderInfo[6]=user_input.nextLine();
    
    System.out.println("Your Order Information is as follows\nPlease print a copy of this information for your records:");

    System.out.println("Order Number: "+RandNum);
    System.out.println("Company Name: "+OrderInfo[0]);
    System.out.println("Ordered Widgets: "+OrderInfo[1]);
    System.out.println("Shipping Address: "+OrderInfo[2]);
    System.out.println("Shipping Zip Code: "+OrderInfo[3]);
    System.out.println("Shipping State: "+OrderInfo[4]);
    System.out.println("Invoicing E-mail: "+OrderInfo[5]);
    System.out.println("Contact Phone Number: "+OrderInfo[6]);
  }
}
