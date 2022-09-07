package com.smhrd.model;

public abstract class Charac {
	//추상메서드가 하나라도 있으면 -> 추상클래스
	//추상메서드 없더라도 abstract 작성하면 -> 추상클래스
	//추상클래스로는 객체 생성 불가능
	
	//캐릭터들의 공통 속성
	private String type; //춘식/ 라이언
	private int level;  //레벨
	private int hp; //체력
	private int xp; //경험치
	private int atk; //공격력
	private int def; //방어력
	
	//생성자 : 객체 생성
	//추상클래스 -> 객체 생성불가능
	//추상클래스 내에 생성자 작성은 가능(객체 생성x, 속성 초기화용 사용)
	//레벨, 체력, 경험치 동일한 값을 가지게 초기화
	//타입, 공격력, 방어력 -> 사용자가 정의한 값으로 초기화
	public Charac(String type, int atk, int def) {
		this.type = type;
		//level, hp, xp 모든 캐릭터 동일
		this.level = 1;
		this.hp = 50;
		this.xp = 0;
		this.atk = atk;
		this.def = def;
	}
	//캐릭터들의 공통 기능(메서드)
	//1. 캐릭터 속성(타입, 레벨, 체력...) 확인 / 가지고 올 수 있는 메서드	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public int getXp() {
		return xp;
	}
	public void setXp(int xp) {
		this.xp = xp;
	}
	public int getAtk() {
		return atk;
	}
	public void setAtk(int atk) {
		this.atk = atk;
	}
	public int getDef() {
		return def;
	}
	public void setDef(int def) {
		this.def = def;
	}
	
	//2. 공격
	//누구를 공격하는지 명시, 상대방에게 데미지를 입혀야함
	public void attack(Charac oppC) {
		System.out.println(this.type+"이 " +oppC.getType()+"을 공격!" );
		
		//내공격력이 상대방 방어력보다 낮으면 공격 불가능
		//공격 : 상대방현재체력 - 내 공격력 + 상대방 방어력
		if(this.getAtk() >= oppC.getDef()) {
			oppC.setHp(oppC.getHp() - this.getAtk() + oppC.getDef());
		}
	}
	
	//3. 방어
	//내캐릭터가 방어할때 출력
	public void defence() {
		System.out.println(this.type+"가 방어!");
	}
	
	//4. 스킬사용
	//내공격력에서 +5 만큼 데미지 입히기
	public void skill(Charac oppC) {
		System.out.println(this.type+"이 " +oppC.getType()+"에게 스킬사용!" );
		
		//내공격력이 상대방 방어력보다 낮으면 공격 불가능
		//공격 : 상대방현재체력 - 내 공격력 + 상대방 방어력
		if(this.getAtk() >= oppC.getDef()) {
			oppC.setHp(oppC.getHp() - (this.getAtk()+5) + oppC.getDef());
		}	
	}
	
	//5. 레벨업
	//경험치가 30보다 높아지면 레벨업
	//레벨+1, 경험치-30, 체력(꽉채워줌(50)), 공격력+5, 방어력+5
	public void levelUp() {
		System.out.println("레벨이 올랐습니다!");
		this.setLevel(this.getHp()+1);
		//this.level+=1;
		this.setXp(this.getXp()-30);
		this.setHp(50);
		this.setAtk(this.getAtk()+5);
		this.setDef(this.getDef()+5);
	}
	
	//생성한 캐릭터의 아스키 아트 출력
	//캐릭터마다 출력되는 형태가 다르기때문에
	//상속받은 클래스내에서 재정의
	public abstract void printASCII() ;
}







