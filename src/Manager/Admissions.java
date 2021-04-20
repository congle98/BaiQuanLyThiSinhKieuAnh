package Manager;
import Contestants.*;
import CombinationOfSubjects.*;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Admissions {
    private static List<Contestants> contestants = new ArrayList<Contestants>();
    private Scanner sc = new Scanner(System.in);

    public Admissions() {
        Menu();
    }
    public void Menu(){
        while (true){
            System.out.println("Mời nhập các lựa chọn sau đây \n 1. Thêm mới thí sinh " +
                    "\n 2. Hiển thị thông tin thí sinh theo số báo danh \n 3. Tìm kiếm theo số báo danh \n 4. Thoát");
            int choose = sc.nextInt();
            switch (choose){
                case 1:
                    addContestant();
                    break;
                case 2:
                    showContestant();
                    break;
                case 3:
                    searchContestant();
                    break;
                case 4:
                    System.exit(0);
                    break;
            }
        }
    }
    public void addContestant(){
        System.out.println("Mời nhập các thông tin theo thứ tự");
        System.out.println("Số báo danh:");
        int identificationNumber = sc.nextInt();
        System.out.println("Họ và tên:");
        String name = sc.next();
        System.out.println("Địa chỉ quê quán");
        String address = new Scanner(System.in).nextLine();
        System.out.println("Mức độ ưu tiên");
        int priorityLevel = sc.nextInt();
        System.out.println("Môn thi thứ nhất");
        String subject1 = sc.next();
        System.out.println("Môn thi thứ hai");
        String subject2 = sc.next();
        System.out.println("Môn thi thứ ba");
        String subject3 = sc.next();
        combinationOfSubjects combinationOfSubjects = new combinationOfSubjects(subject1,subject2,subject3);
        contestants.add(new Contestants(name,address,priorityLevel,combinationOfSubjects,identificationNumber));
    }
    public void showContestant(){
        System.out.println(contestants);
    }
    public void searchContestant(){
        System.out.println("Mời nhập số báo danh");
        int identificationNumber = sc.nextInt();
        for (int i = 0; i <contestants.size() ; i++) {
            if(contestants.get(i).getIdentificationNumber()==identificationNumber){
                System.out.println("Tìm thấy "+contestants.get(i)+" tại vị trí :"+i);
            }
        }
    }
}
