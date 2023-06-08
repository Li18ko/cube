import javax.swing.*;
import java.awt.*;

public class Controller extends JPanel{
    public static JTextField scaleAdd, scaleDelete, translateAdd, translateDelete;
    public Controller(Cube cube, CubePanel cubeView){
        MyButton addRotateX = new MyButton(cube, cubeView, "RotateX+");
        MyButton deleteRotateX = new MyButton(cube, cubeView, "RotateX-");
        MyButton addRotateY = new MyButton(cube, cubeView, "RotateY+");
        MyButton deleteRotateY = new MyButton(cube, cubeView, "RotateY-");
        MyButton addRotateZ = new MyButton(cube, cubeView, "RotateZ+");
        MyButton deleteRotateZ = new MyButton(cube, cubeView, "RotateZ-");
        this.add(addRotateX);
        this.add(deleteRotateX);
        this.add(addRotateY);
        this.add(deleteRotateY);
        this.add(addRotateZ);
        this.add(deleteRotateZ);

        MyButton scaleAdd = new MyButton(cube, cubeView, "Scale+");
        MyButton scaleDelete = new MyButton(cube, cubeView, "Scale-");

        this.add(scaleAdd);
        this.add(scaleDelete);

        MyButton translateXAdd = new MyButton(cube, cubeView, "TranslateX+");
        MyButton translateXDelete = new MyButton(cube, cubeView, "TranslateX-");
        MyButton translateYAdd = new MyButton(cube, cubeView, "TranslateY+");
        MyButton translateYDelete = new MyButton(cube, cubeView, "TranslateY-");
        MyButton translateZAdd = new MyButton(cube, cubeView, "TranslateZ+");
        MyButton translateZDelete = new MyButton(cube, cubeView, "TranslateZ-");

        this.add(translateXAdd);
        this.add(translateXDelete);
        this.add(translateYAdd);
        this.add(translateYDelete);
        this.add(translateZAdd);
        this.add(translateZDelete);

        GridLayout grid = new GridLayout(7, 1);
        this.setLayout(grid);
    }
    @Override
    public void paintComponent(Graphics g){
        g = (Graphics2D) g;
        super.paintComponent(g);
    }
}