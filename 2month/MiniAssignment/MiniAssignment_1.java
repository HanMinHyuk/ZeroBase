/*
   한민혁
   1. html 파일을 직접 작성해 보는 예제
*/


import java.util.*;
import java.io.*;

public class MiniAssignment_1 {
    public static void main(String[] args) {
        try {
            File file = new File("property.html"); // File(String pathname) : pathname에 해당되는 파일의 File 객체를 생성한다.
            BufferedWriter writer = new BufferedWriter(new FileWriter(file)); // html 파일에 글을 작성하는 writer 변수 지정

//             <head> 생성
            writer.write("<head>\r\n");
            writer.write("\t <meta charset=\\\"UTF-8\\\">\r\n");
            writer.write("\t <style>\r\n");
            writer.write("\t\t table {border-collapse: collapse; width: 100%;}\r\n");
            writer.write("\t\t th, td {border:solid 1px #000;}\r\n");
            writer.write("\t\t h1 {font-weight: bolder; padding-top: 10px;}\r\n");
            writer.write("\t </style>\r\n");
            writer.write("</head>\r\n");

//             <body> 생성 (테이블 생성)
            writer.write("<body>\r\n");
            writer.write("\t <h1>자바 환경정보</h1>\r\n");
            writer.write("\t <table>\r\n");
            // 테이블의 헤드
            writer.write("\t\t <tr>\r\n");
            writer.write("\t\t\t <th scope=\\\"col\\\">키</th>\r\n");
            writer.write("\t\t\t <th scope=\\\"col\\\"></th>\r\n");
            writer.write("\t\t </tr>\r\n");
            // 테이블의 key와 value
            for (Object k : System.getProperties().keySet()) {
                String key = k.toString();
                String value = System.getProperty(key);

                writer.write("\t\t <tr>\r\n");
                writer.write("\t\t\t <td>" + key + "</td>\r\n");
                writer.write("\t\t\t <td>" + value + "</td>\r\n");
                writer.write("\t\t </tr>\r\n");
            }
            writer.write("\t </table>\r\n");
            writer.write("</body>");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
