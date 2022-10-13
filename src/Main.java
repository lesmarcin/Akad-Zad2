public class Main {

    public static void main(String[] args) {

        int[] randomTable = {10, 16, 7, 29, 15};

        Logic.showTable(randomTable);
        Logic.sortDescending(randomTable);

        System.out.println();
        Logic.showTable(randomTable);

        System.out.println();
        System.out.println(Logic.search(randomTable, 5));
    }
}
