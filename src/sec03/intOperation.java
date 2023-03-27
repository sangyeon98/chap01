package sec03;

public class intOperation {
	
	public static void main(String[] args) {
		//정수에서 int이하 피연산자 간의 연산은 int타입으로 변환되어 연산된다.
		
		byte b = 10;
		short s = 20;
		int add= b + s; // 컴파일 오류(양쪽모두 int 타입으로 바뀌어서 연산, 결과도 int 타입)
		add = (short)(b+s); //(short) 타입으로 변환 했기 떄문에 가능
		System.out.println("add : " + add);
		
		
		//byte type 오버플러
		//byte b1 = 128; // byte type으로 강제 형변환해야(-128)
		//System.out.println("b1 :" +b1);
		
		//코드 타이핑과 동시에 미리 연산을 하여 b2에 저장하려고 한다.
		//변수가 아니라 단순 리터럴 간의 연산이므로 형변환 없다.
		//단지 왼쪽 변수 타입의 범위 내인지 만 체크
		byte b2 = 126 + 1; //byte 타입 범위 : -128~+127이므로 가능
		//b2 = 126 + 2; //[오류] + 128이 되어 오버플로우
		
		//정수 변수 간의 연산은 기본적으로 int타입으로 형변환 된 후에 연산되고 그결과도 int타입
		//int 타입간의 연산으로 결과가 int형으로 byte 변수 b3에 넣을 수 없음
		byte b1 =10;
		byte b3 =(byte) (b1 + 1); // [오류] add cast 해줘야함 (값 손실우려)
		System.out.println(b3);
		
		//int type이 가질수 있는 최대 값 (2147483647)
		int maxVal = Integer.MAX_VALUE;
		System.out.println("Integer.Max_Value : " + maxVal);
		
		//int 오버플로(-2147483648)
		System.out.println(maxVal +1); //쓰레기 값 
		
		int i = 1;
		i = 2147483647 + 1 ; //결과는 2147483648이되어 int 범위를 넘어서지만
		
		//int type 과 long type 연산
		i = 100;
		long longVal = 200;
		long sumVal = i + longVal;
		System.out.println("symVal : "+ sumVal);
		//i = i+longVal; //type cast
		
		//longVal = 21474683648;  // L/1 : int type 읽지 말고 long type으로 읽어줘,
		
		//정시 실수간 연산(float type으로 변환후 연산
		float fVal = 100.2f;  // 100.2f 쓰는 이유는 double로 인식함  그래서 뒤에f써줘야함
		float fSum = longVal + fVal;
		System.out.println("fSum :"+fSum);
		
		//실수간 연산(큰 타입으로 변환된 후에 연산, 결과도 큰타입)
		double dVal = 300.5;
		double dSum = fVal + dVal; //400.6999969482
		// 소수점 1자리 반올림 결과 : 400.7
		System.out.println(String.format("%.1f", dSum)); 
		/////////////////////////////////////////////////
		
		//정수 나눗셈 연산에서 생기기 쉬운 오류
		//정수간 나눗셈의 결과는 정수이다. 소수점 이하는 버려진다.
		int num1 = 9;
		int num2 = 2;
		double num3 = num1 / num2; // num1, num2 모두 int 타입이기 때문에 연산하면 소수점
		System.out.println("num3 : "+num3); //4,0
		
		//한쪽을 형변환하면 다른 쪽도 큰쪽으로 맞춰서 형변환됨
		//후에 연산이 되고 결과도 double타입
		num3 = (double)num1/ num2;  //()는 cast해주는거 int값의 num1을 double로 변환시킨거
		System.out.println(num3); //4,5 
		
		//하지만 이경우는 안됨
		//(num1 / num2)괄호 안에서 이미 결과가 소수점이
		//버려진 상태기 때문에(double)0해봐야 의미 없음.
		
		double num6 = (double)(num1 / num2);
		System.out.println(num6); //4,0소수점이 바뀜
		
		//논리타입
		boolean stop = true;
		boolean start = false;
		if(start)
			System.out.println("중지합니다.");	//중지합니다.
		else 
			System.out.println("시작합니다."); 
	}

}
