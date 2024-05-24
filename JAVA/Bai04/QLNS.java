package bai3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QLNS {
	private List<Nguoi> dsns;

	public QLNS() {
		// TODO Auto-generated constructor stub
		dsns = new ArrayList<Nguoi>();
	}

	public void themNhanSu(Nguoi ns) {
		dsns.add(ns);
	}

	public void nhapDanhSach(Scanner sc) {
		System.out.println("nhap n so luong nhan su : ");
		int n = sc.nextInt();
		sc.nextLine();

		int chon = 0;
		Nguoi ns = null;
		for (int i = 0; i < n; i++) {
			System.out.print("Chọn loại ns muốn nhập (0: hs, 1: sv): ");
			chon = sc.nextInt();
			sc.nextLine();
			switch (chon) {
			case 0:
				ns = new HocSinh();
				break;
			case 1:
				ns = new SinhVien();
				break;
			}
			ns.nhapThongTin(sc); // Tinh da hinh
			themNhanSu(ns);
		}
	}

	public void inDanhSach() {
		for (Nguoi ns : dsns) {
			ns.InTT(); // Tinh da hinh
		}
	}

	public void timKiemTheoMSV(String msv) {

		for (Nguoi ns : dsns) {
			if (ns instanceof SinhVien) { // Chi xét loại sinh viên
				SinhVien sv = (SinhVien) ns; // Ép về kiểu sinh viên
				if (msv.equals(sv.getMsv())) {
					sv.inThongTinSV(sv);
				}
			}
		}
	}

	public static void main(String[] args) {
		QLNS qlns = new QLNS();
		Scanner sc = new Scanner(System.in);
		qlns.nhapDanhSach(sc);
		qlns.inDanhSach();
		qlns.timKiemTheoMSV("671667");
	}
}
