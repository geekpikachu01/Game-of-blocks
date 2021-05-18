import java.util.Scanner;
class reception
{ 
  static String name;
  static char again;
  static long tb;
  //total bill
  static
  //static block
  {
        tb=0;
        again='y';
  }
  static void main()
  {
    /*it plays a vital role in the co-ordinative functioning of all the classes involved in the 
     project by invoking each of them  as per  the  users choice*/
   Scanner sc=new Scanner(System.in);
   System.out.println("PLEASE ENTER YOUR NAME");
   name=sc.nextLine();
   //ACCEPTS NAME
    while(again=='y'||again=='Y')
   {
     System.out.println("WHAT WOULD YOU LIKE TO DO .....");
     System.out.println("1)VISIT OUR RESTAURANT\n2)BOOK A ROOM");
     System.out.println("ENTER YOUR CHOICE.......");
     int a=sc.nextInt();
     a=Math.abs(a);
     //converting the value of 'a' to a positive integer if at all it is negative
     switch(a)
     {
       case 1:taking_order obj1=new taking_order();
              int result1=obj1.choice();
              tb+=result1;
              break;
       case 2:room_booking obj2=new room_booking();
              int result2=obj2.roomno();
              tb+=result2;
              break;
       default:System.out.println("INVALID INPUT....PLEASE INPUT '1' OR '2' ");
      }
     System.out.print("DO YOU WANT TO ");
     System.out.println("ORDER SOMETHING OR BOOK A ROOM");
     System.out.println("ENTER 'y'(YES) OR 'n'(NO)");
     again=sc.next().trim().charAt(0);
    }
   System.out.println();
   System.out.println();
   System.out.println();
   System.out.println();
   System.out.println();
   System.out.println();
   String choice,comment;
   //object declaration of class String
   choice=sc.nextLine();
   System.out.print("WOULD YOU LIKE TO COMMENT ON OUR SERVICE MRS./MR."+name);
   System.out.println("PLEASE ENTER \"YES\" OR \"NO\"");
   //escape sequences
   choice=sc.nextLine();
   if(choice.equalsIgnoreCase("yes"))
   {   
       comment=sc.nextLine();
       System.out.println("ENTER THE COMMENT");
       comment=sc.nextLine();
       System.out.println("THANK YOU");
   }
   else
   {
       System.out.println("WE WILL ASSUME IT BE GOOD");
   }
   System.out.println();
   System.out.println();
   System.out.println();
   System.out.println();
   System.out.println();
   System.out.println();
   if(tb>0)
   {
    System.out.println("-------------------------------------------------------");
    System.out.println("********************HOTEL WESTIN***********************");
    System.out.println("***********************BILL****************************");
    System.out.println("-------------------------------------------------------");
    System.out.println("          BILL(EXCLUSIVE TAX)="+tb);
    System.out.println("          TAX PERCENT=15%");
    System.out.println("          TOTAL BILL(inclusive of tax)="+(tb+(tb*0.15)));
   }
   else 
   {
       System.out.println("WE ARE SORRY IF WE COULD NOT PROVIDE YOU WITH SOMETHING");
    }
   System.out.println("          YOUR COMFORT IS OUR PRIME PRIORITY");
   System.out.println("          PLEASE VISIT AGAIN");
   //calculating and displaying the bill
  }
}

