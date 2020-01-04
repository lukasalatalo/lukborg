package reaction;
public class DoubleDisplacementReaction extends ChemicalReaction{
	static String e2;
	static int i2;
	static int ch1;
	static int ch2;
	static int ch3;
	static int ch4;
	static int nOA2;
	static String output;
	public DoubleDisplacementReaction(String e1,String e2, String e3,String e4,int c1,int c2,int i1,
			int i2, int i3,int i4,int ch1,int ch2, int ch3, int ch4, int nOA1,int nOA2, int nOA3,int nOA4) {
		super(e1,e3,e4,c1,c2,i1,i3,i4,nOA1,nOA3,nOA4);
		this.e2 = e2;
		this.i2 = i2;
		this.ch1=ch1;
		this.ch2 = ch2;
		this.ch3=ch3;
		this.ch4=ch4;
		this.nOA2 = nOA2;
	}
	public static String getEquation() { //generates the different possible chemical equations
		if (ch1 == 1 && ch1== ch3) {
			output = Integer.toString(c1) + e1 + Integer.toString(nOA1) + e2 + Integer.toString(nOA2) + " + " + Integer.toString(c2) 
			+ e3 + Integer.toString(nOA3) + e4 + Integer.toString(nOA4) + " -> " + e3 + Integer.toString(i2) + e2 + Integer.toString(i3) + " + " + e1 +
			Integer.toString(i4)+ e4 + Integer.toString(i1);
		}
		else if(ch1 == 2 && ch1 == ch3) {
			output = Integer.toString(c1) + e2 + Integer.toString(nOA2) + e1 + Integer.toString(nOA1) + " + " + Integer.toString(c2) 
			+ e4 + Integer.toString(nOA4) + e3 + Integer.toString(nOA3) + " -> " + e2 + Integer.toString(i3) + e3 + Integer.toString(i2) + " + " + e4 +
			Integer.toString(i1)+ e1 + Integer.toString(i4);
		}
		else if(ch1 == 1 && ch1 == ch4) {
			output = Integer.toString(c1) + e1 + Integer.toString(nOA1) + e2 + Integer.toString(nOA2) + " + " + Integer.toString(c2) 
			+ e4 + Integer.toString(nOA4) + e3 + Integer.toString(nOA3) + " -> " + e1 + Integer.toString(i3) + e3 + Integer.toString(i1) + " + " + e4 +
			Integer.toString(i2)+ e2 + Integer.toString(i4);
		}
		else if (ch1 == 2 && ch1 == ch4) {
			output = Integer.toString(c1) + e2 + Integer.toString(nOA2) + e1 + Integer.toString(nOA1) + " + " + Integer.toString(c2) 
			+ e3 + Integer.toString(nOA3) + e4 + Integer.toString(nOA4) + " -> " + e2 + Integer.toString(i4) + e4 + Integer.toString(i2) + " + " + e3 +
			Integer.toString(i1)+ e1 + Integer.toString(i3);
		}
		return output;
	}
	public String getOutput() {
		return output;
	}
	public void setOutput(String output) {
		this.output = output;
	}
	public String getE2() {
		return e2;
	}
	public void setE2(String e2) {
		this.e2 = e2;
	}
	public int getI2() {
		return i2;
	}
	public void setI2(int i2) {
		this.i2 = i2;
	}
	public int getCh1() {
		return ch1;
	}
	public void setCh1(int ch1) {
		this.ch1 = ch1;
	}
	public int getCh2() {
		return ch2;
	}
	public void setCh2(int ch2) {
		this.ch2 = ch2;
	}
	public int getCh3() {
		return ch3;
	}
	public void setCh3(int ch3) {
		this.ch3 = ch3;
	}
	public int getCh4() {
		return ch4;
	}
	public void setCh4(int ch4) {
		this.ch4 = ch4;
	}
	public int getnOA2() {
		return nOA2;
	}
	public void setnOA2(int nOA2) {
		this.nOA2 = nOA2;
	}
	

}
