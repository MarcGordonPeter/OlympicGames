
import java.util.ArrayList;
import java.util.List;

public class CompositeTeam implements Team {

    private String name;

    private List<Team> subteams = new ArrayList<Team>();

    public CompositeTeam(String name) {
        this.name = name;
    }

    public void printInfo(String forTeam) {
        System.out.println(name);
        for (Team sub : subteams) {
            if (forTeam == "All") {
                sub.printInfo(forTeam);
            } else if (sub.getName() == forTeam) {
                sub.printInfo("All");
            }
        }
    }

    public void printInfoAtheletes(String forTeam) {
        System.out.println(name);
        for (Team sub : subteams) {
            if (forTeam == "All") {
                sub.printInfoAtheletes(forTeam);
            } else if (sub.getName() == forTeam) {
                sub.printInfoAtheletes("All");
            }
        }
    }

    public void printInfoMedals(String forTeam) {
        System.out.println(name);
        for (Team sub : subteams) {
            if (forTeam == "All") {
                sub.printInfoMedals(forTeam);
            } else if (sub.getName() == forTeam) {
                sub.printInfoMedals("All");
            }
        }
    }

    public String getName() {
        return name;
    }

    public void addTeam(Team team) {
        subteams.add(team);
    }
}
