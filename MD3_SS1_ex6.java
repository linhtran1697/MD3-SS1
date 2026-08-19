
import java.util.Scanner;
public class MD3_SS1_ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Khai báo các biến kiểu float
        float width;
        float height;
        float area;
        float circumference;

        // Nhập chiều rộng
        System.out.print("Nhập chiều rộng của hình chữ nhật: ");
        width = scanner.nextFloat();

        // Nhập chiều cao
        System.out.print("Nhập chiều cao của hình chữ nhật: ");
        height = scanner.nextFloat();

        // Tính diện tích
        area = width * height;

        // Tính chu vi
        circumference = 2 * (width + height);

        // In kết quả
        System.out.println("Diện tích hình chữ nhật là: " + area);
        System.out.println("Chu vi hình chữ nhật là: " + circumference);

        scanner.close();
    }
}