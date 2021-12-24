import java.util.Scanner;

public class home4 {
    public static String[] inputArray() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mảng Nhập Từ Bàn Phím :");
        System.out.print("Nhập Số Phần Tử Của Mảng : ");
        int n = Integer.parseInt(sc.nextLine());
        String[] arr = new String[n];
        for (int i = 0; i < n; ++i) {
            System.out.print("Nhập Phần Tử " + i + ": ");
            arr[i] = sc.nextLine();
        }
        return arr;
    }

    public static void printArray(String[] arr) {
        System.out.println("Các Phần Tử Của Mảng ");
        for (String element : arr) {
            System.out.print(element + "\t");
        }
        System.out.println();
    }

    public static int countItem(String[] arr, String item) {
        int count = 0;
        for (String element : arr) {
            if (element.equals(item)) {
                count += 1;
            }
        }
        return count;
    }

    public static void getItemIndices(String[] arr) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Vị Trí Chuỗi Trong Mảng ");
        String item = sc.nextLine();

        int count = 0;
        String result = "Chuoi \"" + item + "\" ";
        for (int i = 0; i < arr.length; ++i) {
            if (arr[i].equals(item)) {
                count += 1;
                if (count == 1) {
                    result = "Chuoi \"" + item + "\" Vị Trí Chuỗi " + i;
                } else {
                    result += ", " + i;
                }
            }
        }
        System.out.println(result);
    }
}
