import java.util.Scanner;
class floor2
{
    static int called()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("WOULD YOU LIKE TO CHOOSE A ROOM WITH AIR-CONDITIONER OR NO");
        System.out.println("ENTER\na)FOR AC\nb)FOR NON-AC");
        char ch=sc.next().trim().charAt(0);
        System.out.println("--------------------------------------------------");
        int days,bill=0;
        switch(ch)
          {
            case 'a':
            case 'A':
            //CONCEPT OF FALL THROUGH IN USE
            System.out.println("YOUR ROOM NUMBER IS:-"+(int)(Math.random()*100+125));
            System.out.println("SO.....LET ME SHOW YOU YOUR ROOM...");
            System.out.println("THIS IS THE DOUBLE BED,SINGLE BED,SOFA,TELEVISION AND A BATHROOM ");
            System.out.println("SELECT THE DURATION FOR WHICH YOU WANT A ROOM..... ");
            days=sc.nextInt();
            days=Math.abs(days);
            System.out.println("PRICE PER NIGHT IS 4500");
            System.out.print("WE HOPE YOU ENJOY YOUR STAY,");
            System.out.println("IN CASE OF ANY PROMBLEMS PLEASE CONTACT 6902");
            bill=days*4500;
            break;
            case 'b':
            case 'B':
            System.out.println("YOUR ROOM NUMBER IS:-"+(int)(Math.random()*100+125));
            System.out.println("SO.....LET ME SHOW YOU YOUR ROOM...");
            System.out.println("THIS IS THE DOUBLE BED,SOFA,TELEVISION,AN AC AND A BATHROOM ");
            System.out.println("SELECT THE DURATION FOR WHICH YOU WANT A ROOM..... ");
            days=sc.nextInt();
            days=Math.abs(days);
            System.out.println("PRICE PER NIGHT IS 4000");
            System.out.print("WE HOPE YOU ENJOY YOUR STAY,");
            System.out.println("IN CASE OF ANY PROMBLEMS PLEASE CONTACT 6902");
            bill=days*4000;
            break;
            default:
            System.out.println("SORRY WE HAVE NO OTHER ROOM");
        }
        return bill;
    }
}
         