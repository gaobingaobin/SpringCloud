package service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import service.entity.User;

/**
* @Description:
* @author gaobin
* @createDate 2018/4/5 17:02
*/
@Repository
public interface UserRepository extends JpaRepository<User,Long> {

}
