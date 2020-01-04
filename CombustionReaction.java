package reaction;
public class CombustionReaction extends ChemicalReaction {

	public CombustionReaction(String e1,String e3,String e4,int c1,int c2,int i1,int i3,int i4, int nOA1,int nOA3,int nOA4) {
		super(e1,e3,e4,c1,c2,i1,i3,i4,nOA1,nOA3,nOA4);
	}
	public static String getEquation() { //generates the chemical equation qiven the variebles of the constructor
		return Integer.toString(c1) + e1 + " + " + Integer.toString(c2) + e3 + Integer.toString(nOA3) + e4 + Integer.toString(nOA4) + " -> H2O + CO2";
	}
}


