interface DifficultyLevel {
    void startGame();
}
class EasyLevel implements DifficultyLevel {
    public void startGame() {
        System.out.println("Starting game at EASY level.");
    }
}
class MediumLevel implements DifficultyLevel {
    public void startGame() {
        System.out.println("Starting game at MEDIUM level.");
    }
}
class DifficultLevel implements DifficultyLevel {
    public void startGame() {
        System.out.println("Starting game at DIFFICULT level.");
    }
}
class ChessGame {
    private DifficultyLevel level;

    public ChessGame(DifficultyLevel level) {
        this.level = level;
    }

    public void setDifficultyLevel(DifficultyLevel level) {
        this.level = level;
    }

    public void startChessGame() {
        level.startGame();
    }
}
public class Main {
    public static void main(String[] args) {
        System.out.println("Strategy Design Pattern - Behavioral Design Pattern");

        ChessGame game = new ChessGame(new EasyLevel());
        game.startChessGame();

        game.setDifficultyLevel(new MediumLevel());
        game.startChessGame();

        game.setDifficultyLevel(new DifficultLevel());
        game.startChessGame();
    }
}