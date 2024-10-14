package springBootMVCShopping.sevice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import springBootMVCShopping.command.MemberCommand;
import springBootMVCShopping.mapper.AutoNumMapper;

@Service
public class AutoNumService {
	@Autowired
	AutoNumMapper autoNumMapper;
	public void execute(Model model, String sep, String columnName, Integer len
			,String tableName ) {
		String autoNum = autoNumMapper.AutoNumSelect(sep, columnName, len,tableName);
		MemberCommand memberCommand = new MemberCommand();
		memberCommand.setMemberNum(autoNum);
		model.addAttribute("memberCommand", memberCommand);
	}
}