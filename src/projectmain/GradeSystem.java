package projectmain;

import grade.GradeProcess;

import java.util.Scanner;

public class GradeSystem {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        GradeProcess gradeProcess = new GradeProcess();

        int choice;

        do {
            System.out.println("1.학생 추가");
            System.out.println("2.학생 수정");
            System.out.println("3.학생 제거");
            System.out.println("4.학생 조회");
            System.out.println("0.종료");
            System.out.println("=============================");
            System.out.print("선택하신 번호 : ");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    gradeProcess.insert();
                    break;
                case 2:
                    gradeProcess.update();
                    break;
                case 3:
                    gradeProcess.delete();
                    break;
                case 4:
                    gradeProcess.show();
                    break;
                case 0:
                    choice = gradeProcess.exit();
                    break;
            }
        } while (choice != -1);
    }

}

