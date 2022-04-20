package FinalModule2.models;

public class DienThoaiChinhHang extends DienThoai{
    private String thoiGianBaoHanh;
    private String phamViBaoHanh;

    public DienThoaiChinhHang(String id, String ten, String giaBan, String soLuong, String nhaSanXuat, String thoiGianBaoHanh, String phamViBaoHanh) {
        super(id, ten, giaBan, soLuong, nhaSanXuat);
        this.thoiGianBaoHanh = thoiGianBaoHanh;
        this.phamViBaoHanh = phamViBaoHanh;
    }

    public String getThoiGianBaoHanh() {
        return thoiGianBaoHanh;
    }

    public void setThoiGianBaoHanh(String thoiGianBaoHanh) {
        this.thoiGianBaoHanh = thoiGianBaoHanh;
    }

    public String getPhamViBaoHanh() {
        return phamViBaoHanh;
    }

    public void setPhamViBaoHanh(String phamViBaoHanh) {
        this.phamViBaoHanh = phamViBaoHanh;
    }

    @Override
    public String toString() {
        return "DienThoaiChinhHang{" + super.toString() +
                "thoiGianBaoHanh='" + thoiGianBaoHanh + '\'' +
                ", phamViBaoHanh='" + phamViBaoHanh + '\'' +
                '}';
    }
    public String getInfoDienThoai(){
        return this.getId()+ ", " + this.getGiaBan() +", " + this.getSoLuong() +", " + this.getNhaSanXuat() + ", " + this.getThoiGianBaoHanh() +", " + this.getPhamViBaoHanh();
    }
}
