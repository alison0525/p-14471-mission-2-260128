import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lastId  = 0;

        System.out.println("== 명언 앱 ==");

        while (true) {
            System.out.print("명령) ");
            String command = scanner.nextLine();
            if(command.equals("등록")) {
                System.out.print("명언 : ");
                String content = scanner.nextLine();
                System.out.print("작가 : ");
                String author = scanner.nextLine();
                lastId++;
                System.out.println(lastId + "번 명언이 등록되었습니다.");
            }else if (command.equals("종료")) {
                break;
            }
        }
    }
}
