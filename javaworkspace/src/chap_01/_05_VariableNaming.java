package chap_01;

public class _05_VariableNaming {
    public static void main(String[] args) {
        // 변수 이름 짓는 법
        // 1. 저장할 값에 어울리는 이름
        // 2. 밑줄(_), 문자(abc), 숫자(123) 사용 가능(공백 사용 불가)
        // 3. 한 단어 또는 2개 이상 단어의 연속
        // 4. 소문자로 시작, 각 단어의 시작 글자는 대문자(첫 단어는 제외)
        // 6. 예약어 사용 불가(public, static, void, int, double, float, ...)

        // 입국 신고서(여행)
        String nationality = "대한민국";
        String firstName = "다은";
        String lastName = "장";
        String dateOfBirth = "2024-10-04";
        String residentialAddress = "Hotel";
        String purposeOfVisit = "travel";
        String flightNo = "KE234";
        String _flightNo_ = "KE234";
        String flight_no_2 = "KE234";
//        String -flightNo = "KE234"; 안되는 예제

        int accompany = 2;
        int lengthOfStay = 5;

        String item1 = "watch";
        String item2 = "bag";
//        String 3item = "pouch"; 안되는 예제

        // 프로그램의 흐름을 위해 사용되는 경우 등(크게 이름이 중요하지 않을 때)
        int i = 0;
        String s = "";
        String str = "";

        // 상수(한 번 정의 후 변하지 않음), 대문자로 표기, 앞에 final 예약어 적어주기
        final String CODE = "KR";
    }
}
