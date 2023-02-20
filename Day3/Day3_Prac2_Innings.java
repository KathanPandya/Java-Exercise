public class Day3_Prac2_Innings {
	private String teamname;
	private String inningsname;
	private int runs;
	
	public String getTeamname() {
		return teamname;
	}

	public void setTeamname(String teamname) {
		this.teamname = teamname;
	}

	public String getInningsname() {
		return inningsname;
	}

	public void setInningsname(String inningsname) {
		this.inningsname = inningsname;
	}

	public int getRuns() {
		return runs;
	}

	public void setRuns(int runs) {
		this.runs = runs;
	}

	public  void displayInningsDetails(String s1, String s2, int i1) {
		Day3_Prac2_Innings Team1 = new Day3_Prac2_Innings();
		System.out.println(teamname);
		System.out.println(inningsname);
		System.out.println(runs);
		
		if(inningsname.equalsIgnoreCase("first")) {
			System.out.println("Need " + ++runs +" runs to win");
		}
		else if(inningsname.equalsIgnoreCase("second")) {
			System.out.println("Match ended");
		}
	}
}
