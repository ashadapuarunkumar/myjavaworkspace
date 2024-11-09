
import java.util.ArrayList;

public class ArrayListDemo2 {

	public static void main(String[] args) {

		ArrayList<String> course = new ArrayList<String>();
		course.add("Java");
		course.add("Python");
		course.add("C++");
		course.add("PHP");
		System.out.println(course);

		// Traversing

		System.out.println("Loops for array ...");
		for (int index = 0; index < course.size(); index++) {
			System.out.println(course.get(index));
		}

		System.out.println("Using for each Loop....");
		for (String courses : course) {
			System.out.println(courses);
		}

	}
}