package ex25;

public class TestAccount {
    public static void main(String[] args) {
        // Tạo một khách hàng
        Customer c1 = new Customer(101, "Nguyen Van A", 'm');
        System.out.println(c1); // Nguyen Van A(101)

        // Tạo hai tài khoản
        Account acc1 = new Account(1, c1);
        Account acc2 = new Account(2, c1, 5000.0);

        // Kiểm tra các phương thức
        System.out.println(acc1); // Nguyen Van A(101) balance=$0.00
        System.out.println(acc2); // Nguyen Van A(101) balance=$5000.00

        acc2.deposit(1500.0);
        System.out.println("Sau khi gửi tiền: " + acc2); // +1500

        acc2.withdraw(3000.0);
        System.out.println("Sau khi rút tiền: " + acc2); // -3000

        acc2.withdraw(4000.0); // không đủ tiền -> in cảnh báo
    }
}

