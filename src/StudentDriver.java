import java.util.Scanner;


public class StudentDriver {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		Heap heap=new Heap();
		int inputs=sc.nextInt();
		int flag=0;
		
		while(inputs-- > 0){
			String choice=sc.next();
			if(choice.equals("ENTER")){
				String name=sc.next();
				float cgpa=sc.nextFloat();
				int token=sc.nextInt();
				Student s=new Student(name,cgpa,token);
				heap.add(s);
			}else /*if(choice.equals("SERVED"))*/{
				if(!heap.isEmpty()){
				heap.remove();
				}
				else{
					flag=1;
					System.out.println("EMPTY");
				}
					
			}
		}
		
		if(flag==0){
			for(Student stud : heap.data){
				System.out.println(stud.name);
			}
		}

	}

}
