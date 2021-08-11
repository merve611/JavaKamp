package kodlama.io.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="Employers")

public class Employers {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name="UserId")
	private int id;
	
	@Column(name="companyName")
	private String companyName;
	
	@Column(name="webAddress")
	private String webAddress;
	
	@Column(name="phoneNumber")
	private String phoneNumber;
	
	@Column(name="activited")
	private boolean activited;
	

}
