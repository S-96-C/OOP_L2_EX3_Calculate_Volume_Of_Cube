import java.util.Scanner;
// import.java.util.* 

/*
//Method_1
public class Main{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);		
		System.out.println("Length is : ");
		double len = sc.nextDouble();
		
		System.out.println("Width is : ");
		double wid = sc.nextDouble();
		
		System.out.println("Height is : ");
		double hei = sc.nextDouble();
		
		double volumeOfCube = (len * wid * hei);
		
		System.out.println("Volume of Cube is : " +volumeOfCube);
	}
}
*/

//Method_2
public class Main{
	public static void main(String args[]){
		
		int length, width, height, volumeOfCube;
		
		Scanner sc = new Scanner(System.in);	
		
		System.out.println("Length is : ");
		length = sc.nextInt();
		
		System.out.println("Width is : ");
		width = sc.nextInt();
		
		System.out.println("Height is : ");
		height = sc.nextInt();
		
		volumeOfCube = length * width * height;
		
		System.out.println("Volume of Cube is : " +volumeOfCube);
	}
}
