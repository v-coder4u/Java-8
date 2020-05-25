package java_8;

import java.util.function.BiFunction;
import java.util.Arrays;

//1. Method reference to an instance method of an object  object::instanceMethod

/*@FunctionalInterface
interface MyInterface {
	void display();
}

public class MethodReference {
	public void myMethod() {
		System.out.println("Instance Method");
	}

	public static void main(String[] args) {
		MethodReference obj = new MethodReference();
		// Method reference using the object of the class
		MyInterface ref = obj::myMethod;
		// Calling the method of functional interface
		ref.display();
	}
}*/





//2. Method reference to a static method of a class – Class::staticMethod

/*class Multiplication {
	public static int multiply(int a, int b) {
		return a * b;
	}
}

public class MethodReference {
	public static void main(String[] args) {
		BiFunction<Integer, Integer, Integer> product = Multiplication::multiply;
		int pr = product.apply(11, 5);
		System.out.println("Product of given number is: " + pr);
	}
}*/

//Another Exqample :-   Math::max equivalent to Math.max(x,y)

//List<Integer> integers = Arrays.asList(1,12,433,5);
//Optional<Integer> max = integers.stream().reduce( Math::max ); 
//max.ifPresent(value -> System.out.println(value));   ---o/p - 433





// 3. Method reference to an instance method of an arbitrary object of a particular type – Class::instanceMethod

/*public class MethodReference {

	public static void main(String[] args) {
		String[] stringArray = { "Steve", "Rick", "Aditya", "Negan", "Lucy", "Sansa", "Jon" };
		
		 * Method reference to an instance method of an arbitrary object of a
		 * particular type
		 
		Arrays.sort(stringArray, String::compareToIgnoreCase);
		for (String str : stringArray) {
			System.out.println(str);
		}
	}
}*/

//Another Example 3.2 
//In this example, s1.compareTo(s2) is referred as String::compareTo.

//List<String>strings=Arrays.asList("how","to","do","in","java","dot","com");
//List<String>sorted=strings.stream().sorted((s1,s2)->s1.compareTo(s2)).collect(Collectors.toList());
//System.out.println(sorted);
//List<String>sortedAlt=strings.stream().sorted(String::compareTo).collect(Collectors.toList());
//System.out.println(sortedAlt);





//4. Method reference to a constructor – Class::new

// Example 4.1
//The first method can be updated to create a list of integers from 1 to 100. Using lambda expression is rather easy. To create a new instance of ArrayList, we have use ArrayList::new.
//List<Integer>integers=IntStream.range(1,100).boxed().collect(Collectors.toCollection(ArrayList::new));
//Optional<Integer>max=integers.stream().reduce(Math::max);
//max.ifPresent(System.out::println);


//Example 4.2
@FunctionalInterface
interface MyInterface {
	Hello display(String say);
}

class Hello {
	public Hello(String say) {
		System.out.print(say);
	}
}

public class MethodReference {
	public static void main(String[] args) {
		// Method reference to a constructor
		MyInterface ref = Hello::new;
		ref.display("Hello World!");
	}
}