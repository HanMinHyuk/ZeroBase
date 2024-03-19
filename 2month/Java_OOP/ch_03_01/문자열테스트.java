package ch_03_01;

public class 문자열테스트 {

    public static void p(Object obj) {
        System.out.println(obj);
    }

    public static void main(String[] args) {

        String url = "https://FastCampus.co.kr/";

        final String FS = "https://fastcampus.co.kr/";

        // length()
        int length = url.length();
        p("문자열길이: " + length);

        p("------------------------");
        // charAt()
        for (int i = 0; i < url.length(); i++) {
            p(url.charAt(i));
        }

        p("------------------------");
        // toCharArray()
        for (char c1 : url.toCharArray()) {
            p(c1);
        }

        p("------------------------");
        // contains(), indexOf(), lastIndexOf()
        p(url.contains("fastcampus"));
        p(url.indexOf(".")); // 앞에서부터 찾음
        p(url.lastIndexOf(".")); // 뒤에서부터 찾음

        p("------------------------");
        // toLowerCase(), toUpperCase(), trim()
        p("[" + url + "]");
        p("[" + url.trim() + "]"); // 앞 뒤 공백 제거
        p(url.toUpperCase()); // 소문자 -> 대문자로
        p(url.toLowerCase()); // 대문자 -> 소문자로

        p("------------------------");
        // equals(), equalsIgnoreCase()
        p(url.equals(FS));
        p(url.equalsIgnoreCase(FS)); // 대소문자 구분 없이 비교

        p("------------------------");
        String url2 = "http://www.naver.com/news/tv/sbs";
        // news,   tv,     sbs
        // 분류,   매채,    방송국
        // new,   radio,   kbs

        // replace(), replaceAll(), split()
        p(url2);
        p(url2.replace("http://www.naver.com/", ""));
        p("------------------------");
        String[] url2list = url2.replace("http://www.naver.com/", "").split("/");
        p("분류: " + url2list[0]);
        p("매체: " + url2list[1]);
        p("방송국: " + url2list[2]);

        p("------------------------");
        // concat()
        p(url2.concat("/index.html")); // 문자열 덧붙여 주는 것
        p(url2 + "/index.html");
        // mariadb, mysql 문자열 조합일 때, concat('a', 'b', 'c')
        // Oracle -> 'a' || 'b' || 'c'
        // MSSQL -> 'a' + 'b' + 'c'

        p("------------------------");
        // substring()
        p(url);
        p(url.substring(8));
        p(url.substring(8, 18));

        p("------------------------");
        // valueOf()
        String v1 = "12";
        String v2 = String.valueOf(12);
        String v3 = 12 + "";





    }
}
