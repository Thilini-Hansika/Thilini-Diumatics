package lk.diumotics.service;

/**
 * Created by Thilini Hansika on 2/2/2019.
 */
public interface SecurityService {

    public String findLoggedInUsername();
    public void autologin(String username, String password);
}
