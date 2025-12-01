package baitap2;

public class TestHinhHoc {
    public static void main(String[] args) {
        Hinh[] ds = new Hinh[3];
      ds   [0]  = new HinhTron("Hinh Tron" ,5) ;
       ds  [1]  = new HinhChuNhat("Hinh Chu Nhat " ,4,6);
       ds  [2]  = new HinhVuong ("Hinh Vuong " , 7  );
        for ( Hinh h : ds ){
            h.xuatThongTin();
        }
    }

}
