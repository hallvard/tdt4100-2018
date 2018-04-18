package of14;

public class Partner {

	public String name ; 
	
	private Partner partner;
	
	public Partner(String name) {
		this.name = name;
		
	}
	
	@Override
	public String toString() {
		return String.format("[Partner %s is partner with %s]", name, (partner != null ? partner.name : null)) ;
	}
	
	public String getName() {
		return name;
	}
	
	public Partner getPartner() {
		return partner;
	}
	
	public static void savePartner(Partner p) {
		//Lagre partner til en fil
	}
	
	public void setPartner(Partner partner) {
		if (partner == this.partner) {
			return;
		}
		Partner oldPartner = this.partner;
		this.partner = partner;
		if (oldPartner != null && oldPartner.getPartner() == this) {
			oldPartner.setPartner(null);
		}
		if (this.partner != null) {
			this.partner.setPartner(this);
		}
	}
	

}
