package wgk20202091105lab5;

import org.jetbrains.annotations.NotNull;

public class countLetter {
    //创建26个空间大小的数组，存放26个字母
    static int[] nums = new int[26];
    public static void count(@NotNull String str) {
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
}
