package lk.diumotics.service;

import lk.diumotics.bean.User;
import org.springframework.stereotype.Service;

/**
 * Created by Thilini Hansika on 2/2/2019.
 */

@Service
public interface UserService {
    public void save(User user);
    public User findByUsername(String username);
}
