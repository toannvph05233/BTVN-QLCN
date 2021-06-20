package BTVN2;

public class NhanVien extends CanBo{

    public NhanVien() {
    }

    public NhanVien(String hoTen, String ngaySinh, String gioiTinh, String diaChi) {
        super(hoTen, ngaySinh, gioiTinh, diaChi);
    }

    @Override
    public String toString() {
        return "NhanVien{}" + super.toString();
    }
}
