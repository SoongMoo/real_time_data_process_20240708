package springBootMVCShopping.service.delivery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springBootMVCShopping.domain.DeliveryDTO;
import springBootMVCShopping.repository.DeliveryRepository;

@Service
public class DeliveryInsertService {
	@Autowired
	DeliveryRepository deliveryRepository;
	public void execute(String purchaseNum, String deliveryNum) {
		DeliveryDTO dto= new DeliveryDTO();
		dto.setDeliveryNum(deliveryNum);
		dto.setPurchaseNum(purchaseNum);
		deliveryRepository.deliveryUpdate(dto);	
	}
}
