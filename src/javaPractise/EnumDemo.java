package javaPractise;

enum Dept{
//	CS,IT,CIVIL,ECE;
	CS("jeevan","Block B"),IT("Abhi","Block A"),CIVIL("Aki","Block C"),ECE("Muna","Block D");
	String head;
	String location;
	private Dept(String head,String loc) {
		this.head = head;
		this.location = loc;
	}
	public void display() {
		System.out.println(this.name()+" "+this.ordinal());
	}
	public String getheadName() {
		return head;
	}
	public String getLocation() {
		return location;
	}
}

public class EnumDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dept d = Dept.ECE;
		d.display();
		System.out.println(d.getheadName());
		System.out.println(d.getLocation());
//		System.out.println(d.ordinal());
//		System.out.println(d.name());
//		System.out.println(d.valueOf("IT"));
//		Dept list[] = Dept.values();
//		for(Dept x:list)
//			System.out.println(x);
//		
//		switch(d) {
//		case CS: System.out.println("Head: john \nBlock: A");
//		break;
//		case IT: System.out.println("Head: Smith \nBlock: B");
//		break;
//		case CIVIL: System.out.println("Head: Srinivas \nBlock: C");
//		break;
//		case ECE: System.out.println("Head: Dave \nBlock: D");
//		break;
//		}

	}

}
