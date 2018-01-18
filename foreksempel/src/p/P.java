package p;

public class P {
   P p;
   P g() {
      return p;
   }
   void z(P p) {
      if (p == this.p) {
         return;
      }
      P oldP = this.p;
      this.p = p;
      if (oldP != null && oldP.g() == this) {
         oldP.z(null);
      }
      if (this.p != null) {
         this.p.z(this);
      }
   }
   
   public static void main(String[] args) {
	   P p1 = new P();
	   P p2 = new P();
	   p1.z(p2);

	   P p3 = new P();
	   P p4 = new P();
	   p3.z(p4);

	   p1.z(p4);
   }
}
