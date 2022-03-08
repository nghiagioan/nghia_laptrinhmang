import java.util.Scanner;

public class SanPham {
	private String tenSP;
	private double donGia;
	private double giamGia;
	// hàm tạo đầy đủ 3 tham số
	public SanPham(String _tenSP, double _donGia, double _giamGia) {
		tenSP = _tenSP;
		donGia = _donGia;
		giamGia = _giamGia;
	}
	public SanPham(String _tenSP, double _donGia){
        tenSP = _tenSP;
        donGia = _donGia;
        giamGia = 0;
    }
	//10% gia
	private double getThueNhapKhau() {
		return donGia*0.1;
	}
	// Nhap du lieu cac thuoc tinh
	void nhap() {
		Scanner bp = new Scanner(System.in);
		System.out.print("Nhập tên SP: ");
		tenSP = bp.nextLine();
		System.out.print("Nhập đơn giá SP: ");
		donGia = bp.nextDouble();
		System.out.print("Nhập giảm giá SP: ");
		giamGia = bp.nextDouble();
	}
	void xuat() {
		System.out.println("Tên sản phẩm: " + tenSP);
		System.out.println("Giá sản phẩm: " + String.valueOf(donGia));
		System.out.println("Giảm giá: " + String.valueOf(giamGia));
		System.out.println("Thuế nhập khẩu: " + String.valueOf(getThueNhapKhau()));
		
	}
}
