/**
 * 
 */
package bai06.vidu1;

/**
 * 
 */
public class HinhChuNhat implements HinhHoc {
	private double chieudai;
	private double chieurong;
	
	
	
	public HinhChuNhat(double chieudai, double chieurong) {
		super();
		this.chieudai = chieudai;
		this.chieurong = chieurong;
	}

	@Override
	public double TinhChuVi() {
		// TODO Auto-generated method stub
		return 2*(this.chieudai + this.chieurong);
	}

	@Override
	public double TinhDienTich() {
		// TODO Auto-generated method stub
		return this.chieudai * this.chieurong;
	}

	public double getChieudai() {
		return chieudai;
	}

	public void setChieudai(double chieudai) {
		this.chieudai = chieudai;
	}

	public double getChieurong() {
		return chieurong;
	}

	public void setChieurong(double chieurong) {
		this.chieurong = chieurong;
	}

	@Override
	public String toString() {
		return "HinhChuNhat [chieudai=" + chieudai + ", chieurong=" + chieurong + "]";
	}
	

}
