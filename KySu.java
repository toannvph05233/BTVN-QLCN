package BTVN2;

public class KySu extends CanBo{
    private String nganh;

    public String getNganh() {
        return nganh;
    }

    @Override
    public String toString() {
        return "KySu{" +
                "nganh='" + nganh + '\'' +
                '}' + super.toString();
    }

    public void setNganh(String nganh) {
        this.nganh = nganh;
    }

    public KySu(String nganh) {
        this.nganh = nganh;
    }

    public KySu(String hoTen, String ngaySinh, String gioiTinh, String diaChi, String nganh) {
        super(hoTen, ngaySinh, gioiTinh, diaChi);
        this.nganh = nganh;
    }
}
