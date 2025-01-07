public class B {
	private int c;  // Kann nicht von Klasse A eingesehen werden weil c ein private davor hat.
	public int d;
	
	public int i() {
		c++;
		d++;
		return d + c;
	}

	private void k(A obj) {
		obj.a += c;     // Kann nicht aus Klasse A übernommen werden, weil in Klasse A die Variable a "private" ist.
		obj.b = obj.g();    // Die Methode "g" aus Klassse A ist auch private und knn hier nicht eingelesen werden.
	}
}