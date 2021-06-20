package BTVN2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ManageCanBo {
    List<CanBo> list = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public void addCanBo(String nameCanBo) {
        CanBo canBo = create(nameCanBo);
        list.add(canBo);
    }

    public CanBo create(String nameCanBo) {
        System.out.println("Nhập tên:");
        String ten = scanner.nextLine();
        System.out.println("Nhập Ngày sinh:");
        String ngaySinh = scanner.nextLine();
        System.out.println("Nhập giới tính:");
        String gioiTinh = scanner.nextLine();
        System.out.println("Nhập địa chỉ:");
        String diaChi = scanner.nextLine();

        if (nameCanBo == "CongNhan"){
            System.out.println("Nhập Ngành:");
            String nganh = scanner.nextLine();
            System.out.println("Nhập bậc:");
            String bac = scanner.nextLine();
            return new CongNhan(nganh,bac,ten, ngaySinh, gioiTinh, diaChi);
        }else if (nameCanBo == "KySu"){
            System.out.println("Nhập Ngành:");
            String nganh = scanner.nextLine();
            return new KySu(ten, ngaySinh, gioiTinh, diaChi, nganh);
        }else {
            return new NhanVien(ten, ngaySinh, gioiTinh, diaChi);
        }
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

    public void edit(CanBo canBo, int index) {
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
}
