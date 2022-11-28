public class Leaf implements Team {
    private String name;
    private int athletes;
    private int numberOfGoldMedals;

    public Leaf(String name, int athletes, int goldMedals) {
        this.name = name;
        this.athletes = athletes;
        this.numberOfGoldMedals = goldMedals;
    }

    public void printInfo(String forTeam) {
        System.out.println("Team: " + name + ", Number of Athletes: " + athletes + ", Number of Gold Medals: "
                + numberOfGoldMedals);
    }

    public void printInfoAtheletes(String forTeam) {
        System.out.println("Team: " + name + ", Number of Athletes: " + athletes);
    }

    public void printInfoMedals(String forTeam) {
        System.out.println("Team: " + name + ", Number of Gold Medals: "
                + numberOfGoldMedals);
    }

    public String getName() {
        return name;
    }
}
