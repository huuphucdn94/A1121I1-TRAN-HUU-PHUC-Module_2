package FinalExamModule2.models;

public class BenhAnVIP extends BenhAn{
    private  String loaiVIP;
    private String thoiHanVIP;

    public BenhAnVIP(){
    }

    public BenhAnVIP(String soThuTu, String maBenhAn, String tenBenhNhan, String ngayNhapVien, String ngayRaVien, String lyDoNhapVien, String loaiVIP, String thoiHanVIP) {
        super(soThuTu, maBenhAn, tenBenhNhan, ngayNhapVien, ngayRaVien, lyDoNhapVien);
        this.loaiVIP = loaiVIP;
        this.thoiHanVIP = thoiHanVIP;
    }

    public String getLoaiVIP() {
        return loaiVIP;
    }

    public void setLoaiVIP(String loaiVIP) {
        this.loaiVIP = loaiVIP;
    }

    public String getThoiHanVIP() {
        return thoiHanVIP;
    }

    public void setThoiHanVIP(String thoiHanVIP) {
        this.thoiHanVIP = thoiHanVIP;
    }
    public String getInfoBenhAn(){
        return this.getSoThuTu()+ ","+ this.getMaBenhAn()+ "," +this.getTenBenhNhan()+ ","+this.getNgayNhapVien()+ ","+this.getNgayRaVien()+
                ","+this.getLyDoNhapVien()+","+this.getLoaiVIP()+","+this.getThoiHanVIP();
    }
}
