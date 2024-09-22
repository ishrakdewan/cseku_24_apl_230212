package GameNew;

public class ScoreBoard_new {
    private int numEntries = 0; // Number of actual entries in the scoreboard
    private GameEntry_new[] board;  // Array to store game entries

    // Constructor to initialize the scoreboard with a given capacity
    public ScoreBoard_new(int capacity) {
        board = new GameEntry_new[capacity];
    }

    // Method to add a new game entry to the scoreboard
    public void add(GameEntry_new e) {
        int newScore = e.getScore();
        // Check if the new score should be added to the scoreboard
        if (numEntries < board.length || newScore > board[numEntries - 1].getScore()) {
            if (numEntries < board.length) {
                numEntries++;
            }
            int idx = numEntries - 1;
            board[idx] = e;
            // Sort the new entry into the correct position
            for (int i = idx; i > 0; i--) {
                if (board[i - 1].getScore() < board[i].getScore()) {
                    GameEntry_new temp = board[i - 1];
                    board[i - 1] = board[i];
                    board[i] = temp;
                }
            }
        }
    }

    // Method to remove an entry at a specific index
    public void remove(int i) throws Exception {
        if (i < 0 || i >= numEntries) {
            throw new Exception("Invalid index: " + i);
        }
        // Shift entries to fill the gap
        for (int j = i; j < numEntries - 1; j++) {
            board[j] = board[j + 1];
        }
        numEntries--;
    }

    // Method to update the name of an entry at a specific index
    public void updateName(int index, String newName) throws Exception {
        if (index < 0 || index >= numEntries) {
            throw new Exception("Invalid index: " + index);
        }
        board[index].setName(newName);
    }

    // Method to update the score of an entry at a specific index
    public void updateScore(int index, int newScore) throws Exception {
        if (index < 0 || index >= numEntries) {
            throw new Exception("Invalid index: " + index);
        }
        board[index].setScore(newScore);
        GameEntry_new updatedEntry = board[index];
        remove(index);
        add(updatedEntry);
    }

    // Method to display the scoreboard
    public void show() {
        for (int i = 0; i < numEntries; i++) {
            System.out.println((i + 1) + ". Name: " + board[i].getName() + ", Score: " + board[i].getScore());
        }
    }
}

