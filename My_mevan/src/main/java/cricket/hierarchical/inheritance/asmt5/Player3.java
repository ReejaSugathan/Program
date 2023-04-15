package cricket.hierarchical.inheritance.asmt5;

public class Player3 extends CricketTeam 
{
	String name,type;
	int matches,score,wickets;
	public Player3(String name,String type,int matches,int score,int wickets)
	{
		this.name=name;
		this.type=type;
		this.matches=matches;
		this.score=score;
		this.wickets=wickets;
	}
	public void display()
	{
	System.out.println(name+" played "+matches+" matches and scored "+score+" runs.");
	System.out.println("He is also a good "+type+" and has taken "+wickets+" wickets "+teamName);
	}
}
