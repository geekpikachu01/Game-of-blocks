/*in this class, I try to display the menu for the main course (veg and non-veg.) that the user 
can enjoy and the method display()  is invoked by 'obj2' of main() method of the waiter class*/ 
import java.util.Scanner;
class main_course
{
  char again;
  int bill;
  Scanner sc=new Scanner(System.in);
  main_course()
  //default contructor
  {
        bill=0;
        again='y';
  }
     public int display()
    {
    System.out.println("--------------------------------------------------");
    System.out.println("WELCOME TO THE MAIN COURSE MENU!!!!!");
    System.out.println("WHAT WOULD YOU LIKE TO EAT.....");
    System.out.println("ENTER\na)FOR INDIAN MAIN COURSE AND\nb)FOR CHINESE MAIN COURSE");
    char ch=sc.next().trim().charAt(0);
    switch(ch)
    {
        case 'a':
        case 'A':System.out.println("--------------------------------------------------");
                 System.out.println("WELCOME TO INDIAN MAIN COURSE!!!!!!");
                 System.out.println("ENTER 1)FOR VEG MAIN COURSE\n2)FOR NON-VEG MAIN COURSE");
                 int choice=sc.nextInt();
        switch(choice)
        {
          case 1:System.out.println("--------------------------------------------------");
                 System.out.println("WELCOME TO VEG INDIAN MAIN COURSE!!!!!!");   
                 System.out.println("INDIAN VEG.DISHES   \t\t\tPRICE(exclusivetax)");
                 System.out.println("1)STUFFED KULCHA\t\t\t 60");
                 System.out.println("2)BUTTER ROTI\t\t\t\t90");
                 System.out.println("3)BUTTER NAAN \t\t\t\t90");
                 System.out.println("4)VEG. PULAO\t\t\t\t110");
                 System.out.println("5)KASHMIRI PULAO\t\t\t140");
                 System.out.println("6)VEGETABLE PAKEEZA\t\t\t140");
                 System.out.println("7)VEGETABLE KADAI\t\t\t140");
                 System.out.println("8)MALAI KOFTA\t\t\t\t140");
                 System.out.println("9)MAKAI CORN PALAK\t\t\t150");
                 System.out.println("10)SHABNAM CURRY\t\t\t\t150");
                 System.out.println("11)KADHAI PANEER\t\t\t150");
                 System.out.println("12)NAVRATAN KORMA\t\t\t180");
                 System.out.println("13)SHAHI PANEER\t\t\t\t180");
                 while(again=='y'||again=='Y')
                 {
                 System.out.println("Enter the serial number for the order....");
                 int a=sc.nextByte();
                 a=Math.abs(a);
                 System.out.println("--------------------------------------------------");
                 if(a<2)
                 {
                      System.out.println("Enter the number of plates......");
                      int b=sc.nextByte();
                      b=Math.abs(b);
                      bill+=60*b;
                    }
                 else if(a<4)
                 {
                     System.out.println("Enter the number of plates......");
                     int b=sc.nextByte();
                     b=Math.abs(b);
                     bill+=90*b;
                    }
                 else if(a<5)
                 {
                      System.out.println("Enter the number of plates......");
                      int b=sc.nextByte();
                      b=Math.abs(b);
                      bill+=110*b;
                    }
                 else if(a<9)
                 {
                      System.out.println("Enter the number of plates......");
                      int b=sc.nextByte();
                      b=Math.abs(b);
                      bill+=140*b;
                    }
                 else if(a<12)
                 {
                      System.out.println("Enter the number of plates......");
                      int b=sc.nextByte();
                      b=Math.abs(b);
                      bill+=150*b;
                    }
                 else if(a<14)
                 {
                      System.out.println("Enter the number of plates......");
                      int b=sc.nextByte();
                      b=Math.abs(b);
                      bill+=180*b;
                    }
                 else 
                 System.out.println("SORRY....UNAVAILIBILITY PREVENTS US FROM SERVING YOU....");
                 System.out.println("DO YOU WANT TO PLACE ANOTHER ORDER?\nENTER 'y' OR 'n'");
                 again=sc.next().trim().charAt(0);
                 System.out.println("--------------------------------------------------");
                 }
                 break;
                 //for case 1
         case 2:System.out.println("--------------------------------------------------");
                System.out.println("WELCOME TO NON-VEG INDIAN MAIN COURSE!!!!!!");
                System.out.println("NON-VEG DISHES\t\t\tPRICE(exclusive tax)");
                System.out.println("1)BUTTER ROTI\t\t\t\t90");
                System.out.println("2)BUTTER NAAN \t\t\t\t90");
                System.out.println("3)FISH SARSOWALA\t\t\t140");
                System.out.println("4)CHICKEN BHARTA\t\t\t150");
                System.out.println("5)MUGHALAI CHICKEN\t\t\t160");
                System.out.println("6)MURG NAVRATAN KORMA\t\t\t160");
                System.out.println("7)FISH DAHNIAWALA\t\t\t160");
                System.out.println("8)KADHAI CHICKEN\t\t\t160");
                System.out.println("9)MURG MASALLAM\t\t\t\t170");
                System.out.println("10)CHICKEN DO PYAZA\t\t\t170");
                System.out.println("11)CHICKEN TIKKA MASALA\t\t\t180");
                System.out.println("12)CHICKEN TIKKA LABADAR\t\t180");
                System.out.println("13)MUTTON ROGAN JOSH\t\t\t190");
                System.out.println("14)PRAWN MALAI CURRY\t\t\t190");
                while(again=='y'||again=='Y')
                {
                 System.out.println("Enter the serial number for the order....");
                 int a=sc.nextInt();
                 a=Math.abs(a);
                 System.out.println("--------------------------------------------------");
                 if(a<3)
                 {
                      System.out.println("Enter the number of plates.....");
                      int b=sc.nextInt();
                      b=Math.abs(b);
                      bill+=90*b;
                    }
                 else if(a<4)
                 {
                      System.out.println("Enter the number of plates.....");
                      int b=sc.nextInt();
                      b=Math.abs(b);
                      bill+=140*b;
                    }
                 else if(a<5)
                 {
                      System.out.println("Enter the number of plates.....");
                      int b=sc.nextInt();
                      b=Math.abs(b);
                      bill+=150*b;
                    }
                 else if(a<9)
                 {
                      System.out.println("Enter the number of plates.....");
                      int b=sc.nextInt();
                      b=Math.abs(b);
                      bill+=160*b;
                    }
                 else if(a<11)
                 {
                      System.out.println("Enter the number of plates.....");
                      int b=sc.nextInt();
                      b=Math.abs(b);
                      bill+=170*b;
                    }
                 else if(a<13)
                 {
                      System.out.println("Enter the number of plates.....");
                      int b=sc.nextInt();
                      b=Math.abs(b);
                      bill+=180*b;
                    }
                  else if(a<15)
                  {
                      System.out.println("Enter the number of plates.....");
                      int b=sc.nextInt();
                      b=Math.abs(b);
                      bill+=190*b;
                    }
                 else
                 System.out.println("SORRY....UNAVAILIBILITY PREVENTS US FROM SERVING YOU....");
                 System.out.println("DO YOU WANT TO PLACE ANOTHER ORDER?\nENTER 'y' OR 'n'");
                 again=sc.next().trim().charAt(0);
                 System.out.println("--------------------------------------------------");
                 }
                 break;//for case 2
                 default:System.out.println("INVALID INPUT ..PLEASE ENTER EITHER '1' OR '2'");
        } 
        //end of inner switch block(for veg, or non-veg. Indian main course)
        break;
        //for case 'a'
       case 'b':
       case 'B':System.out.println("--------------------------------------------------");
                System.out.println("WELCOME CHINESE MAIN COURSE!!!!!!");
                System.out.println("DISHES\t\t\tPRICE(exclusive tax)");
                System.out.println("1)CHICKEN MANCHURIAN\t\t\t190");
                System.out.println("2)CHILLY PANEER\t\t\t\t190");
                System.out.println("3)PANEER MUNCHURIAN\t\t\t190");
                System.out.println("4)CHICKEN NOODLES\t\t\t210");
                System.out.println("5)VEG.HAKKA NOODLES\t\t\t210");
                System.out.println("6)VEG.FRIED RICE\t\t\t210");
                System.out.println("7)CHICKEN FRIED RICE\t\t\t210");
                System.out.println("8)KIMCHI VEG.RICE\t\t\t210");
                System.out.println("9)SCHEZWAN FRIED RICE\t\t\t240");
                System.out.println("10)SHANGHAI FRIED RICE\t\t\t240");
                System.out.println("11)CHIILY CHICKEN\t\t\t280");
                System.out.println("12)SCHEZWAN CHICKEN\t\t\t280");
                while(again=='y'||again=='Y')
                 {
                 System.out.println("Enter the serial number for the order....");
                 int a=sc.nextInt();
                 a=Math.abs(a);
                 System.out.println("--------------------------------------------------");
                 if(a<4)
                 {
                      System.out.println("Enter the number of plates.....");
                      int b=sc.nextInt();
                      b=Math.abs(b);
                      bill+=190*b;
                    }
                  
                 else if(a<9)
                 {
                      System.out.println("Enter the number of plates.....");
                      int b=sc.nextInt();
                      b=Math.abs(b);
                      bill+=210*b;
                    }
                 else if(a<11)
                 {
                     System.out.println("Enter the number of plates.....");
                     int b=sc.nextInt();
                     b=Math.abs(b);
                     bill+=240*b;
                    }
                 else if(a<13)
                 {
                     System.out.println("Enter the number of plates.....");
                     int b=sc.nextInt();
                     b=Math.abs(b);
                     bill+=280*b;
                    }
                 else
                 System.out.println("SORRY....UNAVAILIBILITY PREVENTS US FROM SERVING YOU....");
                 System.out.println("DO YOU WANT TO PLACE ANOTHER ORDER?\nENTER 'y' OR 'n'");
                 again=sc.next().trim().charAt(0);
                 System.out.println("--------------------------------------------------");
                 }
                 break;
                 //FOR CASE 'B'
        default:System.out.println("INVALID INPUT...PLEASE ENTER 'a' OR 'b'");
    }
    return bill;
    //its value is stored in result2 in the main() method of the waiter class
  }  
}
