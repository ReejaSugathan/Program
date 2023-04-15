package cricket.hierarchical.inheritance.asmt5;

public class Player1 extends CricketTeam 
{
	String name,type;
	int matches,score,centuries;
	public Player1(String name,String type,int matches,int score,int centuries)
	{
		this.name=name;
		this.type=type;
		this.score=score;
		this.matches=matches;
		this.centuries=centuries;
	}
	public void display()
	{
	System.out.println(name+" played "+matches+" matches and scored "+score+" runs.");
	System.out.println("He is a strong "+type+" and made "+centuries+" centuries "+teamName);
	}
}
