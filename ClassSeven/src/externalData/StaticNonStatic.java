package externalData;

public class StaticNonStatic {
	int i=99;
	int g=55;

	public static void main(String[] args) {
	StaticNonStatic x=new StaticNonStatic();
		x.flower();
		x.nonstaticadd();
	//	System.out.println(x.i+x.g);

	}
	public void nonstaticadd() {
		System.out.println(i+g);
	}

	public void flower() {
		System.out.println("I like rose");
		
	}

}
