package springBootMVCShopping.domain;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Data
@Alias("hospital")
public class HospitalDTO {
	private String addr;
    private String clCd;
    private String clCdNm;
    private int cmdcGdrCnt;
    private int cmdcIntnCnt;
    private int cmdcResdntCnt;
    private int cmdcSdrCnt;
    private int detyGdrCnt;
    private int detyIntnCnt;
    private int detyResdntCnt;
    private int detySdrCnt;
    private int drTotCnt;
    private String emdongNm;
    private long estbDd;
    private String hospUrl;
    private int mdeptGdrCnt;
    private int mdeptIntnCnt;
    private int mdeptResdntCnt;
    private int mdeptSdrCnt;
    private int pnursCnt;
    private String postNo;
    private int sgguCd;
    private String sgguCdNm;
    private int sidoCd;
    private String sidoCdNm;
    private String telno;
    private double xPos;
    private double yPos;
    private String yadmNm;
    private String ykiho;
}
