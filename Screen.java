import javax.swing.*;
import java.awt.*;

public class Screen extends JFrame {
    private Cube _cube;

    private static int _WIDTH = 800;
    private static int _HEIGHT = 800;
    public Screen(Cube cube){
        _cube = cube;

        this.setTitle("CUBE");
        this.setSize(_WIDTH, _HEIGHT);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        CubePanel cubeView = new CubePanel(_cube);
        Controller ControlPanel = new Controller(_cube, cubeView);
        Container pane = this.getContentPane();

        pane.setLayout(new GridLayout(2,1));


        pane.add(cubeView);
        pane.add(ControlPanel);

        this.setVisible(true);
    }

}