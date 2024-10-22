import java.util.Scanner;
abstract public class Nhanvien {
    private int MaNv;
    private String Ho_ten;
    private String Dia_chi;

    abstract public double tinhluong();

    public Nhanvien()
    {
        this.MaNv = 0;
        this.Ho_ten = "";
        this.Dia_chi = "";
    }

    public Nhanvien(int MaNv, String Ho_ten, String Dia_chi)
    {
        this.MaNv = MaNv;
        this.Ho_ten = Ho_ten;
        this.Dia_chi = Dia_chi;
    }

    public void Nhap()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma so nhan vien: ");
        MaNv = sc.nextInt();
        sc.nextLine();
        System.out.print("Nhap ho va ten: ");
        Ho_ten = sc.nextLine();
        System.out.print("Nhap dia chi: ");
        Dia_chi = sc.nextLine();
    }

    public void Xuat()
    {
        System.out.println("Ma so nhan vien la: " + MaNv);
        System.out.println("Ho va ten la: " + Ho_ten);
        System.out.println("Dia chi la: " + Dia_chi);
    }
}

class NVSX extends Nhanvien
{
    private int sp;

    public NVSX()
    {
        this.sp = 0;
    }

    public NVSX(int MaNv, String Ho_ten, String Dia_chi, int sp)
    {
        super(MaNv, Ho_ten, Dia_chi);
        this.sp = sp;
    }

     @Override public void Nhap()
    {
        Scanner sc = new Scanner(System.in);
        super.Nhap();
        System.out.print("Nhap so san pham: ");
        sp = sc.nextInt();
    } 

     @Override public void Xuat()
    {
       super.Xuat();
       System.out.println("So san pham: " + sp);
    }

    @Override public double tinhluong()
    {
        return sp * 20000;
    }
}

class NVCN extends Nhanvien{
    private int snc;

    public NVCN()
    {
        this.snc = 0;
    }

    public NVCN(int MaNv, String Ho_ten, String Dia_chi, int snc)
    {
        super(MaNv, Ho_ten, Dia_chi);
        this.snc = snc;
    }

    @Override public void Nhap()
    {
        super.Nhap();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so ngay cong: ");
        snc = sc.nextInt();
    } 

    @Override public void Xuat()
    {
        super.Xuat();
        System.out.println("So ngay cong cua nhan vien la: " + snc);
    }

    @Override public double tinhluong()
    {
        return this.snc * 50000;
    }
}

class NVQL extends Nhanvien{
    private int hsl;
    private int lcb;

    public NVQL()
    {
        this.hsl = 0;
        this.lcb = 0;
    }

    public NVQL(int MaNv, String Ho_ten, String Dia_chi, int hsl, int lcb)
    {
        super(MaNv, Ho_ten, Dia_chi);
        this.hsl = hsl;
        this.lcb = lcb;
    }

    @Override public void Nhap()
    {
        super.Nhap();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap he so luong: ");
        hsl = sc.nextInt();
        System.out.print("Nhap luong co ban: ");
        lcb = sc.nextInt();
    }

    @Override public void Xuat()
    {
        super.Xuat();
        System.out.println("He so luong la: " + hsl);
        System.out.println("Luong co ban la: " + lcb);
    }

    @Override public double tinhluong()
    {
        return this.hsl * this.lcb;
    }
}