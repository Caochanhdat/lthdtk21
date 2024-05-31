package bai05.baitap;

public class KyBinh extends NhanVat {
	private boolean ngua;
	private boolean cung;
	private boolean giao;
	private boolean guom;
	public KyBinh(String ten, String id, byte gioitinh, double nangluong, boolean ngua, boolean cung, boolean giao,
			boolean guom) {
		super(ten, id, gioitinh, nangluong);
		this.ngua = ngua;
		this.cung = cung;
		this.giao = giao;
		this.guom = guom;
	}
	
	public boolean isNgua() {
		return ngua;
	}
	public void setNgua(boolean ngua) {
		this.ngua = ngua;
	}
	public boolean isCung() {
		return cung;
	}
	public void setCung(boolean cung) {
		this.cung = cung;
	}
	public boolean isGiao() {
		return giao;
	}
	public void setGiao(boolean giao) {
		this.giao = giao;
	}
	public boolean isGuom() {
		return guom;
	}
	public void setGuom(boolean guom) {
		this.guom = guom;
	}
	
	@Override
	public String toString() {
		return "KyBinh [ngua=" + ngua + ", cung=" + cung + ", giao=" + giao + ", guom=" + guom + ", toString()="
				+ super.toString() + "]";
	}

	@Override
	public void hanhdong() {
		// TODO Auto-generated method stub
		System.out.println("Cuoi ngua va ban ten");
	}
	@Override
	public void sucmanh() {
		// TODO Auto-generated method stub
		double energy = this.getNangluong()*2;
		System.out.println("Suc manh cua ky binh la: " + energy);
	}
	
	
	
}
