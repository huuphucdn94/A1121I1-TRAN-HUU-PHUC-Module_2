package FinalModule2.models;

public class DienThoaiXachTay extends DienThoai {
    private String quocGiaXachTay;
    private String trangThai;

    public DienThoaiXachTay(String id, String ten, String giaBan, String soLuong, String nhaSanXuat, String quocGiaXachTay, String trangThai) {
        super(id, ten, giaBan, soLuong, nhaSanXuat);
        this.quocGiaXachTay = quocGiaXachTay;
        this.trangThai = trangThai;
    }

    public String getQuocGiaXachTay() {
        return quocGiaXachTay;
    }

    public void setQuocGiaXachTay(String quocGiaXachTay) {
        this.quocGiaXachTay = quocGiaXachTay;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    @Override
    public String toString() {
        return "DienThoaiXachTay{" + super.toString() +
                "quocGiaXachTay='" + quocGiaXachTay + '\'' +
                ", trangThai='" + trangThai + '\'' +
                '}';
    }
    public String getInfoDienThoai(){
        return this.getId()+ ", " + this.getGiaBan() +", " + this.getSoLuong() +", " + this.getNhaSanXuat() + ", " + this.getQuocGiaXachTay() +", " + this.getTrangThai();
    }
}
