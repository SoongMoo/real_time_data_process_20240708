package springBootMVCShopping.sevice.goods;

import java.io.File;
import java.net.URL;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.multipart.MultipartFile;

import jakarta.servlet.http.HttpSession;
import springBootMVCShopping.command.GoodsCommand;
import springBootMVCShopping.domain.AuthInfoDTO;
import springBootMVCShopping.domain.FileDTO;
import springBootMVCShopping.domain.GoodsDTO;
import springBootMVCShopping.mapper.EmployeeMapper;
import springBootMVCShopping.mapper.GoodsMapper;

@Service
public class GoodsUpdateService {
	@Autowired
	EmployeeMapper employeeMapper;
	@Autowired
	GoodsMapper goodsMapper;
	public void execute(GoodsCommand goodsCommand, HttpSession session
			, BindingResult result, Model model) {
		
		GoodsDTO dto = new GoodsDTO();
		/// 일반 정보 
		dto.setGoodsContents(goodsCommand.getGoodsContents());
		dto.setGoodsName(goodsCommand.getGoodsName());
		dto.setGoodsNum(goodsCommand.getGoodsNum());
		dto.setGoodsPrice(goodsCommand.getGoodsPrice());
		// 수정한 직원의 정보를 알기 위해 로그인 정보를 이용해서 직원정보를 가지고왔습니다.
		AuthInfoDTO auth = (AuthInfoDTO) session.getAttribute("auth");
		String empNum = employeeMapper.getEmpNum(auth.getUserId());
		dto.setUpdateEmpNum(empNum);
	
		// 파일시스템에서 삭제
		//1. 디렉터리 정보
		URL resource = getClass().getClassLoader().getResource("static/upload");
		String fileDir = resource.getFile();
		System.out.println(fileDir);
		if(!goodsCommand.getGoodsMainImage().getOriginalFilename().isEmpty()) {
			// 2. 파일객체를 불러오기
			MultipartFile mf = goodsCommand.getGoodsMainImage();
			// 3. 파일이름 가져오기
			String originalFile = mf.getOriginalFilename();
			// 4. 확장자 불리하기
			String extension = originalFile.substring(originalFile.lastIndexOf("."));
			// 5. 새로운 파일명 만들기
			String storeName = UUID.randomUUID().toString().replace("-", "");
			// 6. 새로운 파일명과 확장자 붙이기
			String storeFileName =  storeName + extension;
			// 7. 파일객체 만들기
			File file = new File(fileDir + "/" + storeFileName);
			// 8. 파일 저장
			try {
				mf.transferTo(file);
			}catch (Exception e) {
				e.printStackTrace();
			}
			// 9. dto에 파일이름 저장
			dto.setGoodsMainImage(originalFile);
			dto.setGoodsMainStoreImage(storeFileName);
		}
		if(goodsCommand.getGoodsDetailImage().length > 0) {
			String originalTotal = "";
			String storeTotal = "";
			//1. 디렉터리 정보
			// 2. 파일객체를 불러오기
			for(MultipartFile mf :  goodsCommand.getGoodsDetailImage()) {
			//  3. 파일이름 가져오기 :
				String originalFile = mf.getOriginalFilename();
				// 4. 확장자 불리하기
				String extension = originalFile.substring(originalFile.lastIndexOf("."));
				// 5. 새로운 파일명 만들기
				String storeName = UUID.randomUUID().toString().replace("-", "");
				// 6. 새로운 파일명과 확장자 붙이기
				String storeFileName =  storeName + extension;
				// 7. 파일객체 만들기
				File file = new File(fileDir + "/" + storeFileName);
				// 8. 파일 저장
				try {
					mf.transferTo(file);
				}catch (Exception e) {
					e.printStackTrace();
				}
				originalTotal += originalFile + "/";
				storeTotal += storeFileName + "/";
			}
		}
		
		/////session에 있는 값은 삭제 , 넘어온 파일은 추가
		// session정보를 가져온다.
		List<FileDTO> list = (List<FileDTO>) session.getAttribute("fileList");
		// 파일의 정보를 디비로 부터 가져오기
		GoodsDTO goodsDTO = goodsMapper.selectOne(goodsCommand.getGoodsNum());
		// session에 있는 정보를 디비로부터 제거
		
		
		
		//goodsMapper.goodsUpdate(dto);
	}
}













