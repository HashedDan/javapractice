package fantasy;

import java.util.*;

public class Team {
    public String name, location;
    public Hashtable roster;

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

    public Team(String name, String location) {
        this.name = name;
        this.location = location;
        this.roster = new Hashtable<String, Player>(7);
    }

    public Team(String name, String location, Player[] roster) {
        this.name = name;
        this.location = location;
        if (roster.length < 8) {

        }
        else {
            this.roster = new Hashtable<String, Player>(7);
        }
    }
}