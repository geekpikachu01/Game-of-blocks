import java.util.*;
class taking_order
{
  char again;
  //data members
  int tb;
  //total bill
  taking_order()
  //non-parameterised constructor
  {
        tb=0;
        again='y';
  }
  int choice()
  {
      Scanner sc=new Scanner (System.in);
      while(again=='y'||again=='Y')
     {
        System.out.print("WHAT WOULD YOU LIKE TO ORDER ");
        System.out.println("ENTER\n1)FOR STARTERS\n2)FOR MAIN COURSE\n3)FOR DESERTS");
        System.out.println("ENTER YOUR CHOICE");
        int ch=sc.nextInt();
        ch=Math.abs(ch);
        int result1,result2,result3;
        result1=result2=result3=0;
        switch(ch)
        {
            case 1:starters obj1=new starters();
                   result1=obj1.display();
          //result1 stores the bill for the starters which is returned by class starters
                   tb+=result1;
                   break;
            case 2:main_course obj2=new main_course();
                   result2=obj2.display();
          /*result2 stores the bill for the main course which is returned by the method display()
           of class main_course*/
                   tb+=result2;
                   break;
            case 3:desserts obj3=new desserts();
                   result3=obj3.display();
          /*result3 stores the bill for the desserts which is returned by the method display()
            of class desserts*/
                   tb+=result3;
                   break;
        }
        System.out.print("DO YOU WANT TO ");
        System.out.println("ORDER SOMETHING ELSE");
        System.out.println("ENTER 'y'(YES) OR 'n'(NO)");
        again=sc.next().trim().charAt(0);
     }
     return tb; 
     //returns total bill
  }
}
    
