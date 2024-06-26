package datatypes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//intSample();
		//doubleSample();
		//longSample();
		// booleanSample();
		// compareSample();
		// stringSample();
		// charSample();
		// binHexSample();
		//arraySample();
		// loopSample();
		// arrayListSample();
		//HashSetSample();
		//HashMapSample();
		sortSample();
	}

	private static void sortSample() {
		int[] ar = {2,8,7,13,10,9};
		Arrays.sort(ar);
		for (int i:ar) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		String[] sAr = {"Mary","Erica","Zheng","David","Derek","Jerry"};
		Arrays.sort(sAr);
		for (String s:sAr) {
			System.out.print(s+" ");
		}
		System.out.println();
		
		ArrayList<Integer> iAl=new ArrayList<>();
		iAl.add(11);
		iAl.add(7);
		iAl.add(9);
		iAl.add(3);
		iAl.add(5);
		iAl.sort(null); // null for default ascending order
		for (int i:iAl) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		ArrayList<String> sAl=new ArrayList<>(Arrays.asList(sAr));
		sAl.sort(null);
		for (String s:sAl) {
			System.out.print(s+" ");
		}
		System.out.println();
		
	}

	private static void HashMapSample() {
		// a Map is a group of entries which are key-value map.
		HashMap<String, Integer> ages = new HashMap<>();
		ages.put("Erica", 16);
		ages.put("Mary", 15);
		ages.put("David", 18);
		ages.put("Derek", 20);
		ages.put("Jane", 16);
		ages.put("Jerry", 18);
		ages.put("Tom", 15);
		
		// HashMap.keySet() is to get a set of keys which is a Set type.
		// With an iterable data structure(type), you can use for(type var:data) {...}
		for (String name:ages.keySet()) {
			System.out.println(name+","+ages.get(name));
		}
		System.out.println("=========================");
		for (Entry entry:ages.entrySet()) {
			System.out.println(entry.getKey()+","+entry.getValue());
		}
		System.out.println("=========================");
		
		System.out.println(ages.get("David"));
		System.out.println(ages.get("Erica"));
		System.out.println(ages.get("John"));
		System.out.println(ages.containsKey("John"));
		System.out.println(ages.containsKey("Erica"));
	}

	private static void HashSetSample() {
		/*
		 * most usable methods: size(), add(), remove(), addAll(), 
		 * removeAll(), retainAll()
		 */
		HashSet<Integer> set1 = new HashSet<>();
		HashSet<Integer> set2 = new HashSet<>();
		for (int i=0;i<100;i++) {
			set1.add(i);
		}
		
		for (int i=50;i<150;i++) {
			set2.add(i);
		}
		
		System.out.println("sizes for set1 and set2: "+set1.size()+","+set2.size());
		System.out.println("contains 5:"+set1.contains(5)+","+set2.contains(5));
		HashSet<Integer> set3 = new HashSet<>();
		set3.addAll(set1);
		set3.addAll(set2);
		System.out.println(set3);
		set3.clear();
		set3.addAll(set1);
		set3.removeAll(set2);
		System.out.println(set3);
		set3.clear();
		set3.addAll(set1);
		set3.retainAll(set2);
		System.out.println(set3);
		
	
		HashSet<String> set4 = new HashSet<>();
		
		set4.add("Erica");
		set4.add("Zheng");
		set4.add("Mary");
		System.out.println(set4);
		System.out.println("================");
		for (String v:set4) {
			System.out.print(v+" ");
		}
		System.out.println();
		set4.remove("Zheng");
		System.out.println(set4);
		
	}

	private static void arrayListSample() {
		/*
		 * Most usable methods: add(object), remove(index), remove(object),
		 * 	get(index), size(), contains;
		 */
		ArrayList<Integer> al1 = new ArrayList<>();
		int[] ar1 = new int[4];
		
		System.out.println(ar1.length+","+al1.size());
		System.out.println(ar1[2]);
		
		for (int i=0;i<ar1.length;i++) {
			ar1[i] = i+1;
		}
		
		for (int i=0;i<4;i++) {
			al1.add(i+11);
		}
		System.out.println(ar1.length+","+al1.size());
		System.out.println(ar1[2]+","+al1.get(0));
		
		for (int i=0;i<al1.size();i++) {
			System.out.print(al1.get(i)+" ");
		}
		System.out.println();
		System.out.println("========================");
		for (int i:al1) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		al1.remove(2);
		for (int i=0;i<al1.size();i++) {
			System.out.print(al1.get(i)+" ");
		}
		System.out.println();
		
		ArrayList<String> al2 = new ArrayList<>();
		al2.add("Erica");
		al2.add("Zheng");
		al2.add("David");
		
		System.out.println("Contains 'David':"+al2.contains("David"));
		System.out.println("Contains 'Mary':"+al2.contains("Mary"));
		
		
		for (int i=0;i<al2.size();i++) {
			System.out.print(al2.get(i)+" ");
		}
		System.out.println();
		
		al2.remove(1);
		
		for (int i=0;i<al2.size();i++) {
			System.out.print(al2.get(i)+" ");
		}
		System.out.println();
		
		al2.remove("David");
		for (int i=0;i<al2.size();i++) {
			System.out.print(al2.get(i)+" ");
		}
		System.out.println();
		
	}

	private static void arraySample() {
		int[] ar1 = {1,2,3,4,5};
		System.out.println(ar1[1]+","+ar1[4]);
		ar1[2] = 200;
		ar1[3] = 300;
		for (int i=0;i<ar1.length;i++) {
			System.out.print(ar1[i]+",");
		}
		System.out.println();
		System.out.println("=======================");
		for (int i:ar1) {
			System.out.print(i+",");
		}
		System.out.println();
		
		
		double[] ar2 = new double[4];
		for (int i=0;i<ar2.length;i++) {
			System.out.print(ar2[i]+",");
		}
		System.out.println();
		
		ar2[3] = 5.44;
		for (int i=0;i<ar2.length;i++) {
			System.out.print(ar2[i]+",");
		}
		System.out.println();
		
		char[] ar3=new char[5];
		for (int i=0;i<ar3.length;i++) {
			System.out.print(ar3[i]+",");
		}
		System.out.println();
		
		ar3[3]='A';
		for (int i=0;i<ar3.length;i++) {
			System.out.print(ar3[i]+",");
		}
		System.out.println();
		
	}

	private static void binHexSample() {
		// TODO Auto-generated method stub
		int i1 = 0b100100;
		System.out.println(i1);
		/* hex digits:
		 * 0~9 same decimal;
		 * A->10, ... F ->15
		 * 
		 */
		i1 = 0x3d;
		System.out.println(i1);
		
		i1 = 123;
		int i2 = 400;
		double d1 = 312.321442;
		double d2 = 12.343;
		System.out.printf("%10.2f%10.2f\n", d1,d2);
		
		System.out.printf("%10x %10x\n",i1,i2);
	}

	private static void doubleSample() {
		// TODO Auto-generated method stub
		double d1 = 3.324214;
		double d2 = 33124.134124124;
		
		System.out.println(d1+d2);
		System.out.println(d1-d2);
		
		System.out.println(d1*d2);
		System.out.println(d2/d1);
		
		int i1 = 3;
		int i2 = 13;
		
		d1 = i1;
		System.out.println(i1);
		System.out.println(d1);
		
		d1 = i2/i1;  // implied type cast
		System.out.println(d1);
		
		i1 = (int)d2;  // type casting
		System.out.println(i1);
		
		d1 = 5.3;
		d2 = 2.3;
		
		System.out.println(d1 % d2);
		System.out.println(d1-((int)(d1/d2))*d2);
		
		
		// we should not use == to compare doubles. 
		if (d1 % d2 == 0.7) {
			System.out.println("Same");
		} else {
			System.out.println("Different");
		}
		// we need to use this:
		double eps = 0.00000001;
		if (Math.abs(d1 % d2 - 0.7) < eps) {
			System.out.println("Same");
		} else {
			System.out.println("Different");
		}
				
	}

	private static void charSample() {
		// TODO Auto-generated method stub
		char c1 = 'A';
		char c2 = 'B';
		
		String s="";
		s+=c1; // s=s+c1;
		System.out.println(s);
		s+=c2; // s=s+c2;
		System.out.println(s);
		
		c1 = s.charAt(1);
		System.out.println(c1);
		
		System.out.println(12);
		
		// ASCII code: a character is represented by a byte,
		// so that it is a value between 0~255, inclusively.
		
		c1 = 7;
		c2 = 13;
		
		System.out.println(c1);
		System.out.print("cursor before:");
		System.out.print(c2);
		System.out.println("cursor after:");
		
		//print ascii code of a char
		c1 = 'a';
		c2 = 'A';
		System.out.println((int)c1+","+(int)c2+","+(c1-c2));
		
		//get the 20th capital letter
		c1 = 'A'+20;
		System.out.println(c1);
		
		//get the lower case letter 120 after letter 'c' but wrap up
		// after 'z';
		c1 = (('c'-'a')+120)%26 + 'a';
		System.out.println(c1);
		
		
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
		
		s1 = "abc cde fff ddd";
		String[] splited = s1.split(" ");
		for (int i=0;i<splited.length;i++) {
			System.out.print(splited[i]+",");
		}
		System.out.println();
		
		s1 = "ddd-fff-ggg";
		splited = s1.split("-");
		for (int i=0;i<splited.length;i++) {
			System.out.print(splited[i]+",");
		}
		System.out.println();
		
		s1 = "aaa&&&bbb&&&ccc";
		splited = s1.split("&&&");
		for (int i=0;i<splited.length;i++) {
			System.out.print(splited[i]+",");
		}
		System.out.println();
		
		
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
		
		a = 1020;
		System.out.printf("the number is %d, in hex it is 0x%x\n", a, a);
		a = 0x3fc;
		System.out.printf("the number is %d, in hex it is %x\n", a, a);
		a = 0b101100110;
		System.out.printf("the number is %d, in hex it is %x\n", a, a);
	}

}
