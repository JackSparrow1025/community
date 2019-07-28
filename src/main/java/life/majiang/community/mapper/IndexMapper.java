package life.majiang.community.mapper;


import life.majiang.community.model.Question;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface IndexMapper {

    @Select("select content from question where id=1002")
    String findQues();
    @Insert("insert question(content) values(#{content})")
    void add(Question ques);

    String findQuesById(int id);
}
