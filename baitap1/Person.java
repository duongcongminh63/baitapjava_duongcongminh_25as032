package baitap1;

public abstract class Person {
    private String hoTen;
    private String diaChi;
    private int namSinh;
    public Person(String hoTen, String diaChi, int namSinh) {
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.namSinh = namSinh;
    }
    public String getHoTen() {
        return hoTen;
    }
    public String getDiaChi() {
        return diaChi;
    }
    public int getNamSinh() {
        return namSinh;
    }
    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }
    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }
    public abstract String getLoai();
    public void inThongTin(){
        System.out.println("Ho Ten :" + getHoTen() );
        System.out.println("Dia Chi :"+ getDiaChi() );
        System.out.println("Nam Sinh :" + getNamSinh());
    }





}