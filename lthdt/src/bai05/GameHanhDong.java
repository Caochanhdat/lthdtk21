package bai05;
import bai05.baitap.BoBinh;
import bai05.baitap.KiemKhach;
import bai05.baitap.KyBinh;
import bai05.baitap.PhuThuy;
public class GameHanhDong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		KyBinh kb = new KyBinh("Dat", "IT2005", (byte) 1, 9.5, true, true, false, false);
		System.out.println(kb);
		kb.hanhdong();
		kb.sucmanh();
		PhuThuy pt = new PhuThuy("Dat", "IT2005", (byte) 0, 6.5, true, false);
		System.out.println(pt);
		pt.hanhdong();
		pt.sucmanh();
		KiemKhach kk = new KiemKhach("Dat", "IT2005", (byte) 1, 7.5, 1, 3);
		System.out.println(kk);
		kk.hanhdong();
		kk.sucmanh();
		BoBinh bb = new BoBinh("Dat", "IT2005", (byte) 1, 8.5, 1, false, true);
		System.out.println(bb);
		bb.hanhdong();
		bb.sucmanh();
	}

}
