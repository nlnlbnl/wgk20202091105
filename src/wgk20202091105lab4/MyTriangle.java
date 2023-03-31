package wgk20202091105lab4;

import org.jetbrains.annotations.NotNull;
import wgk20202091105lab2.MyPoint;

import java.util.Scanner;
import static java.lang.Math.sqrt;
import static java.lang.String.format;

/**
 * @author wgk20202091105
 */
public class MyTriangle extends GeometricObject implements Comparable<MyTriangle>{
    private final MyPoint[] vertex = new MyPoint[3];

    public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3) {
        vertex[0] = v1;
        vertex[1] = v2;
        vertex[2] = v3;
    }

    public MyTriangle() {
        vertex[0] = new MyPoint(3, 3);
        vertex[1] = new MyPoint(2, 0);
        vertex[2] = new MyPoint(4, 0);
    }

    @Override
    public double getPerimeter() {
        double s1 = vertex[0].distance(vertex[1]);
        double s2 = vertex[0].distance(vertex[2]);
        double s3 = vertex[1].distance(vertex[2]);
        return s1 + s2 + s3;
    }

    @Override
    public double getArea() {
        double s = getPerimeter();
        double halfOfs = 0.5 * s;
        double s1 = vertex[0].distance(vertex[1]);
        double s2 = vertex[0].distance(vertex[2]);
        double s3 = vertex[1].distance(vertex[2]);
        return sqrt(halfOfs * (halfOfs - s1) * (halfOfs - s2) * (halfOfs - s3));
    }

    @Override
    public String toString() {
        return "该三角形的周长：" + format("%.2f", getPerimeter()) + "\n" +
                "该三角形的面积：" + format("%.2f", getArea()) + "\n" +
                "第一个顶点坐标:" + "(" + vertex[0].getX() + "," + vertex[0].getY() + ")" + "\n" +
                "第二个顶点坐标:" + "(" + vertex[1].getX() + "," + vertex[1].getY() + ")" + "\n" +
                "第三个顶点坐标:" + "(" + vertex[2].getX() + "," + vertex[2].getY() + ")" + "\n" +
                super.toString();
    }

    public MyTriangle printTriangles() {
        Scanner in = new Scanner(System.in);
        for (int i = 1; i < 4; i++) {
            vertex[i - 1] = new MyPoint();
            System.out.printf("请输入第%d个顶点的x坐标\n", i);
            vertex[i - 1].setX(in.nextDouble());
            System.out.printf("请输入第%d个顶点的y坐标\n", i);
            vertex[i - 1].setY(in.nextDouble());
        }
        var mytriangle = new MyTriangle(vertex[0], vertex[1], vertex[2]);
        System.out.println("请输入该三角形的颜色：");
        mytriangle.setColor(in.next());
        System.out.println("是否填充该三角形（true or false)");
        mytriangle.setFilled(in.nextBoolean());
        return mytriangle;
    }

    @Override
    public int compareTo(@NotNull MyTriangle other) {
        return Double.compare(this.getPerimeter(), other.getPerimeter());
    }
}
