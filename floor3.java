import java.util.*;
class floor3
{
static int called()
{
    Scanner sc=new Scanner(System.in);
    int bill=0,days;
    System.out.println("YOUR ROOM NUMBER IS:-"+(int)(Math.random()*100+200));
    System.out.println("SO.....LET ME SHOW YOU YOUR ROOM...");
    System.out.println("THIS IS THE DOUBLE BED,BALCONY,SOFA,TELEVISION AND A BATHROOM ");
    System.out.println("SELECT THE DURATION FOR WHICH YOU WANT A ROOM..... ");
    days=sc.nextInt();
    days=Math.abs(days);
    System.out.println("PRICE PER NIGHT IS 5000");
    System.out.print("WE HOPE YOU ENJOY YOUR STAY,");
    System.out.println("IN CASE OF ANY PROMBLEMS PLEASE CONTACT 6903");
    bill= days*5000;
    return bill;
 }
}
