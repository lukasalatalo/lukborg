package reaction;
public class ChemicalReaction {
	static int c1;
	static int c2;
	static int nOA1;
	static int nOA3;
	static int nOA4;
	static int i1;
	static int i3;
	static int i4;
	static String e1;
	static String e3;
	static String e4;
	
	
	public ChemicalReaction(String e1,String e3,String e4,int c1,int c2,
			int i1,int i3,int i4, int nOA1,int nOA3,int nOA4) {
		this.c1 = c1;
		this.c2 = c2;
		this.nOA1 = nOA1;
		this.nOA3 = nOA3;
		this.nOA4 = nOA4;
		this.i1 = i1;
		this.i3 = i3;
		this.i4 = i4;
		this.e1 = e1;
		this.e3 = e3;
		this.e4 = e4;
	}


	public int getC1() {
		return c1;
	}


	public void setC1(int c1) {
		this.c1 = c1;
	}


	public int getC2() {
		return c2;
	}


	public void setC2(int c2) {
		this.c2 = c2;
	}


	public int getnOA1() {
		return nOA1;
	}


	public void setnOA1(int nOA1) {
		this.nOA1 = nOA1;
	}


	public int getnOA3() {
		return nOA3;
	}


	public void setnOA3(int nOA3) {
		this.nOA3 = nOA3;
	}


	public int getnOA4() {
		return nOA4;
	}


	public void setnOA4(int nOA4) {
		this.nOA4 = nOA4;
	}


	public int getI1() {
		return i1;
	}


	public void setI1(int i1) {
		this.i1 = i1;
	}


	public int getI3() {
		return i3;
	}


	public void setI3(int i3) {
		this.i3 = i3;
	}


	public int getI4() {
		return i4;
	}


	public void setI4(int i4) {
		this.i4 = i4;
	}


	public String getE1() {
		return e1;
	}


	public void setE1(String e1) {
		this.e1 = e1;
	}


	public String getE3() {
		return e3;
	}


	public void setE3(String e3) {
		this.e3 = e3;
	}


	public String getE4() {
		return e4;
	}


	public void setE4(String e4) {
		this.e4 = e4;
	}
	 
}
