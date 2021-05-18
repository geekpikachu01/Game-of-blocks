/*in this class, I try to display the menu for the starters (veg and non-veg.)and 
  the method display()  is invoked by 'obj1'*/ 
import java.util.Scanner;//for scanner class usage
class starters
{
    public char again;//data members
    public int bill;
    Scanner sc=new Scanner(System.in);
  starters()
  //default constructor
  {
        bill=0;
        again='y';
  }
    public int display()
    //to display the menu 
    {
    System.out.println("--------------------------------------------------");
    System.out.println("WELCOME TO THE STARTER MENU!!!!!");
    System.out.println("WHAT WOULD YOU LIKE TO EAT.....");
    System.out.println("ENTER\na)FOR VEGETARIAN STARTERS AND\nb)FOR NON-VEGETARIAN STARTERS");
    char ch=sc.next().trim().charAt(0);
    //accepting a character
    switch(ch)
    {
        case 'a':
        case 'A'://fall through
                 System.out.println("--------------------------------------------------");
                 System.out.println("STARTERS   \t\t\tPRICE(exclusivetax)");
                 System.out.println("1)PANEER TIKKA\t\t\t\t110");
                 System.out.println("2)VEG.SEEKH KEBAB\t\t\t110");
                 System.out.println("3)HARA BHARA KEBAB\t\t\t110");
                 System.out.println("4)CRISPY MUSHROOM\t\t\t120");
                 System.out.println("5)CRISPY CHILLY POTATO\t\t\t120");
                 System.out.println("6)CRISPY AMERICAN CORN\t\t\t140");
                 System.out.println("7)CRISPY BABY CORN\t\t\t140");
                 System.out.println("8)SHANGHAI SPRING ROLL\t\t\t150");
                 System.out.println("9)AMERICAN CORN BALL\t\t\t150");
                 System.out.println("10)CRISPY CHILLY CHANA\t\t\t150");
                 while(again=='y'||again=='Y')
                 {
               System.out.println("Enter the serial number for the order....");
               int a=sc.nextByte();
               a=Math.abs(a);
               System.out.println("--------------------------------------------------");
               if(a<4)
                     { 
                      System.out.println("Enter the number of plates......");
                      int b=sc.nextByte();
                      b=Math.abs(b);
                      bill+=110*b;
                     }
               else if(a<6)
                     { 
                     System.out.println("Enter the number of plates......");
                     int b=sc.nextByte();
                     b=Math.abs(b);
                     bill+=120*b;
                     }
               else if(a<8)
                    {
                     System.out.println("Enter the number of plates......");
                     int b=sc.nextByte();
                     b=Math.abs(b);
                     bill+=140*b;
                    }
               else if(a<11)
                 {
                      System.out.println("Enter the number of plates......");
                      int b=sc.nextByte();
                      b=Math.abs(b);
                      bill+=150*b;
                    }
               else
               System.out.println("SORRY....UNAVAILIBILITY PREVENTS US FROM SERVING YOU....");
               System.out.println("DO YOU WANT TO PLACE ANOTHER ORDER FROM THE STARTER MENU?");
               System.out.println("ENTER 'y'(YES) OR 'n'(NO)");
               again=sc.next().trim().charAt(0);
               System.out.println("--------------------------------------------------");
             }
             break;
            //for case'a'
        case 'b':
        case 'B':
                 System.out.println("--------------------------------------------------");
                 System.out.println("NON-VEG.STARTERS        \t\tPRICE(exclusivetax)");
                 System.out.println("1)CHILLI CHICKEN\t\t\t160");
                 System.out.println("2)MURG CHILLI KEBAB\t\t\t160");
                 System.out.println("3)CHICKEN TIKKA\t\t\t\t170");
                 System.out.println("4)MURG RESHMI KEBAB\t\t\t170");
                 System.out.println("5)CHICKEN SEEKH KEBAB\t\t\t180");
                 System.out.println("6)TANGDI KEBAB\t\t\t\t180");
                 System.out.println("7)DRUMS OF HEAVEN\t\t\t180");
                 System.out.println("8)SHANGHAI CHICKEN\t\t\t180");
                 System.out.println("9)MURG TANDOORI\t\t\t\t190");
                 System.out.println("10)FISH TIKKA\t\t\t\t190");
                 while(again=='y'||again=='Y')
               {
                 System.out.println("Enter the serial number for the order....");
                 int a=sc.nextByte();
                 System.out.println("--------------------------------------------------");
                 a=Math.abs(a);
                 if(a<3)
                 {
                     System.out.println("Enter the number of plates......");
                     int b=sc.nextByte();
                     b=Math.abs(b);
                     bill+=160*b;
                 }
                 else if(a<4)
                 {
                      System.out.println("Enter the number of plates......");
                      int b=sc.nextByte();
                      b=Math.abs(b);
                      bill+=170*b;
                 }
                 else if(a<9)
                 {
                      System.out.println("Enter the number of plates......");
                      int b=sc.nextByte();
                      b=Math.abs(b);
                      bill+=180*b;
                  }
                 else if(a<11)
                 {
                      System.out.println("Enter the number of plates......");
                      int b=sc.nextByte();
                      b=Math.abs(b);
                      bill+=190*b;
                 }
                 else
                 System.out.println("SORRY....UNAVAILIBILITY PREVENTS US FROM SERVING YOU....");
                 System.out.println("--------------------------------------------------");
                 System.out.println("DO YOU WANT TO PLACE ANOTHER ORDER FROM THE STARTER MENU?");
                 System.out.println("ENTER 'y'(YES) OR 'n'(NO)");
                 again=sc.next().trim().charAt(0);
                 System.out.println("--------------------------------------------------");
                 }
                 break;
                 default:System.out.println("INVALID INPUT ..PLEASE ENTER EITHER 'a' OR 'b'");
    }
    return bill;
  }
}              
 
