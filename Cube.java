import java.awt.*;
import java.util.ArrayList;
import java.util.Observable;

public class Cube extends Observable {
    private Facet[] _facets;

    ArrayList<Facet> nearT;

    public Cube(){
        Cube с = this;
        _facets = new Facet[6];
        nearT = new ArrayList<>();

        //дальняя грань, в плоскости XY
        _facets[0] = new Facet(new R3Vector(0, 0, 0),
                new R3Vector(0, 1, 0),
                new R3Vector(1, 1, 0),
                new R3Vector(1, 0, 0));
        _facets[0].setColor(Color.BLUE);

        //передняя грань
        _facets[1] = new Facet(new R3Vector(0, 0, 1),
                new R3Vector(1, 0, 1),
                new R3Vector(1, 1, 1),
                new R3Vector(0, 1, 1));
        _facets[1].setColor(Color.RED);

        //верхняяя грань
        _facets[2] = new Facet(new R3Vector(0, 1, 0),
                new R3Vector(0, 1, 1),
                new R3Vector(1, 1, 1),
                new R3Vector(1, 1, 0));
        _facets[2].setColor(Color.YELLOW);

        //нижняя грань, в плоскоти XY
        _facets[3] = new Facet(new R3Vector(0, 0, 0),
                new R3Vector(1, 0, 0),
                new R3Vector(1, 0, 1),
                new R3Vector(0, 0, 1));
        _facets[3].setColor(Color.GREEN);

        //левая боковая грань, в плоскости YZ
        _facets[4] = new Facet(new R3Vector(0, 0, 0),
                new R3Vector(0, 0, 1),
                new R3Vector(0, 1, 1),
                new R3Vector(0, 1, 0));
        _facets[4].setColor(Color.BLACK);

        //правая боковая грань
        _facets[5] = new Facet(new R3Vector(1, 0, 0),
                new R3Vector(1, 1, 0),
                new R3Vector(1, 1, 1),
                new R3Vector(1, 0, 1));
        _facets[5].setColor(Color.GRAY);
        this.translate(-0.5, -0.5, -0.5);
    }

    public void scale(double kx, double ky, double kz){
        for(Facet v: _facets) //(int i = 0; i<_vertex.length; i++)
            v.scale(kx, ky, kz);
    }
    public void scaleAdd(double k){
        for(Facet v: _facets) //(int i = 0; i<_vertex.length; i++)
            v.scaleAdd(k);
    }
    public void scaleDelete(double k){
        for(Facet v: _facets) //(int i = 0; i<_vertex.length; i++)
            v.scaleDelete(k);
    }

    public void translate(double dx, double dy, double dz){
        for(Facet v: _facets) //(int i = 0; i<_vertex.length; i++)
            v.translate(dx, dy, dz);
    }

    public void translateX(double d){
        for(Facet v: _facets) //(int i = 0; i<_vertex.length; i++)
            v.translateX(d);
    }
    public void translateY(double d){
        for(Facet v: _facets) //(int i = 0; i<_vertex.length; i++)
            v.translateY(d);
    }public void translateZ(double d){
        for(Facet v: _facets) //(int i = 0; i<_vertex.length; i++)
            v.translateZ(d);
    }

    public void rotate(double ux, double uy, double uz){
        for(Facet v: _facets) //(int i = 0; i<_vertex.length; i++)
            v.rotate(ux, uy, uz);
    }

    public void draw(Graphics2D g){
        for(int i = 0; i < _facets.length; i++)
            _facets[i].draw(g);
    }
}