package cricket.hierarchical.inheritance.asmt5;

public class Player2 extends CricketTeam 
{
	String name,type;
	int matches,score,catches;
	public Player2(String name,String type,int matches,int score,int catches)
	{
		this.name=name;
		this.type=type;
		this.matches=matches;
		this.catches=catches;
		this.score=score;
	}
	public void display()
	{
	System.out.println(name+" played "+matches+" matches and scored "+score+" runs.");
	System.out.println("He is a strong "+type+" and has "+catches+" catches "+teamName);
	
	}
}
