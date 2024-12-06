import java.util.ArrayList;
import java.util.List;

public class AdventDay {
    private List<String> list1 = new ArrayList<String>();
    private List<String> list2 = new ArrayList<String>();
    private int totalSum;

    public AdventDay(ArrayList<String> list1, ArrayList<String> list2){
        this.list1 = list1;
        this.list2 = list2;
        totalSum = 0;
    }

//    public void extraRemover(){
//        list1 = list1.replace(",","");
//        list1 = list1.replace("[", "");
//        list1 = list1.replace("]","");
//        list2 = list2.replace(",","");
//        list2 = list2.replace("[", "");
//        list2 = list2.replace("]","");
//    }

    public int compareLists(){
        int min1 = 100000000;
        int min2 = 100000000;
        for (int i = 0; i < list1.size(); i++){
            if (Integer.parseInt(list1.get(i)) < min1){
                min1 = Integer.parseInt(list1.get(i));
            }
        }

        for (int i = 0; i < list2.size(); i++){
            if (Integer.parseInt(list2.get(i)) < min2){
                min2 = Integer.parseInt(list2.get(i));
            }
        }
        totalSum += Math.abs(min1 - min2);

        return Math.abs(min1 - min2);
    }
}
