package com.smhrd.controller;

import com.smhrd.model.Charac;

//게임을 만들기위한 틀 
//1. 게임 내에 구현해야하는 기능 정의 (로직 x)
//2. 기능을 구현할 메서드의 이름 정의
public interface GameInterface {
	
	//추상메서드,상수만 정의가능
	
	public static final int a = 10;
	int b = 10; //자동으로 public static final 키워드가 작성됨
	
	//인터페이스 안에는 접근제한자를 public만 작성 가능
	//메뉴출력, 캐릭터생성, 전투모드, 상대캐릭터생성, 내캐릭터상태확인
	//1. 메뉴출력
	public abstract void printMenu();
	
	//2. 내 캐릭터생성
	//1,2번중에 사용자가 선택 -> 선택한 캐릭터를 생성하여 반환
	//생성될 캐릭터 -> 라이언, 춘식이 
	public abstract Charac myCharac(int select);
	
	//3. 상대방 캐릭터 생성
	//내캐릭터가 무엇인지에따라서 상대방캐릭터는 다른 캐릭터로 정
	//ex) 내캐릭터(춘식) -> 상대캐릭터(라이언)
	public abstract Charac oppCharac(Charac myCharac);
	
	//4. 전투모드
	//내캐릭터가 공격/방어 선택 -> 죽은캐릭터가 있는지 반환 -> 또 공격/방어 결정
	public abstract boolean battle(Charac myC, Charac oppC, int ad);
	
	//인터페이스 안에서 메서드 선언(public abstract 키워드 작성이 기본 -> 안써도 됨)
	//5. 내캐릭터상태확인
	public abstract void checkMyC(Charac myC);
}







