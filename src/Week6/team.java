package Week6;

import java.util.ArrayList;

public class team {
    private String teamName;
    private String coachName;
    private String conferenceName;
    private ArrayList<person> roster;

    public team(String teamName, String coachName, String conferenceName){
        this.teamName = teamName;
        this.coachName = coachName;
        this.conferenceName = conferenceName;
        this.roster = new ArrayList<>();

    }
    public void addPerson(person person) {
        roster.add(person);
    }

    public person findPersonByName(String name) {
        for (person person : roster) {
            if (person.getName().equals(name)) {
                return person;
            }
        }
        return null;
    }

    public person findPersonByJerseyNumber(int jerseyNumber) {
        for (person person : roster) {
            if (person.getJerseyNum() == jerseyNumber) {
                return person;
            }
        }
        return null;
    }

    public void displayRoster() {
        System.out.println("Roster for " + teamName + ":");
        for (person person : roster) {
            System.out.println(person.getName());
        }
        System.out.println();
    }

    public static void main(String[] args) {
        team team = new team("Team A", "Coach John", "Conference X");

        team.addPerson(new person("Alice", "1234567890", "1990-01-01", 1));
        team.addPerson(new person("Bob", "2345678901", "1991-02-02", 2));
        team.addPerson(new person("Charlie", "3456789012", "1992-03-03", 3));

        team.displayRoster();

        String searchName = "Bob";
        person foundByName = team.findPersonByName(searchName);
        if(foundByName != null){
            System.out.println("Player found!");
            System.out.println("Player: " + foundByName.getName() + ", Jersey #: " + foundByName.getJerseyNum());
        }
        else{
            System.out.println("Player could not be found.");
        }

    }
}
