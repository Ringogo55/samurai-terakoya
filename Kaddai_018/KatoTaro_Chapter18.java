package Kaddai_018;

public class KatoTaro_Chapter18 extends kato_Chapter18 {
	
	public KatoTaro_Chapter18() {
		//性を表す
		familyName = "加藤";
				
		//名前を表す
		setGivenName("太郎です");
				
		//住所を表す
		address = "住所は東京都中野区〇×です";
        
		}
	

	//抽象メソッドに具体的な処理を記述する
	public void eachIntroduce() {
		System.out.println("私はJavaが得意です");
		}
	}
