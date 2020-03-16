import java.util.ArrayList;
import java.util.Scanner;
import java.io.IOException;
import java.io.File;

    public class Traversing {
        public static ArrayList<String> getStates() {
            ArrayList<String> states = new ArrayList<String>();

            Scanner scan = new Scanner(System.in);
            while (true) {
                System.out.println("Enter the name of the State or stop to quite:");
                String state = scan.next();
                if (state.equals("Stop"))
                    break;

                states.add(state);
            }
            return states;

        }

        public static String createList(ArrayList<String> states) {
            String output = " ";
            for (int i=0; i<states.size()-1; i++){
                if(i<states.size()-1){
                    output+= states.get(i);
                    output+= " -> ";
                }
                else{
                    output += states.get(i);
                    break;
                }
            }
            output += states.get(states.size()-1);
            return output;


            }

        public static ArrayList<Integer> largestAndSmallest() throws IOException{
            Scanner scan= new Scanner(new File("numbers.txt"));
            ArrayList<Integer> nums= new ArrayList<Integer>();
            while(scan.hasNext()){
                nums.add(scan.nextInt());
            }
            int largest = nums.get(0);
            int max = 0;
            int smallest = nums.get(0);
            int min = 0;

            for(int i=0; i<nums.size(); i++){
                if(nums.get(i) > largest){
                    largest = nums.get(i);
                    max = i;
                }
                if(nums.get(i) < smallest){
                    smallest = nums.get(i);
                    min = i;
                }
            }
            nums.remove(min);
            nums.add(0,smallest);
            nums.remove(max);
            nums.add(nums.size(), largest);



            return nums;


        }
        public static void main(String [] args){
            ArrayList<String>states= getStates();
            System.out.println(createList(states));
        }

    }

