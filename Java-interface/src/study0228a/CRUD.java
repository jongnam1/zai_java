package study0228a;

public interface CRUD {

	public boolean save();  //DB저장용
	public CRUD select();   //DB 조회용
	public CRUD update();   //DB 수정
	public boolean delete();  //DB 삭제용
}


interface aa{ // 함수형 인터페이스
	public void bb();
}

/*
   => 화살

*/