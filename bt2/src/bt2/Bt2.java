package bt2;
import java.util.Scanner;

public class Bt2 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Nhap vao so phan tu cua mang: ");
            int size = scanner.nextInt();
            int[] array = new int[size];
            
            System.out.println("Nhap vao cac phan tu cua mang:");
            for (int i = 0; i < size; i++) {
                array[i] = scanner.nextInt();
            }
            
            int max = array[0];
            int min = array[0];
            
            for (int i = 1; i < size; i++) {
                if (array[i] > max) {
                    max = array[i];
                }
                if (array[i] < min) {
                    min = array[i];
                }
            }
            
            System.out.println("GTLN: " + max);
            System.out.println("GTNN: " + min);
        }
    }
}