package cricket.hierarchical.inheritance.asmt5;

public class CricketTeam
{
static String teamName="for India. ";

public static void main(String[] args)
{
	Player1 p1 = new Player1("Sachin","Batsmen", 250, 11324, 100);
	p1.display();
	System.out.println();
	Player2 p2 = new Player2("Dhoni","WicketKeeper", 153, 6021, 120);
	p2.display();
	System.out.println();
	Player3 p3 = new Player3("Harbhajan","Bowler", 189, 1500, 320);
	p3.display();
}

}
