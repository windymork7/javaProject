package grade;

import student.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GradeProcess {

    public Student student;
    public List<Student> list;

    public GradeProcess() {
        list = new ArrayList<Student>();
    }

    public List<Student> insert(){

        Scanner scanner = new Scanner(System.in);
        student = new Student();

        System.out.print("학생 이름을 입력해 주세요 : ");
        student.setName(scanner.next());
        System.out.print("국어 점수를 입력해 주세요 : ");
        student.setKor(scanner.nextInt());
        System.out.print("영어 점수를 입력해 주세요 : ");
        student.setEng(scanner.nextInt());
        System.out.print("수학 점수를 입력해 주세요 : ");
        student.setMat(scanner.nextInt());

        list.add(student);
        System.out.println(student.getName()+"의 학생정보가 등록되었습니다.");

        return list;
    }

    public List<Student> update(){

        Scanner scanner = new Scanner(System.in);

        System.out.print("수정할 학생 이름을 입력해 주세요 : ");
        String findName = scanner.next();
        int cnt=0;

        for (int i = 0; i < list.size(); i++) {
            if (findName.equals(list.get(i).getName())) {
                System.out.print("변경할 국어 점수를 입력해 주세요 : ");
                list.get(i).setKor(scanner.nextInt());
                System.out.print("변경할 영어 점수를 입력해 주세요 : ");
                list.get(i).setEng(scanner.nextInt());
                System.out.print("변경할 수학 점수를 입력해 주세요 : ");
                list.get(i).setMat(scanner.nextInt());
                System.out.println("수정이 완료되었습니다.");
                break;
            } else if(cnt == list.size()-1){
                System.out.println("찾으시는 학생이 없습니다");
            } else {
                cnt++;
            }
        }


        return list;
    }

    public void delete(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("삭제할 학생 이릅을 입력해 주세요 : ");
        String findName = scanner.next();

        int cnt=0;

        for (int i = 0; i < list.size(); i++) {
            if (findName.equals(list.get(i).getName())){
                list.remove(i);
                System.out.println("삭제가 완료되었습니다.");
                break;
            } else if(cnt == list.size()-1){
                System.out.println("찾으시는 학생이 없습니다.");
            } else{
                cnt++;
            }
        }
    }


    public void show(){

        Scanner scanner = new Scanner(System.in);

        int cnt=0;

        System.out.println("1.학생 조회");
        System.out.println("2.전체 조회");
        System.out.println("=============================");
        System.out.print("선택하신 번호 : ");
        int choice = scanner.nextInt();

        if (choice == 1){
            System.out.print("검색할 학생 이름을 입력해 주세요 : ");
            String findName = scanner.next();

            for (int i = 0; i < list.size(); i++) {
                if (findName.equals(list.get(i).getName())){
                    System.out.println("이름 \t 국어 \t 영어 \t 수학 \t 총점 \t 평균");
                    System.out.print(list.get(i).getName() + "\t");
                    System.out.print(list.get(i).getKor() + "\t");
                    System.out.print(list.get(i).getEng() + "\t");
                    System.out.print(list.get(i).getMat() + "\t");
                    System.out.print(list.get(i).getTotal() + "\t");
                    System.out.println(list.get(i).getAvg() + "\t");
                    break;
                } else if(cnt == list.size()-1){
                    System.out.println("찾으시는 학생이 없습니다");
                } else {
                    cnt++;
                }
            }
        } else if(choice == 2){
            System.out.println("이름 \t 국어 \t 영어 \t 수학 \t 총점 \t 평균");
            for (int i = 0; i < list.size(); i++) {
                System.out.print(list.get(i).getName() + "\t");
                System.out.print(list.get(i).getKor() + "\t");
                System.out.print(list.get(i).getEng() + "\t");
                System.out.print(list.get(i).getMat() + "\t");
                System.out.print(list.get(i).getTotal() + "\t");
                System.out.println(list.get(i).getAvg() + "\t");
            }
        }
    }

    public int exit(){
        System.out.println("=============================");
        System.out.println("이용해 주셔서 감사합니다.");
        return -1;
    }

}
