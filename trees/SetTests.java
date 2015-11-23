public class SetTests {

    public static void main (String[] args) {
        IntSetTree set = new IntSetTree(9);

        set.add(13);
        set.add(6);
        set.add(6);
        set.add(7);
        set.add(8);
        set.add(5);
        set.add(5);
        set.add(22);
        set.add(3);
        set.add(1);

        System.out.println("Testing contains...");
        if (set.containsVerbose(1) && set.containsVerbose(22)) {
            System.out.println("Passed.");
        }

        System.out.println(set.toString());

    }
}
