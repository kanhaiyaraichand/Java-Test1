class Holiday{
	private String name;
	private int day;
	private String month;

	public Holiday(String name,int day,String month){
		this.name = name;
		this.day = day;
		this.month = month;
	}

	@Override
	public String toString(){
		return "name : "+this.name+
			"\nday : "+this.day+
			"\nmonth : "+this.month+
			"\n";
	}
}
public class Q4{
	public static void main(String[] args) {
		Holiday h1 = new Holiday("Kanhaiya Kumar",14,"February");
		System.out.print(h1);
	}
}