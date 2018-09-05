import java.util.*;
import fantasy.*;

public class Game {
    
    public static void main(String[] args) {
        Player one = new Player("Bob", 72, 200, Player.Position.QB);
        Player two = new Player("Tom", 72, 200, Player.Position.RB);
        Player three = new Player("Jerry", 72, 200, Player.Position.WR);
        Player four = new Player("Andrei", 72, 200, Player.Position.WR);

        Player[] players = {one, two, three, four};
        Team broncos = new Team("Broncos", "Denver", players);

        System.out.println(broncos.toString());
    }
}