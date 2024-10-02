package chap_01;

public class _03_Variables {
    public static void main(String[] args) {
        String name; // 문자열변수 선언
        name = "dawn"; // 변수에 값 대입
        // String name = "dawn";

        int hour = 15;

        System.out.println(name + "님 배송이 시작됩니다. " + hour + "시에 방문 예정입니다.");
        System.out.println(name + "님, 배송이 완료되었습니다.");

        double score = 90.5;
        char grade = 'A'; // char 는 ''안에 적어준다
        name = "서태웅";
        System.out.println(name + " 님의 평균 점수는 " + score + "점 입니다.");
        System.out.println("학점은 " + grade + " 입니다.");

        boolean pass =true;
        System.out.println("이번 시험에 합격했을까요? " + pass);
    }
}
