package kodlama.io.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.hrms.business.abstracts.UsersService;
import kodlama.io.hrms.core.utilities.results.DataResult;
import kodlama.io.hrms.core.utilities.results.Result;
import kodlama.io.hrms.core.utilities.results.SuccessDataResult;
import kodlama.io.hrms.core.utilities.results.SuccessResult;
import kodlama.io.hrms.dataAccess.abstracts.UsersDao;
import kodlama.io.hrms.entities.concretes.Users;

@Service
public class UsersManager implements UsersService{

	private UsersDao usersDao;
	
	@Autowired
	public UsersManager(UsersDao usersDao) {
		super();
		this.usersDao = usersDao;
	}
	
	
	

	@Override
	public Result add(Users users) {
		this.usersDao.save(users);
		return new SuccessResult();
	}

	@Override
	public Result update(Users users) {
		this.usersDao.save(users);
		return new SuccessResult();
	}

	@Override
	public Result delete(Users users) {
		this.usersDao.delete(users);
		return new SuccessResult();
	}

	@Override
	public DataResult<List<Users>> getAll() {
		
		return new SuccessDataResult<List<Users>>(this.usersDao.findAll());
	}

	@Override
	public DataResult<Users> get(int id) {
		
		return new SuccessDataResult<Users>(this.usersDao.findById(id).get());
	}

	@Override
	public DataResult<Users> checkEmail(String email) {
		
		return new SuccessDataResult<Users>(this.usersDao.findByEmail(email));
	}

	

}
