package ex04;

public class TemEmplyee extends Employee {



private String empno;
private String name;
private int pay;


public TemEmplyee(String empno, String name, int pay) {
	this.empno = empno;
	this.name = name;
	this.pay = pay;
	
}
public int getMoneyPay() {
	return pay/12;
}

public String print() {
	return empno + " : " + name + " : " + pay;
}




}
