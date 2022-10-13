public class Logic {

    //sygnatura metody została zmieniona, aby uzyskać dostęp w Main
    //złożoność obliczeniowa O(n), złożoność pamięciowa O(1)
    public static boolean search (int[] numbers, int x) {
        for (int n : numbers) {
            if (n == x) {
                return true;
            }
        }
        return false;
    }


    //złożoność obliczeniowa O(n^2), czasowa O(1)
    public static void sortDescending (int[] table) {
        for (int i=0; i<table.length; i++) {
            for(int j=0; j<table.length-1; j++) {
                if(table[j]<table[j+1]) {
                    int temp = table[j];
                    table[j] = table[j+1];
                    table[j+1] = temp;
                }
            }
        }
    }

    public static void showTable (int[]table) {
        for (int tab:table) {
            System.out.print(tab + " ");
        }
    }
}
