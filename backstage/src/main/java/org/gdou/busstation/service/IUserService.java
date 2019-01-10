package org.gdou.busstation.service;

import org.gdou.busstation.model.PageModel;


public interface IUserService {

    PageModel getAllUser(Integer pageNumber, Integer pageSize, String searchID, String searchName, String searchStatus);

}
