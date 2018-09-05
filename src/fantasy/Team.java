package fantasy;

import java.util.*;

public class Team {
    public String name, location;
    public ArrayList roster;

    public boolean addPlayer(Player person) {
        if (roster.size() > 6) {
            return false;
        }
        return true;
    }

    private boolean validateRoster() {
        if (roster.size() != 7) {
            return false;
        }
        return true;
    }

    public String toString() {
        return location + " " + name + ": " + roster;
    }

    public Team(String name, String location) {
        this.name = name;
        this.location = location;
        this.roster = new ArrayList<Player>(7);
    }

    public Team(String name, String location, Player[] roster) {
        this.name = name;
        this.location = location;
        this.roster = new ArrayList<Player>(Arrays.asList(roster));
    }
}