import java.util.Arrays;

import Ex.congclass;
import Ex2.animal;
import Ex2.property2;
import Ex2.staff;
import Ex2.zoo;
import Ex3.lazy;
import Ex5.employee;
import resource.car;
import stuff.computer;

public class main {
    public static void main(String[] args) {
        // computer Cong = new computer("MyCong", 3, "hp", 300, "black", "corei9");
        // System.out.println(Cong.getCPU());
        // for (int i = 0; i < 8; i++) {
        // System.out.println(i);
        // }

        // int i = 0;
        // while (i < 9) {
        // System.out.println(i);
        // i++;
        // }

        // int a = 5;
        // do {
        // System.out.println(a);
        // a++;
        // } while (a < 8);
        // student st1 = new student(1, "Cong1", 23, "22/12/1999");
        // student st2 = new student(1, "Cong2", 23, "22/12/1999");
        // student st3 = new student(1, "Cong3", 23, "22/12/1999");
        // student st4 = new student(1, "Cong4", 23, "22/12/1999");
        // student st5 = new student(1, "Cong5", 23, "22/12/1999");
        // student st6 = new student(1, "Cong6", 23, "22/12/1999");
        // student st7 = new student(1, "Cong7", 23, "22/12/1999");
        // student st8 = new student(1, "Cong8", 23, "22/12/1999");
        // student st9 = new student(1, "Cong9", 23, "22/12/1999");
        // student st10 = new student(1, "Cong10", 23, "22/12/1999");

        // student[] listStudent = { st1, st2, st3, st4, st5, st6, st7, st8, st9, st10
        // };
        // String teacher = "Nguyễn Văn Công";
        // congclass classCong = new congclass(1, "cong", teacher, listStudent);

        // for (int i = 0; i < (classCong.getListStudent()).length; i++) {
        // System.out.println(classCong.getListStudent()[i].getName());
        // }

        // staff staff1 = new staff("Thu", 23, 1, "0011990098768", "Thanh Thuy");
        // staff staff2 = new staff("Cong", 33, 1, "0011990098768", "Thanh Thuy");
        // staff staff3 = new staff("Hoa", 45, 1, "0011990098768", "Thanh Thuy");

        // staff[] listStaff = { staff1, staff2, staff3 };

        // animal animal1 = new animal("Hook", 3, "Rabit", "Jungle");
        // animal animal2 = new animal("Hook", 3, "Dog", "Home");

        // animal[] listAnimal = { animal1, animal2 };
        // zoo zooHN = new zoo("Hanoi", 300, 10, listStaff, listAnimal);

        // for (int i = 0; i < (zooHN.getListStaff()).length; i++) {
        // System.out.println(zooHN.getListStaff()[i].getName() + "-" +
        // zooHN.getListStaff()[i].getAge());
        // }

        // for (int i = 0; i < (zooHN.getListAnimal()).length; i++) {
        // System.out.println(zooHN.getListAnimal()[i].getType() + "-" +
        // zooHN.getListAnimal()[i].getOrigin());

        // }

        int[] number = { 1, 5, 6, 3, 2 };
        // int[] numberShort = Arrays.copyOfRange(number, 1, 4);
        // Arrays.sort(number);
        // for (int i : number) {
        // System.out.println(i);
        // }
        // String numberString = Arrays.toString(number); // "[1, 5, 6, 3, 2]"
        // System.out.println(numberString);

        // for (int i = 0; i < number.length; i++) {
        // System.out.println(number[i]);
        // }
        // student Cong = new student(2, "Cong", 23, "21/03/1999");
        // System.out.println(student.bla2);

        // zoo Congxo = new zoo("Thanh Hoa", 23.4, 8);
        // System.out.println(property2.color);

        // lazy Congcow = new lazy("red", 34, "Thao");
        // Congcow.boo("bee");
        employee Cong = new employee("Cong", 23, "Thanh Thuy", 5, 20, 2700, 34);
        System.out.println(Cong.actualSalary());
    }

    
        
}
