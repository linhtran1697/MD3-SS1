import java.util.Scanner;
public class MD3_SS1_ex5 {
    public static void main (String [] args) {
        Scanner scanner = new Scanner (System.in);

        // Nhập phân số thứ nhất: a/b
        System.out.print ("Nhập tử số của phân số thứ nhất:");
        int a = scanner.nextInt ();
        System.out.print ("Nhập mẫu số của phân số thứ nhất:");
        int b = scanner.nextInt ();
        // Nhập phân số thứ hai: c/d
        System.out.print ("Nhập tử số của phân số thứ hai:");
        int c = scanner.nextInt ();
        System.out.print ("Nhập mẫu số của phân số thứ hai:");
        int d = scanner.nextInt ();
        // Kiểm tra mẫu số
         if (b ==0 || d == 0) {
             System.out.println("Mẫu số phải khác 0:");
         } else {
             // Tính tử số và mẫu số của tổng
             int numerator = a * d + c * b;
             int denominator = b * d;
             // In kết quả dưới dạng phân số a/b
             System.out.println (
                     "Tổng hai phân số là:"
                     + numerator + "/" + denominator
             );
         }
         scanner.close();
    }
}
