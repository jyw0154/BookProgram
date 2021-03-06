package sample.sprint.yse;

import java.util.List;
import java.util.Map;

public interface BookService {

	String create(Map<String, Object> map); // 책 데이터 입력 서비스 인터페이스 메소드 시그니처 생성

	Map<String, Object> detail(Map<String, Object> map); // 책 상세 서비스 인터페이스 메소드 시그니처 생성

	boolean edit(Map<String, Object> map);

	boolean remove(Map<String, Object> map);

	List<Map<String, Object>> list(Map<String, Object> map);

}
