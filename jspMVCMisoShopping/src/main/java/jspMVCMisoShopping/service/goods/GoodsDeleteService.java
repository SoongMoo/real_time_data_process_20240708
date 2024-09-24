package jspMVCMisoShopping.service.goods;

import java.io.File;

import javax.servlet.http.HttpServletRequest;

import jspMVCMisoShopping.model.dao.GoodsDAO;
import jspMVCMisoShopping.model.dto.GoodsDTO;

public class GoodsDeleteService {
	public void execute(HttpServletRequest request) {
		String goodsNum = request.getParameter("goodsNum");
		GoodsDAO dao = new GoodsDAO();
		GoodsDTO dto = dao.goodsSelectOne(goodsNum);
		int i = dao.goodsDelete(goodsNum);
		if(i > 0) {
			String realPath 
				= request.getServletContext().getRealPath("/goods/upload");
			String mainImage = dto.getGoodsMainStoreImage();
			File file = new File(realPath + "/" + mainImage);
			if(file.exists()) file.delete();
			
			String images[] = dto.getGoodsDetailStoreImage().split("`");
			for(String image : images) {
				file = new File(realPath + "/" + image);
				if(file.exists()) file.delete();
			}
		}
	}
}