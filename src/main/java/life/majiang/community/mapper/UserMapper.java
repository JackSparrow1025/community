package life.majiang.community.mapper;

import life.majiang.community.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface UserMapper {
        @Insert("insert [user](name,account_Id,token,gmt_Create,gmt_Modified) values(#{name},#{account_Id},#{token},#{gmt_Create},#{gmt_Modified})")
        void insert(User user);


    @Select("select top 1 * from [user] where id=#{id}")
    User findById(Integer id);
}
