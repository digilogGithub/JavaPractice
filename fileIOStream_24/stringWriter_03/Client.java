package fileIOStream_24.stringWriter_03;

import java.io.*;
import java.nio.charset.Charset;

class Client {
    public static void main(String[] args) throws IOException {

        BufferedWriter out = new BufferedWriter(new FileWriter("src\\fileIOStream_24\\ioTestFile\\string.txt"));
        out.write("연합뉴스가 지난달 31일 인사위원회를 열어 전임 경영진 때 보도 책임자 4명에게 정직 6개월 등 중징계를 내렸다.");
        out.newLine();
        out.write("연합뉴스는 이날 류현성 전 편집국장 직무대행(현 콘텐츠평가실 콘텐츠평가위원)에게 공정보도 훼손과 회사 명예실추 등을 이유로 감봉을 내렸다. 류 전 대행은 박노황 전 연합뉴스 사장 임기 말 편집국장 대행을 맡았다.");
        out.newLine();
        out.write("황대일 전 편집국 전국사회에디터(DB부 부국장급)는 법인카드 부정사용, 공정보도 훼손, 회사 명예실추 등을 이유로 정직 6개월, 황두형 전 외국어에디터(디지털뉴스부 부국장급)도 같은 사유로 정직 4개월을 받았다.");
        out.newLine();
        out.write("황정욱 전 정치에디터(전국부 부국장대우)는 공정보도 훼손과 회사 명예실추 등으로 정직 3개월 징계를 받았다. 이들 전직 편집국 에디터 3명은 회사의 권고사직에 지난 6월 사직서를 제출하고 회사를 떠난 이창섭 전 편집국장 직무대행 때 불공정 보도책임자로 꼽히는 간부들이다.");
        out.newLine();
        out.newLine();
        out.write("▲ 서울 종로구 수송동에 위치한 연합뉴스 사옥. 사진=이치열 기자");
        out.close();
        System.out.println("기사 입력 완료.");

    }
}



