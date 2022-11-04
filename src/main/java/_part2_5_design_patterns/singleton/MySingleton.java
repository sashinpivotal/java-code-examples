package _part2_5_design_patterns.singleton;

public class MySingleton {

    private static MySingleton mySingleton = null;

    private MySingleton() {
    }

    public static MySingleton getInstance() {
        if (mySingleton == null) {
            mySingleton = new MySingleton();
        }
        return mySingleton;
    }

}

class Main {

    public static void main(String[] args) {
        MySingleton instance1 = MySingleton.getInstance();
        MySingleton instance2 = MySingleton.getInstance();
        boolean b = instance1 == instance2;
        System.out.println(b);
    }
}