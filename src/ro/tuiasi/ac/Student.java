package ro.tuiasi.ac;

public class Student {
	private int id;
	private String first_name;
	private String last_name; // family name
	
	Student(int id, String first_name, String last_name){
		this.id = id;
		this.first_name = first_name;
		this.last_name = last_name;
	}
	
	@Override
	public String toString() {
		
		return id+"\t"+last_name +"\t" +first_name;
	}
	void print(){
		int x = 100;
	}
	
	void print2(){
		int x = 100;
	}
}
