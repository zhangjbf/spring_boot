package com.javaboy;

import java.util.ArrayList;
import java.util.List;

public class Hello {

	public static void main(String[] args) throws InterruptedException {
//		Integer a = new Integer(3);
//		Integer b = 3; // ��3�Զ�װ���Integer����
//		int c = 3;
//		System.out.println(a == b); // false ��������û������ͬһ����
//		System.out.println(a == c); // true a�Զ������int�����ٺ�c�Ƚ�

//		String s = new String("123");
//		String s1 = new String("123");
//		String b = "123";
//		System.out.println();
//		System.out.println(s==s1.intern());
//		System.out.println(s==s1);
//		System.out.println(s.intern()==b);
//		int i = 0;
//		List<String> list = new ArrayList<>();
//		while (true) {
//			if (i % 1000 == 0) {
//				System.out.println(i);
//			}
//			i++;
//			list.add(String.valueOf(i).intern());
//		}

		String s1 = "Programming";
		String s2 = new String("Programming");
		String s3 = "Program" + "ming";
		System.out.println(s1 == s2);
		System.out.println(s1 == s3);
		System.out.println(s1 == s1.intern());

	}

	private String a;

	private String b;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((a == null) ? 0 : a.hashCode());
		result = prime * result + ((b == null) ? 0 : b.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Hello other = (Hello) obj;
		if (a == null) {
			if (other.a != null)
				return false;
		} else if (!a.equals(other.a))
			return false;
		if (b == null) {
			if (other.b != null)
				return false;
		} else if (!b.equals(other.b))
			return false;
		return true;
	}
}

class Outer {
	 
    static class Inner {}
 
    public static void foo() { new Inner(); }
 
    public void bar() { new Inner(); }
 
    public static void main(String[] args) {
        new Inner();
    }
}

class StaticTesst{
	
	
	
	
}
