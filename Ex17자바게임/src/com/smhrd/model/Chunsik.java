package com.smhrd.model;

public class Chunsik extends Charac{

	//타입,레벨,체력,경험치,공격력,방어력 초기화
	//레벨,체력,경험치 -> 모든 캐릭터가 초기값이 동일 -> Charac 정의
	//타입(춘식), 공격력(9), 방어력(7)
	public Chunsik() {
		//상위클래스가 가지고 있는 속성 초기화
		//-> 상위클래스의 생성자를 호출
		
		//상위클래스(Charac)생성자를 호출 , 
		//지금 생성되는 춘식이의 객체의 타입, 공격력, 방어력을 초기화할 값을 보내줌!
		super("춘식",9,7);
	}
	
	@Override
	public void printASCII() {
		System.out.println("MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n"
				+ "MMMMMMMMMMMMMMWKkkOOOOkkkkkkkOOOk0NMMMMM\r\n"
				+ "MMMMMMMMMMMMMM0ox0OkkkO0000OkkxkkddXMMMM\r\n"
				+ "MMMMMMMMMMMMNOok0K0000000000000000ddKMMM\r\n"
				+ "MMMMMMMMMMMNxdOKKKKK0KKKK0000000000xo0MM\r\n"
				+ "MMMMMMMNXWWxo0KKKKkddk0K000kx0000000xdKM\r\n"
				+ "MMMMMWOddxOoxK0KKKxcldkkkOOolOK00000OoOM\r\n"
				+ "MMMW0xdxkxclOK0KKKklcokOkkook00000000okM\r\n"
				+ "MMMOlkKxlxdckK0KK0kl:oxdxklck0000000OokM\r\n"
				+ "MMMklk0klxOld0KK00000kl:ldkO00000000doKM\r\n"
				+ "MMMNOkxclOKkldOK0K00K0xdk000000000Odo0MM\r\n"
				+ "MMMMMMW0ocll:;:llodO000O0000000OxolxXMMM\r\n"
				+ "MMMWXKko:;;:::::;;;:ccodddddddddddodXMMM\r\n"
				+ "WKxlc:;::::::::::::::;:oxxxkkOO000OodNMM\r\n"
				+ "Kc,:::::;,,;;:::::::::;cx00kookOOO0dl0MM\r\n"
				+ "Kc,::::;',;;::::::::;;;;lOxcokOOOOOooXMM\r\n"
				+ "WKdlc::,';:;::::;;:;;;:;cxl:xOOkxdod0MMM\r\n"
				+ "MMMWNXK0d:;,,,,,,,,;;;::ldxdxxxxxk0NMMMM\r\n"
				+ "MMMMMMMMMN0OkkkkkO000KXNWMMMMMMMMMMMMMMM\r\n"
				+ "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM");
		
	}

}





