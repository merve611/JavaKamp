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

@Data		//Bunu lombok sayesinde import ederek getter ve setterları bir daha yazmamıza gerek kalmadı
@Entity		//Entity katmanında olduğunu belirtir.
@Table(name="Users")	//Veri tabanında hangi tabloya karşılık geldiğini gösterir

@AllArgsConstructor
@NoArgsConstructor

public class Users {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name="id")
	private int id;
	
	@Column(name="email")
	private String email;
	
	@Column(name="password")
	private String password;
	
	
	
	
}
