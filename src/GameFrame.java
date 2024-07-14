import javax.swing.*;

public class GameFrame extends JFrame {

    GameFrame() {

        GamePanel panel = new GamePanel();
        this.add(panel);
        this.setTitle("Snake");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack();                            // to make window fit around components
        this.setVisible(true);
        this.setLocationRelativeTo(null);       // to centre window
    }
}
