package ThiThucHanhModule2.Models;

public abstract class Customer {
    private  int sttBenhAn;
    private int maBenhAn;
    private int maBenhNhan;
    private String name;
    private String ngayNhapVien;
    private String ngayRaVien;
    private String lyDoNhapVien;

    Customer(){
    }

    public Customer(int sttBenhAn,
                    int maBenhAn,
                    int maBenhNhan,
                    String name,
                    String ngayNhapVien,
                    String ngayRaVien,
                    String lyDoNhapVien) {
        this.sttBenhAn = sttBenhAn;
        this.maBenhAn = maBenhAn;
        this.maBenhNhan = maBenhNhan;
        this.name = name;
        this.ngayNhapVien = ngayNhapVien;
        this.ngayRaVien = ngayRaVien;
        this.lyDoNhapVien = lyDoNhapVien;
    }

    public int getSttBenhAn() {
        return sttBenhAn;
    }

    public void setSttBenhAn(int sttBenhAn) {
        this.sttBenhAn = sttBenhAn;
    }

    public int getMaBenhAn() {
        return maBenhAn;
    }

    public void setMaBenhAn(int maBenhAn) {
        this.maBenhAn = maBenhAn;
    }

    public int getMaBenhNhan() {
        return maBenhNhan;
    }

    public void setMaBenhNhan(int maBenhNhan) {
        this.maBenhNhan = maBenhNhan;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNgayNhapVien() {
        return ngayNhapVien;
    }

    public void setNgayNhapVien(String ngayNhapVien) {
        this.ngayNhapVien = ngayNhapVien;
    }

    public String getNgayRaVien() {
        return ngayRaVien;
    }

    public void setNgayRaVien(String ngayRaVien) {
        this.ngayRaVien = ngayRaVien;
    }

    public String getLyDoNhapVien() {
        return lyDoNhapVien;
    }

    public void setLyDoNhapVien(String lyDoNhapVien) {
        this.lyDoNhapVien = lyDoNhapVien;
    }

    @Override
    public String toString() {
        return "HopitalCustomer{" +
                "sttBenhAn=" + sttBenhAn +
                ", maBenhAn=" + maBenhAn +
                ", maBenhNhan=" + maBenhNhan +
                ", name=" + name +
                ", ngayNhapVien='" + ngayNhapVien + '\'' +
                ", ngayRaVien='" + ngayRaVien + '\'' +
                ", lyDoNhapVien='" + lyDoNhapVien + '\'' +
                '}';
    }
}
