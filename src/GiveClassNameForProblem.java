import java.util.Scanner;

public class GiveClassNameForProblem {

	public static void main(String[] args) {
		System.out.print("Please enter file name :");
		Scanner sc = new Scanner(System.in);
        String name = sc.nextLine(); 
        String array[] = name.split(" ");
        String className = "";
        for(int i = 0; i<array.length; i++){
        	array[i] = array[i].substring(0, 1).toUpperCase() + array[i].substring(1).toLowerCase();
        	className = className+array[i];
        }
        System.out.print(className);
	}

}
