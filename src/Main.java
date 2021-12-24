
public class Main {
    public static void main(String[] args) throws Exception {
        String[] arr = home4.inputArray();
        System.out.println();

        home4.printArray(arr);
        System.out.println();

        String countedItem = "Java";
        int count = home4.countItem(arr, countedItem);
        System.out.printf("Chuoi \"%s\" xuat hien %d lan trong mang\n", countedItem, count);
        System.out.println();

        home4.getItemIndices(arr);
    }
}

