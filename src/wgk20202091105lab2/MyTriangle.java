package wgk20202091105lab2;

import static java.lang.Math.sqrt;

import wgk20202091105lab3.SimpleGeometricObject;

public class MyTriangle extends SimpleGeometricObject {
    private final MyPoint vertex[] = new MyPoint[3];

    public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3){
        vertex[0] = v1;
        vertex[1] = v2;
        vertex[2] = v3;
    }

    public MyTriangle(){
        vertex[0] = new MyPoint(1,1);
        vertex[1] = new MyPoint(2,2);
        vertex[2] = new MyPoint(1.5,3);
    }

    public double getPerimeter(){
        double s1 = vertex[0].distance(vertex[1]);
        double s2 = vertex[0].distance(vertex[2]);
        double s3 = vertex[1].distance(vertex[2]);
        return s1 + s2 + s3;
    }

    public double getArea(){
        double s = getPerimeter();
        double halfOfs = 0.5 * s;
        double s1 = vertex[0].distance(vertex[1]);
        double s2 = vertex[0].distance(vertex[2]);
        double s3 = vertex[1].distance(vertex[2]);
        return sqrt(halfOfs*(halfOfs-s1)*(halfOfs-s2)*(halfOfs-s3));
    }

    public String toString(){
        return "第一个顶点坐标:"+"("+vertex[0].getX()+","+vertex[0].getY()+")"+"\n"+
                "第二个顶点坐标:"+"("+vertex[1].getX()+","+vertex[1].getY()+")"+"\n"+
                "第三个顶点坐标:"+"("+vertex[2].getX()+","+vertex[2].getY()+")" + "\n" + super.toString();
    }
}
