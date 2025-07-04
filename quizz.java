import java.util.*;
public class quizz
{
   static int a=0;
	public static void main(String[] args) {
		
		quizz ab=new quizz();
		ab.q1();
		ab.q2();
		ab.q3();
		ab.q4();
		ab.q5();
		System.out.println("the score scored is out of  5/"+a);
	}
	 int q1() {
		System.out.println("Extension for the bytecode file in java");
		System.out.println("1:.java");
		System.out.println("2:.javac");
		System.out.println("3:.byte");
		System.out.println("4:.class");
		Scanner sc=new Scanner(System.in);
		int b=sc.nextInt();
		if(b==4){
		    return a += 1;
		}
		else{
		    return 0;
		}
	 }
		 int q2() {
		System.out.println("which is a reserved keyuword in java");
		System.out.println("1:void");
		System.out.println("2:public");
		System.out.println("3:main");
		System.out.println("4:.System");
		Scanner sc=new Scanner(System.in);
		int c=sc.nextInt();
		if(c==3){
		    return a+=1;
		}
		else{
		    return 0;
		}
	}
	int q3() {
		System.out.println("which is not a access specifier");
		System.out.println("1:private");
		System.out.println("2:Integer");
		System.out.println("3:public");
		System.out.println("4:protected");
		Scanner sc=new Scanner(System.in);
		int d=sc.nextInt();
		if(d==2){
		    return a += 1;
		}
		else{
		    return 0;
		}
	 }
	 int q4() {
		System.out.println("how to inherit the class");
		System.out.println("1:extends");
		System.out.println("2:implements");
		System.out.println("3:inherit");
		System.out.println("4:interface");
		Scanner sc=new Scanner(System.in);
		int e=sc.nextInt();
		if(e==1){
		    return a += 1;
		}
		else{
		    return 0;
		}
	 }
	 int q5() {
		System.out.println("which is runtime polymorpism");
		System.out.println("1:overloading");
		System.out.println("2:inheritance");
		System.out.println("3:overriding");
		System.out.println("4:all the above");
		Scanner sc=new Scanner(System.in);
		int f=sc.nextInt();
		if(f==3){
		    return a += 1;
		}
		else{
		    return 0;
		}
	 }
}
