package exception5;

public class SearchException extends Exception{
      private String errorCode; // (오류 코드번호)
      
      public SearchException(String message, String errorCode) {
    	  super(message);
    	  this.errorCode=errorCode;
      }
      
          public void keywordMis() {
        	  System.out.println("검색어 잘못 입력");
          }
       
      
      
}
