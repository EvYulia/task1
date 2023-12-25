public class test2 {
    public static void main(String[] args) {
        number2 array = new number2();
        array.add("apple");
        array.add("banana");
        array.add("pineapple");
        array.add("pear");
        System.out.println("Max length el is "+array.getMax());
        System.out.println("Avg length of all el-s is "+array.getAverageLength());
    }
}
