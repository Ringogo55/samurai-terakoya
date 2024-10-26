package Kaddai_018;

abstract public class kato_Chapter18 {
	//性を表す
	public String familyName;
	
	//名前を表す
	protected String givenName;
	
	//住所を表す
	public String address;
	
	//givenNameフィールドに値をセット
	
	public void setGivenName(String givenName) {
    this.givenName = givenName;
  }
	//共通の紹介を出力
	public void commonIntroduce() { 
        System.out.println("名前は" + familyName + givenName);
        System.out.println("住所は" + address);     
    }
    
	//各サブクラスで個別に実装
    public abstract void eachIntroduce(); 
    
  //紹介を実行する
    public void execIntroduce() { 
        commonIntroduce(); //共通の紹介
        eachIntroduce();   //個別の紹介
        System.out.println(" ");
    }
}
