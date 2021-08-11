package kodlama.io.hrms.business.abstracts;

import java.util.List;

import kodlama.io.hrms.core.utilities.results.DataResult;
import kodlama.io.hrms.core.utilities.results.Result;
import kodlama.io.hrms.entities.concretes.Employers;

public interface EmployersService {

	Result add(Employers employers);
	Result update(Employers employers);
	Result delete(Employers employers);
	
	DataResult<List<Employers>> getAll();
	DataResult<Employers> get(int id);
}
