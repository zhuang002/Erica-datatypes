package datatypes;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//intSample();
		// doubleSample();
		//longSample();
		// booleanSample();
		// compareSample();
		stringSample();
		// charSample();
		// loopSample();
	}

	private static void longSample() {
		// TODO Auto-generated method stub
		
	}

	private static void compareSample() {
		/*
		 * comparison is to compare values and get a boolean result.
		 * The operands can be 2 values of same type, for example:
		 *   int vs int, double vs double, boolean vs boolean, etc.
		 * there are following compare operations:
		 * 	== (equal)
		 *  != (not equal)
		 *  > (greater than)
		 *  < (less than)
		 *  <= (less or equal)
		 *  >= (great or equal)
		 */
		
		System.out.println("Please input integer a,b,c");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		System.out.println("a==b:"+(a==b));
		System.out.println("a>b:"+(a>b));
		System.out.println("a<b:"+(a<b));
		System.out.println("a>=b:"+(a>=b));
		System.out.println("a<=b:"+(a<=b));
		System.out.println("a!=b:"+(a!=b));
		
		boolean b1 = (a>b) && (c>b) || (c-3<a);
		boolean b2 = !(a<=b) || (a>b) && !(c!=a);
		
		System.out.println("(a>b) && (c>b) || (c-3<a) =>"+b1);
		System.out.println("!(a<=b) || (a>b) && !(c!=a) =>"+b2);
		
		if (b1==b2) {
			System.out.println("[(a>b) && (c>b) || (c-3<a)] and "
					+"[!(a<=b) || (a>b) && !(c!=a)] are same.");
		} else {
			System.out.println("[(a>b) && (c>b) || (c-3<a)] and "
					+"[!(a<=b) || (a>b) && !(c!=a)] are different.");
		}
		
		if (b1) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}
		
	}

	private static void booleanSample() {
		/*
		 * boolean type only has 2 values: true, false.
		 * boolean has 3 basic operation: &&(and) || (or) !(not)
		 * for && : only true && true => true, otherwise => false.
		 * for || : only false || false => false, otherwise => true
		 * for !  : !ture => false, !false=> true
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input b1:");
		String s = sc.nextLine();
		boolean b1 = s.equals("true");
		
		System.out.println("Please input b2:");
		s = sc.nextLine();
		boolean b2 = s.equals("true");
		
		System.out.println("b1:"+b1+" b2:"+b2);
		System.out.println("b1 && b2="+(b1 && b2));
		System.out.println("b1 || b2="+(b1 || b2));
		System.out.println("!b1="+!b1);
		System.out.println("!b2="+!b2);
		System.out.println("!(b1 && b2)="+!(b1 && b2));
		System.out.println("!b1 || !b2="+(!b1 || !b2));
		
		sc.close();
		
	}

	private static void stringSample() {
		String s1="I am a ";
		String s2 = "Student";
		String s3 = s1+s2;
		System.out.println(s3);
		
		s1 = "abc";
		s2 = "abc";
		
		System.out.println("s1==s2:" + (s1==s2));
		System.out.println("s1.equals(s2):" + (s1.equals(s2)));
		
		s1 = new String("abc");
		s2 = new String("abc");
		
		System.out.println("s1==s2:" + (s1==s2));
		System.out.println("s1.equals(s2):" + (s1.equals(s2)));
		
		s1 = "afjfdaskl;fkjas;fdsjak;";
		System.out.println("characters in '"+s1+"':"
				+s1.charAt(0)+","+s1.charAt(1)+","
				+s1.charAt(2)+","+s1.charAt(3));
		
		s2 = s1.substring(3,7);
		System.out.println("substring [3:7] is "+s2 );
		
		int index = s1.indexOf("ask");
		System.out.println("index of 'ask' is "+index);
		
		index = s1.indexOf("!!!");
		System.out.println("index of '!!!' is "+index);
		
		System.out.println("index of 'ja' is "+s1.indexOf("ja"));
		System.out.println("last index of 'ja' is "+s1.lastIndexOf("ja"));
		
		
	}

	private static void intSample() {
		int a=1020;
		int b = 3200;
		int c = a+b;
		
		System.out.println("a+b="+c);
		
		c = a-b;
		System.out.println("a-b="+c);
		
		c = a*b;
		System.out.println("a*b="+c);
		
		c = b/a; // since c is an integer, if not divisible,
					// only the integer part returns.
		System.out.println("b/a="+c);
		
		c = b%a;  // c = b mod a ; get remainder
		System.out.println("b%a="+c);
		
	}

}
