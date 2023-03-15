package Project1.HibernateProject1;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Check;
import org.hibernate.annotations.ColumnDefault;
@Entity
@Table(name="Friends_detail")
public class Friends {
	@Id
	@GeneratedValue
	@Column(name="ID")
	private int id;
	
	
	@Column(name="GEN")
	private String Gender;
	
	
	@Column(name="F_NAME")
	private String name;
	
	
	@ColumnDefault("pune")
	private  String Address;
	
	@Column(name="STD")
	private String Std;
	
	
	@Column(name="MB" , nullable=false)
	private  int mb;
	
	
	private int Age;

	public Friends(int id, String gender, String name, String address, String std, int mb,int Age) {
		super();
		this.id = id;
		Gender = gender;
		this.name = name;
		Address = address;
		Std = std;
		this.mb = mb;
		
		this.Age=Age;
	}

	public Friends() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getGender() {
		return Gender;
	}

	public void setGender(String gender) {
		Gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public String getStd() {
		return Std;
	}

	public void setStd(String std) {
		Std = std;
	}

	public int getMb() {
		return mb;
	}

	public void setMb(int mb) {
		this.mb = mb;
	}
	
	public int getAge() {
		return Age;
	}
	public void setAge(int Age) {
		this.Age=Age;
	}
	
}
