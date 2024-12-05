package springBootMVCShopping.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import springBootMVCShopping.domain.HospitalDTO;
import springBootMVCShopping.mapper.HospitalMapper;

@Service
public class HospInfoService {
	@Value("ASQ4hK/uk3hrxXxXNPCQUcm4GuhuycmgFp8z6vsuS5cTSOfUUL3N4xgbNIi1wu0Oj7y0HIqys1dDWiP8AO5QcA==")
    private String apiKey;
	@Autowired
	HospitalMapper hospitalMapper;
	@Autowired
	ObjectMapper objectMapper;
	@Autowired
	RestTemplate restTemplate;

    public String execute() {
        String url = "http://apis.data.go.kr/B551182/hospInfoServicev2/getHospBasisList"
                + "?serviceKey=" + apiKey
                + "&pageNo=1"
                + "&numOfRows=50000";
        System.out.println("url : " + url);
        String response  = restTemplate.getForObject(url, String.class);
        try {
			JsonNode jsonNode = objectMapper.readTree(response);
			JsonNode items = jsonNode.path("response").path("body").path("items").path("item");
			//System.out.println(items);
			
			for (JsonNode item : items) {
				//System.out.println(item);
				HospitalDTO hospital = new HospitalDTO();
			    // 주소
			    hospital.setAddr(item.path("addr").asText());

			    // 병원 종류 코드
			    hospital.setClCd(item.path("clCd").asText());
			    
			    // 병원 종류 이름
			    hospital.setClCdNm(item.path("clCdNm").asText());
			    
			    // 일반 의사 수
			    hospital.setCmdcGdrCnt(item.path("cmdcGdrCnt").asInt());
			    
			    // 일반 인턴 수
			    hospital.setCmdcIntnCnt(item.path("cmdcIntnCnt").asInt());
			    
			    // 일반 레지던트 수
			    hospital.setCmdcResdntCnt(item.path("cmdcResdntCnt").asInt());
			    
			    // 일반 외과 의사 수
			    hospital.setCmdcSdrCnt(item.path("cmdcSdrCnt").asInt());
			    
			    // 내과 의사 수
			    hospital.setDetyGdrCnt(item.path("detyGdrCnt").asInt());
			    
			    // 내과 인턴 수
			    hospital.setDetyIntnCnt(item.path("detyIntnCnt").asInt());
			    
			    // 내과 레지던트 수
			    hospital.setDetyResdntCnt(item.path("detyResdntCnt").asInt());
			    
			    // 내과 외과 의사 수
			    hospital.setDetySdrCnt(item.path("detySdrCnt").asInt());
			    
			    // 의사 총 수
			    hospital.setDrTotCnt(item.path("drTotCnt").asInt());
			    
			    // 동/읍/면 명칭
			    hospital.setEmdongNm(item.path("emdongNm").asText());
			    
			    // 병원 설립일
			    hospital.setEstbDd(item.path("estbDd").asLong());
			    
			    // 병원 URL
			    hospital.setHospUrl(item.path("hospUrl").asText());
			    
			    // 전문의 수
			    hospital.setMdeptGdrCnt(item.path("mdeptGdrCnt").asInt());
			    
			    // 전문의 인턴 수
			    hospital.setMdeptIntnCnt(item.path("mdeptIntnCnt").asInt());
			    
			    // 전문의 레지던트 수
			    hospital.setMdeptResdntCnt(item.path("mdeptResdntCnt").asInt());
			    
			    // 전문의 외과 의사 수
			    hospital.setMdeptSdrCnt(item.path("mdeptSdrCnt").asInt());
			    
			    // 간호사 수
			    hospital.setPnursCnt(item.path("pnursCnt").asInt());
			    
			    // 우편번호
			    hospital.setPostNo(item.path("postNo").asText());
			    
			    // 시군구 코드
			    hospital.setSgguCd(item.path("sgguCd").asInt());
			    
			    // 시군구 이름
			    hospital.setSgguCdNm(item.path("sgguCdNm").asText());
			    
			    // 시도 코드
			    hospital.setSidoCd(item.path("sidoCd").asInt());
			    
			    // 시도 이름
			    hospital.setSidoCdNm(item.path("sidoCdNm").asText());
			    
			    // 전화번호
			    hospital.setTelno(item.path("telno").asText());
			    
			    // X 좌표 (경도)
			    hospital.setXPos(item.path("XPos").asDouble());
			    
			    // Y 좌표 (위도)
			    hospital.setYPos(item.path("YPos").asDouble());
			    
			    hospital.setYadmNm(item.path("yadmNm").asText());
			    
			    System.out.println("hospital.getYadmNm() : " + hospital.getYadmNm());
			    // 병원 고유 코드
			    hospital.setYkiho(item.path("ykiho").asText());
			    
			    // 병원 정보 DB에 삽입
			    hospitalMapper.insertHospital(hospital);
			}
			
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
        return response ;
    }
}
