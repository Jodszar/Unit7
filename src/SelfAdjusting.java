import java.util.ArrayList;
/**
* @auther Jodie Azar
* @since 3/17/20
 * This program will rearrange the data structure so the subsequent searches for the same elements will happen very quickly.
 */

public class SelfAdjusting {
    private ArrayList<Integer> list= new ArrayList<>();

    /**
     * The constructor
     * @param list for Integer ArrayList.
     */

    public SelfAdjusting(ArrayList<Integer> list){
        this.list= list;

    }
    /**
     * Accessor
     * @return List
     */

    public ArrayList<Integer>getList(){
        return list;
    }

    /**
     * This method will take no parameters and will return nothing
     * The list initially contains the first 10 even numbers. That is, 2 is in position 0, 4 in position 1, 6 in position 2, 20 is in position 9.
     * For each number,the list will be searched. If the number is there, it will be moved to the front of the list; otherwise, added to the front.
     */

    public void adjustList(){
        list.remove(list.size()-1); // this is to remove the zero at the end of the list.

        ArrayList<Integer> output= new ArrayList<>();
        for (int i=2; i<=20; i+=2){
            output.add(i);
            //adds all even numbers from 2-10 to the list.

        }
        boolean fin= false;
        int num=0;
        for(int i=0; i<list.size(); i++){
            num= list.get(i);
            for (int x=0; x< output.size(); x++){
                if(num==  output.get(x)){
                    output.remove(x);
                    output.add(0, num);
                    fin= true;
                    // move the the value you request for if in the list to the front.

                }
            }
            if(!fin){
                output.add(0, num);
                //adds value to the front if not found.
            }
               fin=false;
        }
        list= output;
    }
}
