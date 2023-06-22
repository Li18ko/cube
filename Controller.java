import javax.swing.*;
import java.awt.*;

public class Controller extends JPanel{
    public Controller(Cube cube, CubePanel cPanel){

        MyButton direct = new MyButton(cube, cPanel, "Direct");
        this.add(direct);

        MyButton orthogonal = new MyButton(cube, cPanel, "Orthogonal");
        this.add(orthogonal);

        MyButton provolka = new MyButton(cube, cPanel, "Проволочный");
        this.add(provolka);

        MyButton flooded = new MyButton(cube, cPanel, "Залитый");
        this.add(flooded);


        MyButton addRotateX = new MyButton(cube, cPanel, "RotateX+");
        MyButton deleteRotateX = new MyButton(cube, cPanel, "RotateX-");
        MyButton addRotateY = new MyButton(cube, cPanel, "RotateY+");
        MyButton deleteRotateY = new MyButton(cube, cPanel, "RotateY-");
        MyButton addRotateZ = new MyButton(cube, cPanel, "RotateZ+");
        MyButton deleteRotateZ = new MyButton(cube, cPanel, "RotateZ-");
        this.add(addRotateX);
        this.add(deleteRotateX);
        this.add(addRotateY);
        this.add(deleteRotateY);
        this.add(addRotateZ);
        this.add(deleteRotateZ);

        MyButton scaleAdd = new MyButton(cube, cPanel, "Scale+");
        MyButton scaleDelete = new MyButton(cube, cPanel, "Scale-");

        this.add(scaleAdd);
        this.add(scaleDelete);

        MyButton translateAddX = new MyButton(cube, cPanel, "TranslateX+");
        MyButton translateDeleteX = new MyButton(cube, cPanel, "TranslateX-");
        MyButton translateAddY = new MyButton(cube, cPanel, "TranslateY+");
        MyButton translateDeleteY = new MyButton(cube, cPanel, "TranslateY-");
        MyButton translateAddZ = new MyButton(cube, cPanel, "TranslateZ+");
        MyButton translateDeleteZ = new MyButton(cube, cPanel, "TranslateZ-");

        this.add(translateAddX);
        this.add(translateDeleteX);
        this.add(translateAddY);
        this.add(translateDeleteY);
        this.add(translateAddZ);
        this.add(translateDeleteZ);


        GridLayout grid = new GridLayout(9, 1);
        this.setLayout(grid);
    }
    @Override
    public void paintComponent(Graphics g){
        g = (Graphics2D) g;
        super.paintComponent(g);
    }
}