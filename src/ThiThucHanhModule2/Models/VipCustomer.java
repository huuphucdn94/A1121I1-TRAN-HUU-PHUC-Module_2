package ThiThucHanhModule2.Models;

public class VipCustomer extends Customer {
    private String vip;
    private String thoiHanVip;

    public VipCustomer(){
    }
    public VipCustomer(int sttBenhAn,
                       int maBenhAn,
                       int maBenhNhan,
                       String name,
                       String ngayNhapVien,
                       String ngayRaVien,
                       String lyDoNhapVien,
                       String vip,
                       String thoiHanVip) {
        super(sttBenhAn, maBenhAn, maBenhNhan, name, ngayNhapVien, ngayRaVien, lyDoNhapVien);
        this.vip = vip;
        this.thoiHanVip = thoiHanVip;
    }

    public VipCustomer(int sttBenhAn, int maBenhAn, int maBenhNhan, String name, String ngayNhapVien, String ngayRaVien, String lyDoNhapVien, int loaiVip) {
    }

    public String getVip() {
        return vip;
    }

    public void setVip(String vip) {
        this.vip = vip;
    }

    public String getThoiHanVip() {
        return thoiHanVip;
    }

    public void setThoiHanVip(String thoiHanVip) {
        this.thoiHanVip = thoiHanVip;
    }

    @Override
    public String toString() {
        return "VipCustomer{" + super.toString() +
                "vip='" + vip + '\'' +
                ", thoiHanVip='" + thoiHanVip + '\'' +
                '}';
    }
}
