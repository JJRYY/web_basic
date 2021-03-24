package web_basic.jsp_07;

public class JoinBean {
	private String id;
	private String pass;
	private String name;
	private int sex;
	private int age;
	private String email;

	public JoinBean() {
		// TODO Auto-generated constructor stub
	}

	public JoinBean(String id, String pass, String name, int sex, int age, String email) {
		super();
		this.id = id;
		this.pass = pass;
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.email = email;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSex() {
		return sex;
	}

	public void setSex(int sex) {
		this.sex = sex;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "JoinBean [id=" + id + ", pass=" + pass + ", name=" + name + ", sex=" + sex + ", age=" + age + ", email="
				+ email + "]";
	}

}
