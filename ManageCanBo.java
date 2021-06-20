package BTVN2;

import java.util.ArrayList;
import java.util.Scanner;

public class ManageCanBo {
    ArrayList<CanBo> list = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public void addNhanVien() {
        System.out.println("Nhập tên:");
        String ten = scanner.nextLine();
        System.out.println("Nhập Ngày sinh:");
        String ngaySinh = scanner.nextLine();
        System.out.println("Nhập giới tính:");
        String gioiTinh = scanner.nextLine();
        System.out.println("Nhập địa chỉ:");
        String diaChi = scanner.nextLine();
        NhanVien nhanVien = new NhanVien(ten, ngaySinh, gioiTinh, diaChi);

        list.add(nhanVien);
    }

    public void addCongNhan() {
        System.out.println("Nhập tên:");
        String ten = scanner.nextLine();
        System.out.println("Nhập Ngày sinh:");
        String ngaySinh = scanner.nextLine();
        System.out.println("Nhập giới tính:");
        String gioiTinh = scanner.nextLine();
        System.out.println("Nhập địa chỉ:");
        String diaChi = scanner.nextLine();
        System.out.println("Nhập Ngành:");
        String nganh = scanner.nextLine();
        System.out.println("Nhập bậc:");
        String bac = scanner.nextLine();

        CongNhan congNhan = new CongNhan(nganh, bac, ten, ngaySinh, gioiTinh, diaChi);
        list.add(congNhan);
    }

    public void addKySu() {
        System.out.println("Nhập tên:");
        String ten = scanner.nextLine();
        System.out.println("Nhập Ngày sinh:");
        String ngaySinh = scanner.nextLine();
        System.out.println("Nhập giới tính:");
        String gioiTinh = scanner.nextLine();
        System.out.println("Nhập địa chỉ:");
        String diaChi = scanner.nextLine();
        System.out.println("Nhập Ngành:");
        String nganh = scanner.nextLine();

        KySu kySu = new KySu(ten, ngaySinh, gioiTinh, diaChi, nganh);
        list.add(kySu);
    }

    public void fillByName(String name) {
        for (CanBo c : list) {
            if (c.getHoTen().equals(name)) {
                System.out.println(c);
                break;
            }
        }
    }

    public void removeByName(String name) {
        for (CanBo c : list) {
            if (c.getHoTen().equals(name)) {
                list.remove(c);
                break;
            }
        }
    }

    public void editByName(CanBo canBo, int index) {
        list.set(index, canBo);
    }

    public void show() {
        for (CanBo c : list) {
            System.out.println(c);
        }
    }
    public void sort() {
        SortCanBo sortCanBo = new SortCanBo();
        list.sort(sortCanBo);

    }
    public void fillByNganh(String nganh) {
        for (CanBo c:list) {
            if (c instanceof KySu){
                if (((KySu)c).getNganh().equals(nganh)){
                    System.out.println(c);
                };
            }
            if (c instanceof CongNhan){
                if (((CongNhan)c).getNganh().equals(nganh)){
                    System.out.println(c);
                };
            }
        }
    }


    public CanBo create() {
        System.out.println("Nhập tên:");
        String ten = scanner.nextLine();
        System.out.println("Nhập Ngày sinh:");
        String ngaySinh = scanner.nextLine();
        System.out.println("Nhập giới tính:");
        String gioiTinh = scanner.nextLine();
        System.out.println("Nhập địa chỉ:");
        String diaChi = scanner.nextLine();

        return new CanBo(ten, ngaySinh, gioiTinh, diaChi);

    }
}
