import java.util.*;
class Game
{
    static Scanner sc=new Scanner(System.in);
    static int n,pos[];
    int[]s1={26,58,70,84,91,93,99};
    int[]s2={3,1,32,56,72,27,79};
    int[]l1={19,29,35,43,61,71,87};
    int[]l2={37,66,45,64,82,89,96};
    private void display()
    {
        System.out.println("GENERAL INSTRUCTIONS\nSnakes are present at positions 26,58,70,84,91,93,99 and will take you to 3,1,32,56,72,27,79 respectively\nLadders are present at 19,29,35,43,61,71,87 and will take you to 37,66,45,64,82,89,96 respectively\nYou get another chance if you roll a 6 but this is only once per turn\nTo win one must reach exactly 100\nGood luck and happy gaming!");
    }
    private void accept()
    {
        System.out.println("\nHow may players want to play?");
        n=sc.nextInt();
        pos=new int[n];
    }
    private void play(int roll,int j)
    {
        pos[j]+=roll;
        for(int i=0;i<7;i++)
        {
            if(pos[j]==s1[i])
            {
                System.out.println("Oops! A snake bit you!:(");
                pos[j]=s2[i];
                break;
            }
            if(pos[j]==l1[i])
            {
                System.out.println("Yayy! You climbed a ladder! :)");
                pos[j]=l2[i];
                break;
            }
        }
    }
    public static void main()
    {
        Game obj=new Game();
        obj.display();
        obj.accept();
        int k=1;
        while(true)
        {
            System.out.println("\nTURN "+k++);
            for(int i=0;i<n;i++)
            {
                System.out.println("Enter the number rolled by player "+(i+1));
                int dice=sc.nextInt();
                if(dice==6)
                {
                    pos[i]+=6;
                    System.out.println("It's your turn again...enter the number rolled ");
                    dice=sc.nextInt();
                    obj.play(dice,i);
                }
                else
                {
                    obj.play(dice,i);
                }
                System.out.println("Current position of player "+(i+1)+" is "+pos[i]);
                if(pos[i]==100)
                {
                    System.out.println("Player "+(i+1)+" wins!!");
                    System.exit(0);
                }
            }
        }
    }
}