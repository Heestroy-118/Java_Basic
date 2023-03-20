import java.util.ArrayList;
public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<Book> library = new ArrayList<Book>(); // Arraylist 선언

        library.add( new Book("태백산맥", "조정래"));
        library.add( new Book("토지", "박경리"));
        library.add( new Book("데미안", "헤르만 헤세"));
        library.add( new Book("어떻게 살 것인가", "유시민"));
        library.add( new Book("어린왕자", "생텍쥐페리")); //add 메서드로 요소값 추가

        for(int i=0; i<library.size(); i++){ //배열에 추가된 요소 개수만큼만 출력하기 위해 size()
            Book book = library.get(i); // 요소를 가져오는 메서드 get()
            book.showBookInfo();
        }
    }
}
