import java.util.ArrayList;

public class SelfAdjustingDriver {
    public static void main(String[] args){
        ArrayList<Integer> list= new ArrayList<>();
        list.add(12);
        list.add(14);
        list.add(8);
        list.add(2);
        list.add(0);
        SelfAdjusting first = new SelfAdjusting(list);
        System.out.println("Input: " + first.getList());
        first.adjustList();
        System.out.println("Output: " + first.getList());
        first.adjustList();


        ArrayList<Integer> list2= new ArrayList<>();
        list.add(11);
        list.add(14);
        list.add(11);
        list.add(8);
        list.add(13);
        list.add(0);
        SelfAdjusting second = new SelfAdjusting(list);
        System.out.println("Input: " + second.getList());
        second.adjustList();
        System.out.println("Output: " + second.getList());
        second.adjustList();
    }
}
