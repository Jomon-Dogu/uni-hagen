package a;

public class A {

	public int w;
	protected int x;
	int z;
	private int y;
	
}

package a;

class B {

	public int a;
	private int b;
	protected int c;
	int d;
	public b.D e;		// D ist NICHT (!!!!) protected sondern auf: Standardsichtbarkeit und damit nur innerhalb von Paket b sichtbar. Auch wenn D von A erbt und A public ist, ändert das nichts, da Zugriffsmodifikator nicht vererbt wird. Wäre D "protected", wäre es möglich das die Subklasse in dem fall B, auf die Klasse D zugreifen könnte. "
	
	public void nix() {
		b.C cc = null;
	}
}

package b;

public class C {

	public int e;
	protected int f;
	int g;
	private int h;
	
	public int foo(C x, D y) {
		int z = x.h;
		z += y.t;					// nicht möglich weil t private Klassenvariable aus D ist. und somit nur in Klasse verwendet werden darf.
		z += y.s;					// s geht weil protected und y ein Objekt von D ist kann auf s zugegriffen werden.
		z += y.o;
		a.B b = new B();
		return z;
	}
}

package b;

class D extends a.A{

	public int m;
	int w;
	protected int s;
	private int t;
	
	int bar(a.A a, D d) {
		int k = w;				// geht weil w aus A in D überschrieben werden kann
		k += super.w;			// geht auch!!!!!! weil ich einfach nur das NICHT überschriebene w aus A benutzemittels super
		k += x;					// geht auch nimmt das x aus A kein super nötig weil x nicht überschrieben wird, darum kein Nameskonflikt. Direkter zugriff auf PROTECTED(!!!) Variable x möglich weil es nicht wie in der Folgezeile über eine Instanz angefragt wird.
		k += a.x;				// Obj.x geht nicht weil x protected ist und die INSTANZ a (NICHT PAKET a;siehe parameter!!) niht auf protected zugreifen kann.
		k += d.t;
		k += m;
		k += y;
		k += z;
		return k;
	}
	
}