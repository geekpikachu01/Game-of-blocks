/*in this class ,I try to display the desserts that the user can enjoy and ask him/her the  dessert 
 he/she would like to have and the quantity and then calculate and return the bill of the 
 desserts*/
import java.util.Scanner;
class desserts
{
  char again;//global variables
  int bill;
  Scanner sc=new Scanner(System.in);
  desserts()
  //default constructor
  {
        bill=0;
        again='y';
  }
  public int display()
    {
    System.out.println("--------------------------------------------------");
    System.out.println("WELCOME TO THE DESSERT MENU!!!!!");
    System.out.println("WHAT WOULD YOU LIKE TO EAT.....");
    System.out.println("DESSERTS   \t\t\tPRICE(exclusivetax)");
    System.out.println("1)CHOCOLATE BROWNIE\t\t90");
    System.out.println("2)MARBLE CAKE\t\t\t90");
    System.out.println("3)CHOCOLATE DOUGHNUT\t\t90");
    System.out.println("4)MOCHA MAGIC\t\t\t90");
    System.out.println("5)BLACK FOREST GATEAUX\t\t90");
    System.out.println("6)MANGO SHAKE\t\t\t80");
    System.out.println("7)PINEAPPLE SHAKE\t\t80");
    System.out.println("8)TOOTY FRUITY\t\t\t110");
    System.out.println("9)SOFTY PINEAPPLE\t\t110");
    System.out.println("10)SOFTY CRUNCHY CHOCOLATE\t110");
    //displaying choices
    while(again=='y'||again=='Y')
        {
         
         System.out.println("Enter the serial number for the order....");
         int a=sc.nextByte();
         a=Math.abs(a);
         System.out.println("--------------------------------------------------");
          if(a<6)
         {
                 System.out.println("Enter the number of plates......");
                 int b=sc.nextByte();
                 b=Math.abs(b);
                 bill+=90*b;
         }
         else if(a<8)
         {
                 System.out.println("Enter the number of plates......");
                 int b=sc.nextByte();
                 b=Math.abs(b);
                 bill+=80*b;
         }
         else if(a<11)
         {
                 System.out.println("Enter the number of plates......");
                 int b=sc.nextByte();
                 b=Math.abs(b);
                 bill+=110*b;
         }
         else
            System.out.println("SORRY....UNAVAILIBILITY PREVENTS US FROM SERVING YOU....");
         System.out.println("DO YOU WANT TO PLACE ANOTHER ORDER FROM THE DESSERT MENU?");
         System.out.println("ENTER 'y'(YES) OR 'n'(NO)");
         again=sc.next().trim().charAt(0);
         System.out.println("--------------------------------------------------");
        }
        return bill;
        //its value is stored in result3 in the main() method of reception class
    }
}
