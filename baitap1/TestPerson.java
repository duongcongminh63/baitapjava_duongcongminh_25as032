package baitap1;

public class TestPerson {
    public static void main(String[] args) {
        Person [] ds = new Person[6];
        ds [0] = new SinhVien("Duong Cong Minh ", "Da Nang " , 2007, "25AS032", 8.0);
        ds [1] = new SinhVien("Pham Trung Chien" , "Quang Nam", 2007, "25AS007" , 8.0);
        ds [2] = new SinhVien("Nguyen Vu Thanh Ha", "Campuchia" , 2007, "25AS" , 1.5 );
        ds [3] = new SinhVien( " Pham Thai Bao " , " Lao " , 2007 , "25AS004" , 0.5 ) ;



        ds [4] = new GiangVien("Ba Ha " , " Da Nang",1998,"JHG",14000000);
        ds [5] = new GiangVien("Ba No " , " Da Nang",1899,"JHQ",18000000);
        for (Person p : ds) {
            p.inThongTin();
        }
    }


}
