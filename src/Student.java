
public class Student implements Comparable<Student> {
	
	String name;
	float cgpa;
	int token;
	
	public Student(String name,float cgpa,int token){
		this.name=name;
		this.cgpa=cgpa;
		this.token=token;
	}

	public String getName() {
		return name;
	}

	public float getCgpa() {
		return cgpa;
	}

	public int getToken() {
		return token;
	}

	@Override
	public int compareTo(Student o){
		if(this.cgpa==o.cgpa && this.name.equals(o.name)){
			return o.token-this.token;
		}
		else if(this.cgpa==o.cgpa){
			return o.name.compareTo(this.name);
		}
		else{
			if(this.cgpa-o.cgpa>0)
			return 1;
			else{
				return 0;
			}
		}
	}
	
	@Override
	public String toString(){
		return this.name;
	}
	
}
