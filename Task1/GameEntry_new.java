package GameNew;

/**
 * The GameEntry class represents a single entry in a game leaderboard.
 * It stores the player's name and their score.
 */
public class GameEntry {
    private String playerName;
    private int score;

      
     
    public GameEntry(String name, int score) {        //Constructs a new GameEntry with the specified player's name and score.
        this.playerName = name;
        this.score = score;
    }

    public void setName(String name) {            // Sets the player's name.
        this.playerName = name;
    }

    public void setScore(int score) {           // Sets the player's score.
        this.score = score;
    }

    public String getName() {          //Returns the player's name.
        return this.playerName;
    }

    public int getScore() {         // Returns the player's score.
        return this.score;
    }
    
    @Override
    public String toString() {    // Returns a string representation of the game entry.

        return "(" + this.playerName + ", " + this.score + ")";
    }
}
