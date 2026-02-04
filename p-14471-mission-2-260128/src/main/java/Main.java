import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lastId  = 0;

        ArrayList<WiseSaying> wiseSayings = new ArrayList<>();

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
                wiseSayings.add(new WiseSaying(lastId, content, author));
            } else if (command.equals("목록")) {
                System.out.println("번호 / 작가 / 명언");
                System.out.println("----------------------");

                for(int i = wiseSayings.size()-1; i >= 0; i--) {
                    WiseSaying temp = wiseSayings.get(i);
                    System.out.println(temp.id + " / " + temp.author + " / " + temp.content);
                }

            } else if (command.equals("종료")) {
                break;
            }
        }
    }
}
