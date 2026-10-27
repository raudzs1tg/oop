import TruongDaiHoc.SinhVien;

public class main{
    public static void main(String[] args){
        //khoi tao class thuoc doi tuong sinh vien
        SinhVien sv1=new SinhVien();
        SinhVien sv2=new SinhVien();
        sv2.hienThiThongTin();
        sv1.hienThiThongTin();
        SinhVien sv3=new SinhVien("Duc");
        sv3.hienThiThongTin();
        SinhVien sv4=new SinhVien("VA",20);
    }
}