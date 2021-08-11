package kodlama.io.hrms.entities.concretes;

import java.time.LocalDate;


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
@Table(name="Candidates")

@AllArgsConstructor
@NoArgsConstructor

public class Candidates extends Users{

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name="firstName")
	private String firstName;
	

	@Column(name="lastName")
	private String lastName;
	
	@Column(name="nationalityNumber")
	private String nationalityNumber;
	
	@Column(name="yearOfBirth",columnDefinition = "Date default CURRENT_DATE")
	private LocalDate yearOfBirth=LocalDate.now();
	
}
