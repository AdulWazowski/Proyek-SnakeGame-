import javax.swing.*;

public class App {
    public static void main(String[] args) {
        int boardWidth = 600;
        int boardHeight = boardWidth;

        JFrame frame = new JFrame("Snake");
        frame.setSize(boardWidth, boardHeight);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        JButton playButton = new JButton("Play");

        playButton.addActionListener(e -> {
            SnakeGame snakeGame = new SnakeGame(boardWidth, boardHeight);
            frame.setContentPane(snakeGame);
            frame.revalidate();
            snakeGame.requestFocus();
        });

        panel.add(playButton);
        frame.add(panel);
        frame.setVisible(true);
    }
}
