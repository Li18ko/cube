import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;
import java.util.Observer;

public class MyButton extends JButton implements Observer{  //наделили способоность наблюдать
    private Cube _cube;
    private CubePanel cubePanel;

    public MyButton(Cube cube, CubePanel vv, String text){
        _cube = cube;
        this.setText(text);

        MyButtonListener listener = new MyButtonListener();
        this.addActionListener(listener);

        this._cube = cube;
        this.cubePanel = vv;
    }

    public void update(Observable o, Object arg) {
        _cube = (Cube) o;
        cubePanel.repaint();
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
            cubePanel.repaint();
        }
    }
}
