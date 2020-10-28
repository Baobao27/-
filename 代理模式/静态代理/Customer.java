package ¾²Ì¬´úÀí;

public class Customer {

	public static void main(String[] args) {
		MakeBurg makeburg=new MakeBurg();
		AgencyKFC agencyKFC=new AgencyKFC();
		agencyKFC.addmakeBurg(makeburg);
		
		agencyKFC.prepare();
		agencyKFC.making();
		agencyKFC.packag();
	}

}
