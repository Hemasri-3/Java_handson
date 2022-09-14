package total;

public class Enc1 {

	private String empName;
	private int empExp;
	private double empSal;
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getEmpExp() {
		return empExp;
	}
	public void setEmpExp(int empExp) {
		this.empExp = empExp;
	}
	public double getEmpSal() {
		if(empExp>10)
		{
			empSal=empSal+(10*empSal/100);
		}
		return empSal;
	}
	public void setEmpSal(double empSal) {
		this.empSal = empSal;
	}
	
	public void m1()
	{
		
		
	}
}
