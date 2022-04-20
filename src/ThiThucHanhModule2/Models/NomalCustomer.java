package ThiThucHanhModule2.Models;

public class NomalCustomer extends Customer {
    private int phiVien;
    public NomalCustomer() {
    }

    public NomalCustomer(int sttBenhAn,
                         int maBenhAn,
                         int maBenhNhan,
                         String name,
                         String ngayNhapVien,
                         String ngayRaVien,
                         String lyDoNhapVien,
                         int phiVien) {
        super(sttBenhAn, maBenhAn, maBenhNhan, name, ngayNhapVien, ngayRaVien, lyDoNhapVien);
        this.phiVien = phiVien;
    }

    public int getPhiVien() {
        return phiVien;
    }

    public void setPhiVien(int phiVien) {
        this.phiVien = phiVien;
    }

    @Override
    public String toString() {
        return "NomalCustomer{" + super.toString() +
                "phiVien=" + phiVien +
                '}';
    }
}
