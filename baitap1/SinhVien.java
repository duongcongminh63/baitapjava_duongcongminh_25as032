package baitap1;

public class SinhVien extends Person {
    private String maSV;
    private double diemTB;


    public SinhVien(String hoTen, String diaChi, int namSinh, String maSV, double diemTB) {
        super(hoTen, diaChi, namSinh);
        this.maSV = maSV;
        this.diemTB = diemTB;
    }

    @Override
    public String getLoai() {
        return "Sinh Vien ";
    }
    @Override
    public void inThongTin(){
        super.inThongTin();
        System.out.println("Loai:" + getLoai());
        System.out.println("MA SV :" + maSV );
        System.out.println("Diem TB :" + diemTB);
    }

}
