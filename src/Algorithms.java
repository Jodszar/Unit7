import java.util.ArrayList;
import java.io.IOException;
import java.io.File;
import java.util.Scanner;

public class Algorithms {
    public static ArrayList<Integer> fileDuplicates() throws IOException {
        Scanner file1 = new Scanner(new File("file1.txt"));
        Scanner file2 = new Scanner(new File("file2.txt"));
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        ArrayList<Integer> dup = new ArrayList<Integer>();

        while (file1.hasNext()) {
            list1.add(file1.nextInt());
        }
        while (file2.hasNext()) {
            list1.add(file2.nextInt());
        }
        for (int i = 0; i < list1.size(); i++) {
            int num = list1.get(i);
            if (list2.contains(num)) {
                dup.add(num);
            }
        }
        return dup;

    }

    public static ArrayList<String> fileDuplicatesTwo() throws IOException {
        ArrayList<String> lists = new ArrayList<String>();
        Scanner scan = new Scanner(new File("names.txt"));

        while (scan.hasNext()) {
            lists.add(scan.next());
        }
        System.out.println(lists);

        for (int i = 0; i < lists.size(); i++) {
            String w = lists.get(i);
            for (int y = i + 1; y < lists.size(); y++) {
                if (w.equals(lists.get(y))) {
                    String dup = lists.get(y);
                    lists.remove(y);
                }
            }
        }
        return lists;
    }

    public static ArrayList<Integer> orderedList() throws IOException {
        ArrayList<Integer> lists = new ArrayList<Integer>();
        Scanner scan = new Scanner(new File("file1.txt"));

        while (scan.hasNext()) {
            lists.add(scan.nextInt());
        }
        for (int i = 1; i < lists.size(); i++) {
            int num = lists.get(i);


        }
        return lists;
    }
}
