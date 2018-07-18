import java.util.*;

class Player
{
Scanner sc=new Scanner(System.in);
    String name;
    void getname()
    {
        System.out.print("Player Name? : ");
        name=sc.nextLine();
    }
    void putname()
    {
        System.out.println("Name : "+name);
    }
}
class CricPlayer extends Player
{
    CricPlayer()
    {
    System.out.println("He is The Cricket Player..!! -  "+name);
    }
}
class Batsman extends CricPlayer
{
Scanner sc=new Scanner(System.in);
    int run;
    void getrun()
    {
        System.out.println("Runs Scored ? : ");
        run=sc.nextInt();
    }
    void putrun()
    {
        System.out.println("Total Runs: " + run);
    }
}

class Bowler extends CricPlayer
{
Scanner sc=new Scanner(System.in);
    int wic;
    void getwic()
    {
        System.out.println("Wickets Taken ? : ");
        wic=sc.nextInt();
    }
    void putwic()
    {
        System.out.println("Total Wickets: " + wic);
    }
}
class Test
{
    public static void main(String a[])
    {
        Batsman b1=new Batsman();
        Bowler b2=new Bowler();
        b1.getname();
        b1.getrun();
        System.out.println("***** DETAILS *****");
        b1.putname();
        b1.putrun();


    }
}
