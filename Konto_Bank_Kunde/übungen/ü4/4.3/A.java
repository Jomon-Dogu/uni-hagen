class A {
	public void foo() {
		System.out.print("A");
	}	

	public static void bar() {
		System.out.print("L");
	}	
	
	public void nix() {
		System.out.print("X");
	}
}

class B extends A {
	public void foo() {
		System.out.print("B");
	}	

	public static void bar() {
		System.out.print("K");
	}	
	
	public void all() {
		super.foo();
	}
}


A a1 = new A();
A a2 = new B();
B b1 = new B();
a1.foo();
a2.bar();
b1.foo();
B.bar();
a2.foo();
b1.all();
a1.nix();
A.bar();
b1.nix();
a1.bar();
b1.bar();