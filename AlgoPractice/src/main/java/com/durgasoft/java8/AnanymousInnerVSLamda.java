package com.durgasoft.java8;

/*
 *  Ananymous inner class far better than lamda
 *  Lamda is like ananymous method and applicable only for functional interface
 *  A.I.C we can use for any concrete class, abstract calss and functional interface as well
 */
public class AnanymousInnerVSLamda {
	public static void main(String[] args) {

		Interf2 i = new Interf2() {

			@Override
			public void m1() {
				System.out.println("In method m1");
			}

			@Override
			public void m2() {
				System.out.println("In method m2");
			}
		};

		i.m1();
	}
}

/*
 * This interface we can't write with lambd bcoz it's not a FunInterface but we
 * can implement with AIC
 */
interface Interf2 {
	void m1();

	void m2();
}
