package kodlama.io.hrms.business.abstracts;

import kodlama.io.hrms.core.utilities.results.DataResult;

import java.util.List;

import kodlama.io.hrms.core.utilities.results.Result;
import kodlama.io.hrms.entities.concretes.Users;

public interface UsersService {

	Result add(Users users);
	Result update(Users users);
	Result delete(Users users);
	
	
	DataResult<List<Users>> getAll();
	DataResult<Users> get(int id);
	
	
	DataResult<Users> checkEmail(String email);
	
}
