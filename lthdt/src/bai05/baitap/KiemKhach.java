package bai05.baitap;

public class KiemKhach extends NhanVat {
	private int sokiem;
	private int cap_do_su_dung;
	public KiemKhach(String ten, String id, byte gioitinh, double nangluong, int sokiem, int cap_do_su_dung) {
		super(ten, id, gioitinh, nangluong);
		this.sokiem = sokiem;
		this.cap_do_su_dung = cap_do_su_dung;
	}
	public int getSokiem() {
		return sokiem;
	}
	public void setSokiem(int sokiem) {
		this.sokiem = sokiem;
	}
	public int getCap_do_su_dung() {
		return cap_do_su_dung;
	}
	public void setCap_do_su_dung(int cap_do_su_dung) {
		this.cap_do_su_dung = cap_do_su_dung;
	}
	
	@Override
	public String toString() {
		return "KiemKhach [sokiem=" + sokiem + ", cap_do_su_dung=" + cap_do_su_dung + ", toString()=" + super.toString()
				+ "]";
	}
	@Override
	public void hanhdong() {
		// TODO Auto-generated method stub
		System.out.println("Vung kiem chem");
	}
	@Override
	public void sucmanh() {
		// TODO Auto-generated method stub
		double energy = this.getNangluong()*1.5;
		System.out.println("Suc manh cua kiem khach la: " + energy);
	}

}
