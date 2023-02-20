import java.util.*;
public class Day3_Prac2_InningsMain {

	public static void main(String[] args) {
		
		Day3_Prac2_Innings team1 = new Day3_Prac2_Innings();
		
		System.out.println("Enter the team name:-");
		Scanner s = new Scanner(System.in);
		String teamname = s.nextLine();
		team1.setTeamname(teamname);
		
		System.out.println("Enter Session:-");
		String session = s.nextLine();
		team1.setInningsname(session);
		
		System.out.println("Enter runs:-");
		int rns = s.nextInt();
		team1.setRuns(rns);
		
		team1.displayInningsDetails(teamname, session, rns);
	}

}
