import java.util.ArrayList;
import java.util.Scanner;

class DSNV {
    private int SoLuongNhanVien;
    private ArrayList<Nhanvien> danhSachNV;

    public DSNV(){
        this.SoLuongNhanVien = 0;
        this.danhSachNV = new ArrayList<>();
    }

    public DSNV(int SoLuongNhanVien, ArrayList<Nhanvien> danhSachNV){
        this.SoLuongNhanVien = SoLuongNhanVien;
        this.danhSachNV = new ArrayList<>();
    }

    public void nhapDS() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong nhan vien: ");
        this.SoLuongNhanVien = sc.nextInt();
        for (int i = 0; i < this.SoLuongNhanVien; i++) {
            System.out.print("Chon loai nhan vien (1: NV san xuat, 2: NV cong nhat, 3: NV quan ly): ");
            int loai = sc.nextInt();
            Nhanvien nv;
            switch (loai) {
                case 1:
                    nv = new NVSX();
                    break;
                case 2:
                    nv = new NVCN();
                    break;
                default:
                    nv = new NVQL();
                    break;
            }
            nv.Nhap();
            danhSachNV.add(nv);
        }
    }

    public void xuatDS() {
        for (Nhanvien nv : danhSachNV) {
            nv.Xuat();
        }
    }

    public void xuatluong(){
        for(Nhanvien nv: danhSachNV){
            System.out.println("Luong cua nhan vien la: " + nv.tinhluong());
        }
    }
}
