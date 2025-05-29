import java.util.*;

public class SortAndDisplay {
    public static void main(String[] args) {
        // Nhập dữ liệu từ người dùng
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập danh sách các số nguyên (cách nhau bằng khoảng trắng):");
        String input = scanner.nextLine();
        
        // Chuyển đổi input thành danh sách các số nguyên
        String[] inputArray = input.split(" ");
        List<Integer> numbers = new ArrayList<>();
        for (String s : inputArray) {
            numbers.add(Integer.parseInt(s));
        }
        
        // Sắp xếp các số theo thứ tự tăng dần
        Collections.sort(numbers);
        
        // Hiển thị cách a
        System.out.println("Cách hiển thị a):");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println(); // Xuống dòng
        for (int num : numbers) {
            System.out.println(num); // In mỗi số trên 1 dòng
        }

        // Hiển thị cách b
        System.out.println("Cách hiển thị b):");
        Map<Integer, Integer> countMap =
