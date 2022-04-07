package wgk20202091105lab5;

import java.io.*;

import static wgk20202091105lab5.countLetter.count;
import static wgk20202091105lab5.countLetter.printcount;

/**
 * @author wgk20202091105
 */
public class Exercise5 {
    public static void main(String[] args) throws IOException {
        File filenames = new File("/Users/kuogongzi/IdeaProjects/wgk20202091105/src/wgk20202091105lab5/words.txt");
        InputStreamReader reader = new InputStreamReader(new FileInputStream(filenames));
        BufferedReader br = new BufferedReader(reader);
        var line = new String[20];
        for (int i = 0; i < line.length; i++) {
                line[i] = br.readLine();
                count(line[i]);
        }
        printcount();
    }
}
