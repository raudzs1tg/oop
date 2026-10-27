package TruongDaiHoc;
public class SinhVien {
    //thuoc tinh(giong voi bien)
    private  String hoTen;
    private double Diem;

    //4.1 constructor mac dinh
    //Khoi tao cac gia tri mac dinh
    //ngay khi doi tuong vua duoc tao ra
    public SinhVien(){
        hoTen="no name";
        Diem=0.0;
    }
    //4.2

    public SinhVien(String hoTenx){
        hoTen=hoTenx;
    }
    public SinhVien(String hoTen,double Diem){
        this.hoTen=hoTen;
        this.Diem=Diem;
    }

    //phuong thuc(cac ham)
    //phuong thuc khong co kieu tra ve
    public void hienThiThongTin(){
        System.out.println(hoTen+" "+Diem);
    }

    //get/set
    public String gethoTen(){
        return hoTen;
    }
    public double getDiem(){
        return Diem;
    }

    public void sethoTen(String hoTen){
        this.hoTen=hoTen;
    }
    public void setDiem(double Diem){
        this.Diem=Diem;
    }
}

    