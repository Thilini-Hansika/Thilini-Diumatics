package lk.diumotics.repository;

import lk.diumotics.bean.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Thilini Hansika on 2/2/2019.
 */
public interface UserRepo extends JpaRepository<User, Long> {

    User findByUsername(String username);
}
