package bai05.baitap;

public class PhuThuy extends NhanVat {
	private boolean choi;
	private boolean caygayphep;
	public PhuThuy(String ten, String id, byte gioitinh, double nangluong, boolean choi, boolean caygayphep) {
		super(ten, id, gioitinh, nangluong);
		this.choi = choi;
		this.caygayphep = caygayphep;
	}
	public boolean isChoi() {
		return choi;
	}
	public void setChoi(boolean choi) {
		this.choi = choi;
	}
	public boolean isCaygayphep() {
		return caygayphep;
	}
	public void setCaygayphep(boolean caygayphep) {
		this.caygayphep = caygayphep;
	}
	
	@Override
	public String toString() {
		return "PhuThuy [choi=" + choi + ", caygayphep=" + caygayphep + ", toString()=" + super.toString() + "]";
	}
	@Override
	public void hanhdong() {
		// TODO Auto-generated method stub
		System.out.println("Bay");
	}
	@Override
	public void sucmanh() {
		// TODO Auto-generated method stub
		double energy = this.getNangluong()*1.7;
		System.out.println("Suc manh cua phu thuy la: " + energy);
	}
	
	
	
}
