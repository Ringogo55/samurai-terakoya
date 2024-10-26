package Kaddai_015;

public class Car_Chapter15 {
	
	//フィールド（内部データ）
	private int gear = 1;	//1-5速を表す
	private int speed = 10;		//ギアチェンジ後の速度を表す
	
	//メソッド
	public void gearChange( int afterGear) {
		this.gear = afterGear;
		switch( this.gear ) {
		case 1 -> this.speed = 10 ;
		case 2 -> this.speed = 20 ;
		case 3 -> this.speed = 30 ;
		case 4 -> this.speed = 40 ;
		case 5 -> this.speed = 50 ;
		default -> this.speed = 10 ;		
		}
	}
	
	//ギアチェンジ後の速度を表示する
	public void run() {
		System.out.println("ギヤ1から" + this.gear + "に切り替わりました");
		System.out.println("速度は時速" + this.speed + "kmです");
	}
	

}
