// BookProgram DAO : 쿼리 결과를 '반환'만 하는 클래스.
// staements 인자에는 book이라는 매퍼객체에 키값을 이어준다?

package sample.sprint.yse;

import java.awt.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BookDao {
	@Autowired
	SqlSessionTemplate sqlSessionTemplate;

	public int insert(Map<String, Object> map) {
		return this.sqlSessionTemplate.insert("book.insert",  map);
	}
	
	public Map<String, Object> selectDetail(Map<String, Object> map){
		return this.sqlSessionTemplate.selectOne("book.select_detail", map);
	}
	
	// 책 정보 업데이트 기능 추가
	public int update(Map<String, Object> map) {
		return this.sqlSessionTemplate.update("book.update", map);
	}
	
	public int delete(Map<String, Object> map) {
		return this.sqlSessionTemplate.delete("book.delete", map);
	}
	
	// 책 목록 View 반환 
	public java.util.List<Map<String, Object>>   selectList(Map<String, Object> map){
		return this.sqlSessionTemplate.selectList("book.select_list", map);
	}
	
}
