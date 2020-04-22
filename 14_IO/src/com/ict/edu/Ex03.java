package com.ict.edu;

public class Ex03 {
	// Stream(스트림) :
	//  - 데이터를 목적지까지 입력, 출력하기 위한  방법
	//  - 스트림에 데이터를 쓰는 경우 => output stream(출력 스트림)
	//  - 스트림에 데이터를 읽는 경우 => input stream(입력 스트림)
	
	// 스트림의 종류 : 바이트 스트림, 문자스트림, 바이트스트림-문자스트림 결합, 오브젝트 스트림
	// 1. 바이트 스트림 (기계중심) : 모든 처리를 1byte 씩 처리
	//    바이트 스트림 대상  : byte로 이루어진 모든 파일 (영상, 소리, 사진 등 모든 파일 가능)
	//    최상위 클래스 : InputStream(입력스트림), OutputStream(출력스트림)
	
	// 2. 문자 스트림 (사람중심) : 모든 처리를 2byte씩 처리 
	//   문자 스트림의 대상 : 세계 모든 언어로 구성된 문서 파일을 입출력할 때 적합
	//   최상위 클래스 : Reader(입력스트림), Writer(출력스트림)
	
	// 3. 바이트-문자 스트림 결합 : 기계를 통해 입/출력한 정보를 사람이 알아볼 수 있도록 입/출력
	//   해당 클래스 : InputStreamReader (입력스트림), OutputStreamWriter(출력스트림)
	
	// 4. 오브젝트 스트림 : 객체 직렬화 한 후 객체 단위로 입/출력함
	//   해당 클래스 : ObjectInputStream(readObject() : 객체 역직렬화))
	//             ObjectOutputStream(writeObject() : 객체 직렬화 );
	
	
}
