package ex04;

public class PartTimeEmployee extends Employee {



	//		private String empno; // 사번
		//	private String name; // 이름
	//      private int pay; // 연봉
			private int workDay;
			
			
    public PartTimeEmployee(String empno, String name, int pay, int workDay) {
    	this.empno = empno;
    	this.name = name;
        this.pay = pay;
        this.workDay = workDay;
        
    }
    public int getMoneyPay() {
    	return pay*workDay;
    }
    public String print() {
    	return empno + ":"+name+":"+pay;
    	
    }
}