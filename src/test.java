import java.util.Scanner;
public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DSNV ds = new DSNV();
        ds.nhapDS();
        System.out.println("Danh sach nhan vien:");
        ds.xuatDS();
        System.out.println("Luong cac nhan vien:");
        ds.xuatluong();
        sc.close();
    }
}