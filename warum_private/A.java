public class A {
	private int a;
	public int b;
	
	private int g() {
		a++;
		b++;
		return a + b;
	}

	public void h(B obj) {
		obj.c += a;
		obj.d++;
		obj.i();
	}
}

// Kommentare siehe Klassse B!