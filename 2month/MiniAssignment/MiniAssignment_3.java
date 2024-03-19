/*
   한민혁
   3. 페이지네비게이션의 html코드를 출력하는 페이지네비게이션 구현
*/

public class MiniAssignment_3 {


    public static void main(String[] args) {

        long totalCount = 127;
        long pageIndex = 11;

        Pager pager = new Pager(totalCount);
        System.out.println(pager.html(pageIndex));
    }
}

class Pager {

    long totalCount;
    long pageIndex;

    public Pager() {}
    public Pager(long totalCount) {
        this.totalCount = totalCount;
    }

    public String html(long pageIndex) {
        StringBuilder sb = new StringBuilder();

        long num1 = 0;
        if (totalCount%10 != 0) {
            num1 = totalCount/10 + 1;
        } else {
            num1 = totalCount/10;
        }

        if (pageIndex < 1 || pageIndex > num1) {
            return "페이지가 없습니다.";
        }

        long num2 = 0;
        if (pageIndex%10 != 0) {
            num2 = pageIndex/10;
        } else {
            num2 = pageIndex/10 - 1;
        }

        long num3 = (10 * num2) + 1;

        sb.append("<a href='#'>[처음]</a>\n");
        sb.append("<a href='#'>[이전]</a>\n\n");

        for (long i = num3; i < num3+10; i++) {
            if (i == num1 + 1) {
                break;
            }

            if (i == pageIndex) {
                sb.append("<a href='#' class='on'>" + i + "</a>\n");
            } else {
                sb.append("<a href='#'>" + i + "</a>\n");
            }
        }
        sb.append("\n");
        sb.append("<a href='#'>[다음]</a>\n");
        sb.append("<a href='#'>[마지막]</a>");

        return sb.toString();
    }
}
