import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListMethods {

    public static ArrayList<Integer> numberList(){
        ArrayList<Integer> List = new ArrayList<Integer>();
        List.add(0);
        List.add(-5);
        List.add(7);
        List.add(12);
        List.add(-1);
        System.out.println(List);
        List.add(2, 10);
        List.add(1, 9);
        System.out.println(List);
        List.remove(3);
        System.out.println(List);

        return List;

    }
    public static ArrayList<Double> firstAndLast(){
        Scanner scan = new Scanner(System.in);
        ArrayList<Double> num= new ArrayList<Double>();
        ArrayList<Double> num2= new ArrayList<Double>();

        int number = 0;

        while(true){
            double list = scan.nextDouble();
            if(list == 0){
                break;
            }
            num2.add(list);
        }
        num.add((double)num2.size());
        num.add(num2.get(0));
        num.add(num2.get(num2.size()-1));

        return num;
    }





    public static ArrayList<Double> getNumbers(){
    ArrayList<Double> numbers= new ArrayList<Double>();
    Scanner kb=  new Scanner(System.in);

        System.out.println("Number?");
        numbers.add(kb.nextDouble());
        System.out.println("Number?");
        numbers.add(kb.nextDouble());
        System.out.println("Number?");
        numbers.add(kb.nextDouble());
        System.out.println(numbers);

        return numbers;

    }

    public static ArrayList<Double> arrangeList(ArrayList<Double> numbers){
        ArrayList<Double> temp= new ArrayList<Double>();
        double larger = numbers.get(0);
        double smaller;
        int i = numbers.size()-1;
        while(i>0){
        if(numbers.get(i) < numbers.get(i-1)){
            larger = numbers.get(i-1);
            smaller = numbers.get(i);
            numbers.set(i, larger);
            numbers.set(i-1,smaller);

        }

        i--;
    }
        return numbers;
}
public static void main(String[] args){
        System.out.println(numberList());
        System.out.println(firstAndLast());
}
}

