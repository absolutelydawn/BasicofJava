package chap_01;

public class _04_Comment {
    public static void main(String[] args) {
        // System.out.println("(10분 전) 잠시 후 농담곰 시작 예정이오니 착석 부탁드립니다.");
        // System.out.println("(5분 전) 잠시 후 농담곰 시작 예정이오니 착석 부탁드립니다.");
        System.out.println("지금부터 농담곰을 시작하겠습니다.");

        int size = 120;
        size = size+10; // 어린이는 발이 빨리 자라기 때문에 사이즈 10 만큼 더 큰 신발을 구매
        System.out.println("신발 사이즈 " + size + " 으로 보여주세요");

        /* 여러줄 주석
        int a = 10;
        int b = 20;
        System.out.println(a + b);
         */

        System.out.println("ctrl + / = 한 줄 주석");
        System.out.println("drag + ctrl + / = 여러 줄 주석");
        System.out.println("drag + ctrl + shift + / = 여러 줄 주석 /**/");
    }
}
