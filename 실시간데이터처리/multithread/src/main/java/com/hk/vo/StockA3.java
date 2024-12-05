package com.hk.vo;

import java.nio.charset.StandardCharsets;
import org.apache.mina.core.buffer.IoBuffer;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class StockA3 {
    private String 시작; // 1Byte
    private String 거래시간; // 6Byte
    private String 거래종류; // 1Byte ( S : 증권)
    private String 데이터구분값; // 2Byte
    private String 정보구분값; // 3Byte
    private String 정보분배일련번호; // 8Byte
    private String 보드ID; // 2Byte
    private String 세션ID; // 2Byte
    private String 종목코드; // 12Byte
    private String 정보분배종목인덱스; // 6Byte : int
    private String 매매처리시각; // 12Byte
    private String 전일대비구분코드; // 1Byte
    private String 전일대비가격; // 11Byte (Double)
    private String 체결가격; // 11Byte (Double)
    private String 거래량; // 10Byte (Long)
    private String 시가; // 11Byte (Double)
    private String 고가; // 11Byte (Double)
    private String 저가; // 11Byte (Double)
    private String 누적거래량; // 12Byte(Long)
    public synchronized StockA3 parseTransaction(IoBuffer buffer) {
        return new StockA3(
                readString(buffer, 0, 6), // 거래시간 시작 위치: 0, 길이: 6
                readString(buffer, 1, 6), // 거래시간 시작 위치: 1, 길이: 6
                readString(buffer, 7, 1), // 거래종류 시작 위치: 7, 길이: 1
                readString(buffer, 8, 2), // 데이터구분값 시작 위치: 8, 길이: 2
                readString(buffer, 10, 3), // 정보구분값 시작 위치: 10, 길이: 3
                readString(buffer, 13, 8), // 정보분배일련번호 시작 위치: 13, 길이: 8
                readString(buffer, 21, 2), // 보드ID 시작 위치: 21, 길이: 2
                readString(buffer, 23, 2), // 세션ID 시작 위치: 23, 길이: 2
                readString(buffer, 32, 12), // 종목코드 시작 위치: 32, 길이: 12
                readString(buffer, 45, 6), // 정보분배종목인덱스 시작 위치: 45, 길이: 6
                readString(buffer, 52, 12), // 매매처리시각 시작 위치: 52, 길이: 12
                readString(buffer, 63, 1), // 전일대비구분코드 시작 위치: 63, 길이: 1
                readString(buffer, 64, 11), // 전일대비가격 시작 위치: 64, 길이: 11
                readString(buffer, 74, 11), // 체결가격 시작 위치: 74, 길이: 11
                readString(buffer, 86, 10), // 거래량 시작 위치: 86, 길이: 10
                readString(buffer, 94, 11), // 시가 시작 위치: 94, 길이: 11
                readString(buffer, 105, 11), // 고가 시작 위치: 105, 길이: 11
                readString(buffer, 116, 11), // 저가 시작 위치: 116, 길이: 11
                readString(buffer, 128, 12) // 누적거래량 시작 위치: 128, 길이: 12
        );
    }
    private String readString(IoBuffer buffer, int startIndex, int length) {
        byte[] bytes = new byte[length];
        buffer.position(startIndex); // 시작 인덱스로 이동
        buffer.get(bytes); // 시작 인덱스부터 바이트를 읽음
        return new String(bytes, StandardCharsets.UTF_8);
    }
}