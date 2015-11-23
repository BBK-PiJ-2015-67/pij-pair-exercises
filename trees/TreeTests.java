public class TreeTests {

    public static void main (String[] args) {
        IntegerTreeNode start = new IntegerTreeNode(9);

        start.add(13);
        start.add(6);
        start.add(7);
        start.add(8);
        start.add(5);
        start.add(22);
        start.add(3);
        start.add(1);


        System.out.println("getMax() should return 22... " + start.getMax());
        System.out.println("getMin() should return 1... " + start.getMin());
        System.out.println(start.toString());

        System.out.println("depth() should correctly calculate depth of tree... " + ((start.depth() == 4) ? "passed" : "failed"));
    }
}
