import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Student student1= new Student("Alex Green", new ArrayList<>(List.of(27.00,31.00, 32.00)) );
		Student student2= new Student("Ana Green", new ArrayList<>(List.of(17.00,20.00, 15.00)) );
		System.out.println(student1);
		System.out.println(student2);
		student1.setStatus();
		student2.setStatus();
		System.out.println(student1);
		System.out.println(student2);
		

	}

}
