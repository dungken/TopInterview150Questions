package randomizedset;

public class Test {
    public static void main(String[] args) {
        RandomizedSet randomizedSet = new RandomizedSet();
        System.out.println("///// TEST INSERT //////");
        System.out.println(randomizedSet.insert(1)); // true
        System.out.println(randomizedSet.insert(1)); // false
        System.out.println(randomizedSet.insert(2)); // true
        System.out.println(randomizedSet.insert(3)); // true
        System.out.println(randomizedSet.insert(3)); // false
        System.out.println(randomizedSet.insert(4)); // true
        System.out.println("///// TEST REMOVE //////");
        System.out.println(randomizedSet.remove(1)); // true
        System.out.println(randomizedSet.remove(10)); // false
        System.out.println("///// TEST GET RANDOM //////");
        System.out.println(randomizedSet.getRandom());
        System.out.println(randomizedSet.getRandom());
        System.out.println(randomizedSet.getRandom());
        System.out.println(randomizedSet.getRandom());
        System.out.println(randomizedSet.getRandom());

        randomizedSet.print(); // 2 3 4
    }
}
