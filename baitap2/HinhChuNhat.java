package baitap2;

import baitap2.Hinh;

public class HinhChuNhat extends Hinh {
    private double chieuDai;
    private  double chieuRong;

    public HinhChuNhat(String tenHinh, double chienDai, double chieuRong) {
        super(tenHinh);
        this.chieuDai = chienDai;
        this.chieuRong = chieuRong;
    }

    @Override
    public double tinhChuVi() {
        return 2 * (chieuDai + chieuRong);
    }

    @Override
    public double tinhDienTich() {
        return  chieuDai * chieuRong;
    }
}


