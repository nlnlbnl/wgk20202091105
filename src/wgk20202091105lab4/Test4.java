package wgk20202091105lab4;

/**
 * @author wgk20202091105
 */
public class Test4 {
    public static void main(String[] args) {
        MyTriangle triangle = new MyTriangle();

        System.out.print("请输入第1个三角形的信息:\n");
        MyTriangle mytriangle = triangle.printTriangles();

        System.out.print("请输入第2个三角形的信息:\n");
        MyTriangle other = triangle.printTriangles();

        if(mytriangle.compareTo(other) > 0){
            System.out.println(mytriangle.toString());
            System.out.println();
            System.out.println(other.toString());
        }
        else {
            System.out.println(other.toString());
            System.out.println();
            System.out.println(mytriangle.toString());
        }
    }
}
