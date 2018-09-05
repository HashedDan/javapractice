package fantasy;


public class Player {
    public enum Position {QB, RB, WR, FLEX, FLEXS}
    
    public String name;
    public int height, weight;
    public Position position;

    public double getBMI() {
        return (double) height / weight;
    }

    public String toString() {
        return position + ": " + name;
    }

    public Player(String name, int height, int weight, Position position) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.position = position;
    }
}