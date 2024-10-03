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

        double d = 3.141234556546;
        float f = 3.1400003423F; // 실수는 float으로 받으려면 F또는 f ex. 3.14F / 3.14f
        System.out.println(d);
        System.out.println(f);

        long l = 1000000000000l; // int 범위(약) : -21억 ~ +21억 >> 범위 벗어날때는 long
        l = 1_000_000_000_000L;
        System.out.println(l);
    }
}
