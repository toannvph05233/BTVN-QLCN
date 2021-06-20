package BTVN2;

public class CongNhan extends CanBo{
    private String nganh;
    private String bac;

    public String getNganh() {
        return nganh;
    }

    public void setNganh(String nganh) {
        this.nganh = nganh;
    }

    public String getBac() {
        return bac;
    }

    @Override
    public String toString() {
        return "CongNhan{" +
                "nganh='" + nganh + '\'' +
                ", bac='" + bac + '\'' +
                '}' + super.toString();
    }

    public void setBac(String bac) {
        this.bac = bac;
    }

    public CongNhan(String nganh, String bac) {
        this.nganh = nganh;
        this.bac = bac;
    }

    public CongNhan(String nganh, String bac,String hoTen, String ngaySinh, String gioiTinh, String diaChi) {
        super(hoTen, ngaySinh, gioiTinh, diaChi);
        this.nganh = nganh;
        this.bac = bac;
    }
}
