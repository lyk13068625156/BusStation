package org.gdou.busstation.service;

import org.gdou.busstation.model.PageModel;
import org.gdou.busstation.model.User;


public interface IUserService {

    PageModel getAllUser(Integer pageNumber, Integer pageSize, String searchID, String searchName, String searchStatus);
    User findUser(String userID, String password);
}
