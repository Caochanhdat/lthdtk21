package bai05.baitap;

public class BoBinh extends NhanVat {
	private int giao;
	private boolean khien;
	private boolean aogiap;
	public BoBinh(String ten, String id, byte gioitinh, double nangluong, int giao, boolean khien, boolean aogiap) {
		super(ten, id, gioitinh, nangluong);
		this.giao = giao;
		this.khien = khien;
		this.aogiap = aogiap;
	}
	public int getGiao() {
		return giao;
	}
	public void setGiao(int giao) {
		this.giao = giao;
	}
	public boolean isKhien() {
		return khien;
	}
	public void setKhien(boolean khien) {
		this.khien = khien;
	}
	public boolean isAogiap() {
		return aogiap;
	}
	public void setAogiap(boolean aogiap) {
		this.aogiap = aogiap;
	}
	
	@Override
	public String toString() {
		return "BoBinh [giao=" + giao + ", khien=" + khien + ", aogiap=" + aogiap + ", toString()=" + super.toString()
				+ "]";
	}
	@Override
	public void hanhdong() {
		// TODO Auto-generated method stub
		System.out.println("Dam giao");
	}
	@Override
	public void sucmanh() {
		// TODO Auto-generated method stub
		double energy = this.getNangluong()*1;
		System.out.println("Suc manh cua bo binh la: " + energy);
	}
	
	
	
}
