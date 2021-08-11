package kodlama.io.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import kodlama.io.hrms.business.abstracts.EmployersService;
import kodlama.io.hrms.business.abstracts.UsersService;
import kodlama.io.hrms.core.utilities.results.DataResult;
import kodlama.io.hrms.core.utilities.results.Result;
import kodlama.io.hrms.core.utilities.results.SuccessDataResult;
import kodlama.io.hrms.core.utilities.results.SuccessResult;
import kodlama.io.hrms.dataAccess.abstracts.EmployersDao;
import kodlama.io.hrms.entities.concretes.Employers;
import kodlama.io.hrms.entities.concretes.Users;

public class EmployersManager implements EmployersService {

	private EmployersDao employersDao;
	private UsersService userService;
	
	@Autowired
	public EmployersManager(EmployersDao employersDao,UsersService userService) {
		super();
		this.employersDao = employersDao;
		this.userService = userService;
	}
	
	

	@Override
	public Result add(Employers employers) {
		if(this.userService.checkEmail(employers.ge)
		return new SuccessResult();
	}

	@Override
	public Result update(Employers employers) {
		this.employersDao.save(employers);
		return new SuccessResult();
	}

	@Override
	public Result delete(Employers employers) {
		this.employersDao.save(employers);
		return new SuccessResult();
	}

	@Override
	public DataResult<List<Employers>> getAll() {
		 
		return new SuccessDataResult<List<Employers>>(this.employersDao.findAll());
		
	}

	@Override
	public DataResult<Employers> get(int id) {
		return new SuccessDataResult<Employers>( this.employersDao.findById(id).get());
	}

	

}
