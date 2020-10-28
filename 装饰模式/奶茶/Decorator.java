package дл╡Х;

public class Decorator extends MilkTea{
	
	public MilkTea milktea=null;
	public Decorator(MilkTea milktea) {
		this.milktea=milktea;
	}
	
	@Override
	public void makeTea() {
		if(milktea!=null) {
			this.milktea.makeTea();
		}
	}
	
}
