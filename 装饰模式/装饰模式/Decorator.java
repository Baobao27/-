package в╟йндёй╫;

public class Decorator extends HamBurg{
	private HamBurg hamburg=null;
	
	public Decorator(HamBurg hamburg) {
		this.hamburg=hamburg;
	}
	
	@Override
	public void makeburg() {
		if(hamburg!=null) {
			this.hamburg.makeburg();
		}
	}

}
