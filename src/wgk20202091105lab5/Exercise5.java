package wgk20202091105lab5;

import java.io.*;


/**
 * @author wgk20202091105
 */
public class Exercise5 {
    static int[] nums = new int[26];

    public static void count(String str) {
        String str1 = str.toLowerCase();
        for (char i : str1.toCharArray()) {
            //自动将char i转化成ascall码
            if (i >= 97 && i <= 122) {
                //利用数组的索引进行存储
                nums[i - 97]++;
            }
        }
    }

    public static void printcount(){
        for(int i = 0; i< nums.length; i++){
            if(nums[i] != 0){
                //i加上97并且再转化为char类型就可以显示相应的字符
                char j = (char)(i+97);
                System.out.println("Number of "+j+":" + nums[i]);
            }
        }
    }
    public static void main(String[] args) {
        File filenames = new File("./src/wgk20202091105lab5/words.txt");
        try (InputStreamReader reader = new InputStreamReader(new FileInputStream(filenames)))
        {
            BufferedReader br = new BufferedReader(reader);
            var line = new String[20];
            for (int i = 0; i < line.length; i++) {
                line[i] = br.readLine();
                count(line[i]);
            }
            printcount();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
