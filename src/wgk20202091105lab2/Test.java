package wgk20202091105lab2;

import java.util.Scanner;

import static java.lang.String.format;

public class Test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        var vertex = new MyPoint[3];
        for (int i = 1; i < 4; i++) {
            vertex[i-1] = new MyPoint();
            System.out.printf("请输入第%d个顶点的x坐标\n",i);
            vertex[i-1].setX(in.nextDouble());
            System.out.printf("请输入第%d个顶点的y坐标\n",i);
            vertex[i-1].setY(in.nextDouble());
        }
        MyTriangle mytriangle = new MyTriangle(vertex[0],vertex[1],vertex[2]);
        System.out.println("请输入该三角形的颜色：");
        mytriangle.setColor(in.next());
        System.out.println("是否填充该三角形（true or false)");
        mytriangle.setFilled(in.nextBoolean());
        System.out.println("该三角形的面积："+format("%.2f",mytriangle.getArea()));
        System.out.println("该三角形的周长："+format("%.2f",mytriangle.getPerimeter()));
        mytriangle.toString();
    }
}
