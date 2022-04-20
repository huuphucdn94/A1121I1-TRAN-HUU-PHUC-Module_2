package FinalExamModule2.models;

public class BenhAnThuong extends BenhAn {
    private String phiNamVien;

    public BenhAnThuong(){
    }

    public BenhAnThuong(String soThuTu, String maBenhAn, String tenBenhNhan, String ngayNhapVien, String ngayRaVien, String lyDoNhapVien, String phiNamVien) {
        super(soThuTu, maBenhAn, tenBenhNhan, ngayNhapVien, ngayRaVien, lyDoNhapVien);
        this.phiNamVien = phiNamVien;
    }

    public String getPhiNamVien() {
        return phiNamVien;
    }

    public void setPhiNamVien(String phiNamVien) {
        this.phiNamVien = phiNamVien;
    }

    @Override
    public String toString() {
        return "BenhAnThuong{" + super.toString() +
                "phiNamVien='" + phiNamVien + '\'' +
                '}';
    }
    public String getInfoBenhAn(){
        return this.getSoThuTu()+ ","+ this.getMaBenhAn()+ "," +this.getTenBenhNhan()+ ","+this.getNgayNhapVien()+ ","+this.getNgayRaVien()+
                ","+this.getLyDoNhapVien()+","+this.getPhiNamVien();
    }
}
