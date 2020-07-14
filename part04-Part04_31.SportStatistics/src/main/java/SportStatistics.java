
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {
    public static ArrayList<Team> teams = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> listofteams = new ArrayList<>();
        System.out.println("File:");
        String file = scan.nextLine();
        try (Scanner textscanner = new Scanner(Paths.get(file))) {
            while (textscanner.hasNextLine()) {
                String line = textscanner.nextLine();
                String[] parts = line.split(",");
                String teamLeft = parts[0];
                String teamRight = parts[1];
                int leftScore = Integer.valueOf(parts[2]);
                int rightScore = Integer.valueOf(parts[3]);
                if (!listofteams.contains(teamLeft)) {
                    listofteams.add(teamLeft);
                    teams.add(new Team(teamLeft));
                }  
                if(!listofteams.contains(teamRight)) {
                    listofteams.add(teamRight);
                    teams.add(new Team(teamRight));
                }
                int teamLeftIndex = getTeamIndex(teamLeft);
                int teamRightIndex = getTeamIndex(teamRight);
                if (leftScore > rightScore) {
                    teams.get(teamLeftIndex).setWin();
                    teams.get(teamRightIndex).setLose();
                } else {
                    teams.get(teamRightIndex).setWin();
                    teams.get(teamLeftIndex).setLose();
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        
        System.out.println("Team: ");
        String findTeam = scan.nextLine(); 
        if (getTeamIndex(findTeam) == 99) {
            System.out.println("Games: 0" );
            System.out.println("Wins: 0" );
            System.out.println("Losses: 0" );
        } else {
            System.out.println("Games: " + teams.get(getTeamIndex(findTeam)).getMatches());
            System.out.println("Wins: " + teams.get(getTeamIndex(findTeam)).getWins());
            System.out.println("Losses: " + teams.get(getTeamIndex(findTeam)).getLosses());
    }   }
    public static int getTeamIndex(String nameToFind) {
        int index = 99;
        for (int i = 0; i<teams.size(); i++) {
            if (nameToFind.equals(teams.get(i).getName())) {
                index = i;
            }
        }
        return index;
    }
}
