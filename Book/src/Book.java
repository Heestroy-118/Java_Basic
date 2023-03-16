public class Book {
   private String BookName;
   private String author;

   public Book( ){ }

   public Book(String BookName, String author){
      this.BookName=BookName;
      this.author=author;
   } //책 이름과 저자 이름을 매개변수로 받는 생성자

   public String getBookName(){
      return BookName;
   }
   public String getAuthor(){
      return author;
   }
   public void setBookName(String bookName){
      this.BookName=bookName;
   }
   public void setAuthor(String author){
      this.author=author;
   }
   public void showBookInfo(){
      System.out.println(BookName+", "+author);
   }
}
