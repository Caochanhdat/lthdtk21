/**
 * 
 */
package bai06.vidu1;

/**
 * 
 */
public class HinhTron implements HinhHoc {
	private double bankinh;
	
	

	public HinhTron(double bankinh) {
		super();
		this.bankinh = bankinh;
	}

	@Override
	public double TinhChuVi() {
		// TODO Auto-generated method stub
		return 2*Math.PI*this.bankinh;
	}

	@Override
	public double TinhDienTich() {
		// TODO Auto-generated method stub
		return Math.PI*this.bankinh*this.bankinh;
	}

	public double getBankinh() {
		return bankinh;
	}

	public void setBankinh(double bankinh) {
		this.bankinh = bankinh;
	}

	@Override
	public String toString() {
		return "HinhTron [bankinh=" + bankinh + "]";
	}
	

}
