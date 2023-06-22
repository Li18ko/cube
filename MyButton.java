import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;
import java.util.Observer;

public class MyButton extends JButton implements Observer{  //наделили способоность наблюдать
    private Cube _cube;
    private CubePanel cubepanel;

    public MyButton(Cube cube, CubePanel v, String text){
        _cube = cube;
        this.setText(text);

        MyButtonListener listener = new MyButtonListener();
        this.addActionListener(listener);

        this._cube = cube;
        this.cubepanel = v;
    }

    public void update(Observable o, Object arg) {
        _cube = (Cube) o;
        cubepanel.repaint();
    }

    private class MyButtonListener implements ActionListener { //реакция на событие(не кнопка)
        public void actionPerformed(ActionEvent e){
            if (getText().equals("RotateX+")) {
                _cube.rotate(5, 0, 0);
            }
            if (getText().equals("RotateX-")) {
                _cube.rotate(-5, 0, 0);
            }
            if (getText().equals("RotateY+")) {
                _cube.rotate(0, 5, 0);
            }
            if (getText().equals("RotateY-")) {
                _cube.rotate(0, -5, 0);
            }
            if (getText().equals("RotateZ+")) {
                _cube.rotate(0, 0, 5);
            }
            if (getText().equals("RotateZ-")) {
                _cube.rotate(0, 0, -5);
            }
            if (getText().equals("Scale+")) {

                _cube.scaleAdd(1.5);
            }
            if (getText().equals("Scale-")) {
                _cube.scaleDelete(1.5);
            }
            if (getText().equals("TranslateX+")) {
                _cube.translateX(5);
            }
            if (getText().equals("TranslateX-")) {
                _cube.translateX(-5);
            }
            if (getText().equals("TranslateY+")) {
                _cube.translateY(-5);
            }
            if (getText().equals("TranslateY-")) {
                _cube.translateY(5);
            }
            if (getText().equals("TranslateZ+")) {
                _cube.translateZ(-5);
            }
            if (getText().equals("TranslateZ-")) {
                _cube.translateZ(5);
            }
            if (getText().equals("Direct")){
                Facet.q = 1;
            }
            if (getText().equals("Orthogonal")){
                Facet.q = 2;
            }
            if (getText().equals("Проволочный")){
                Facet.n = 1;
            }
            if (getText().equals("Залитый")){
                Facet.n = 2;
            }
            cubepanel.repaint();
        }
    }
}
