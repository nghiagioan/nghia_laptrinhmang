
public class ChuongTrinhChinh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		//khai báo, tạo mới 2 đối tượng
		//SanPham sp1 = new SanPham();
		//SanPham sp2 = new SanPham();
		SanPham sp1 = new SanPham("Kẹo", 100000, 0.1);
		SanPham sp2 = new SanPham("Bia", 120000);
		// nhập dữu liệu
		sp1.nhap();
		sp2.nhap();
		//xuất dữ liệu
		sp1.xuat();
		sp2.xuat();
		//-----------------------
//		// tạo cứng 2 hàng hóa
//		HangHoa hh1 = new HangHoa("but bi", 20000);
//		HangHoa hh2 = new HangHoa("Bút chì", 32000, 0.1);
//		//xuất thông tin
//		System.out.println("-----------------------------------");
//		System.out.println("Tên sản phẩm 1: " + hh1.getTenHH());
//		System.out.println("Giá sản phẩm 1: " + hh1.getDonGia());
//		System.out.println("Giảm giá: " + hh1.getGiamGia());
//		System.out.println("Thuế nhập khẩu: " + hh1.getDonGia()*0.1);
//		System.out.println("-----------------------------------");																											
//		System.out.println("Tên sản phẩm 1: " + hh2.getTenHH());
//		System.out.println("Giá sản phẩm 1: " + hh2.getDonGia());
//		System.out.println("Giảm giá: " + hh2.getGiamGia());
//		System.out.println("Thuế nhập khẩu: " + hh2.getDonGia()*0.1);
	}

}
