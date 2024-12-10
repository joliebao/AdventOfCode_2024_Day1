import java.util.ArrayList;
import java.util.List;

public class AdventDay {
    private List<String> list1 = new ArrayList<String>();
    private List<String> list2 = new ArrayList<String>();
    private int totalSum;
    private int min1;
    private int min2;

    public AdventDay(ArrayList<String> list1, ArrayList<String> list2) {
        this.list1 = list1;
        this.list2 = list2;
        totalSum = 0;
        min1 = 100000000;
        min2 = 100000000;
    }

    public int compareLists() {
        int smallestInd1 = 0;
        int smallestInd2 = 0;
        int counter = 0;
        while (counter < list1.size()) {
            for (int i = 0; i < list1.size(); i++) {
                if (Integer.parseInt(list1.get(i)) < min1) {
                    min1 = Integer.parseInt(list1.get(i));
                    smallestInd1 = i;
                }
            }
            System.out.println("MIN1: " + min1);
            for (int i2 = 0; i2 < list2.size(); i2++) {
                if (Integer.parseInt(list2.get(i2)) < min2) {
                    min2 = Integer.parseInt(list2.get(i2));
                    smallestInd2 = i2;
                }
            }
            totalSum += (Math.abs(min1 - min2));
            counter++;
            min1 = 100000000;
            min2 = 100000000;
            list1.remove(smallestInd1);
            list1.add(smallestInd1, "1000000");
            list2.remove(smallestInd2);
            list2.add(smallestInd2, "1000000");
        }

        return totalSum;
    }

    public int similarityScore() {
        int counter = 0;
        int similar = 0;
        int score = 0;
        for (int i = 0; i < list1.size(); i++) {
            for (int i2 = 0; i2 < list2.size(); i2++) {
                if (Integer.parseInt(list1.get(i)) == Integer.parseInt(list2.get(i2))) {
                    similar++;
                }

            }
        }
    }
}
