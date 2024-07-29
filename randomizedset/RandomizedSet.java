package randomizedset;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

public class RandomizedSet {
    List<Integer> values;
    HashMap<Integer, Integer> valueToIndex;
    Random random;
    public RandomizedSet() {
        values = new ArrayList<>();
        valueToIndex = new HashMap<>();
        random = new Random();
    }

    public boolean insert(int val) {
        if(valueToIndex.containsKey(val))
            return false;
        valueToIndex.put(val, values.size());
        values.add(val);
        return true;
    }

    public boolean remove(int val) {
        if(!valueToIndex.containsKey(val))
            return false;
        int index = valueToIndex.get(val);
        int lastElement = values.getLast();
        values.set(index, lastElement);
        valueToIndex.put(lastElement, index);
        values.removeLast();
        valueToIndex.remove(val);
        return true;
    }

    public int getRandom() {
        int index = random.nextInt(values.size());
        return values.get(index);
    }

    public void print() {
        for (Integer ele : values) {
            System.out.print(ele + " ");
        }
    }
}
