public class Lesson13
{
	public String toyName;
	public int toyCount;
	
	public ToyClass(){
		this.toyName = "";
		this.toyCount = 1;
	}
	public ToyClass(String tn, int tc){
		this.toyName = tn;
		this.toyCount = tc;
	}
	public String getName(){
		return toyName;
	}
	public int getCount(){
		return toyCount;
	}
	public void setName(String tn){
		toyName = tn;
	}
	public void setCount(int tc){
		toyCount = tc;
	}
	public abstract String getType(){
		
	}
	public String toString(){
		return "name: " + toyName + "\n" + "count: " + toyCount;
	}
	
}