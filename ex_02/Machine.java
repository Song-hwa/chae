package ex_02;

public class Machine {

	//어떤 인형을 추가하여 뽑을 건지 기계설정
//	public void run(Pika p) {
//	  p.pika();
	

	//method overriding으로 새로운 인형을 봅을 수 있는
	//run()기능 생성하기!
//	public void run(Pairi p) {
//		p.pairi();
		
	
//	public void run(Kkobuk k) {
//		k.kkobuk();
	

//어느 인형이 들어오더라도 뽑기가 가능하도록 만들기>다형성
public void run(Doll d) {
d.doll();
}
}