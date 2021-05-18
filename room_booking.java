import java.util.*;
class room_booking
{
  int days,bill;
  room_booking()
  //non-parameterised constructor
  {
        days=0;
        bill=0;
  }
    int roomno()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("--------------------------------------------------");
        System.out.println("SO......YOU ARE TIRED AND WANT A ROOM TO REST");
        System.out.println("THESE ARE THE ROOMS WHICH WE PROVIDE YOU WITH.....");
        System.out.println("1)SEMI-DELUXE (FLOOR 1)");   
        System.out.println("2)DELUXE(FLOOR 2)"); 
        System.out.println("3)SUPER DELUXE(FLOOR 3)");
        System.out.println("SELECT THE ROOM YOU WOULD LIKE TO STAY IN");
        int rn=sc.nextInt();
        rn=Math.abs(rn);
        switch(rn)
        {
        case 1:
        bill+=floor1.called();
        break;
        case 2:
        bill+=floor2.called();
        break;
        //for case 2
        case 3:
        bill+=floor3.called();
        break;
        //for case 3
        default:
        System.out.println("PLEASE MAKE A VALID CHOICE (1,2 OR 3)");
     }
   return bill;
  }
}
