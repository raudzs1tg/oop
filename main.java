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
        sv4.hienThiThongTin();
        System.out.println(sv4.gethoTen());
        System.out.println(sv4.getDiem());
        //thay doi ten sv4
        sv4.sethoTen("Banh");
        sv4.setDiem(3.2);
        sv4.hienThiThongTin(); 
        //phuong thuc co kieu tra ve
        double dtbsv4=sv4.tinhDTB(8,6.6);
        System.out.println(dtbsv4);
        sv4.hienThiThongTin();//hien ca ten va diem
        //tostring
        System.out.println(sv4);
    }
}   