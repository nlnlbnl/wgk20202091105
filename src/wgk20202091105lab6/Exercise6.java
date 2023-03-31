package wgk20202091105lab6;

import org.junit.Test;
import wgk20202091105lab2.MyPoint;
import wgk20202091105lab4.MyTriangle;

import java.io.*;
import java.util.ArrayList;

import static java.lang.String.format;

/**
 */
public class Exercise6 {
    public static void main(String[] args) {
        ArrayList<MyTriangle> list = new ArrayList<>();
        File filenames = new File("./src/wgk20202091105lab6/triangles.txt");
        try(InputStreamReader reader = new InputStreamReader(new FileInputStream(filenames))) {
            BufferedReader br = new BufferedReader(reader);
            var line = br.readLine();
            var myPoint = new MyPoint[3];
            var mytriangle = new MyTriangle();
            while (line != null) {
                String[] str = line.split("\\s+");
                for (int i = 0,j = 0; i < 3; i++,j += 2) {
                    myPoint[i] = new MyPoint(Double.parseDouble(str[j]), Double.parseDouble(str[j + 1]));
                    if (i == 2) {
                        mytriangle = new MyTriangle(myPoint[0], myPoint[1], myPoint[2]);
                    }
                }
                line = br.readLine();
                list.add(mytriangle);
            }
            list.sort(MyTriangle::compareTo);
            double sumArea = 0;
            for(MyTriangle myTriangle : list) {
                sumArea += myTriangle.getArea();
                System.out.println(myTriangle.toString());
            }
            System.out.println("所有三角形的面积和：" + format("%.2f",sumArea));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}