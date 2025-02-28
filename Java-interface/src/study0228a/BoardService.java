package study0228a;

public class BoardService extends DBConnect implements CRUD{

	@Override
	public boolean save() {
		
		System.out.println("게시판 글 저장 완료");
		return false;
	}

	@Override
	public CRUD select() {
		
		System.out.println("게시글 조회 완료");
		return null;
	}

	@Override
	public CRUD update() {
		
		System.out.println("게시글 수정 완료");
		return null;
	}

	@Override
	public boolean delete() {
		
		System.out.println("게시글 삭제 완료");
		return false;
	}
	
	

}
