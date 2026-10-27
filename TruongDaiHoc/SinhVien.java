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

    //phuong thuc co kieu tra ve
    public double tinhDTB(double diemToan,double diemVan){
        return (diemToan+diemVan)/2;
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
    //test pthuc tostring
    @Override 
    public String toString(){
        return "SinhVien{"+"hoTen='"+hoTen+'\''+",Diem=" +Diem+'}';
    }
}

    