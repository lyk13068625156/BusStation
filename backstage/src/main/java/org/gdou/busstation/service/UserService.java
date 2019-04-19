package org.gdou.busstation.service;

import org.gdou.busstation.dto.CommonResponseDto;
import org.gdou.busstation.dto.GetUserRequestDto;
import org.gdou.busstation.dto.GetUserResponseDto;
import org.gdou.busstation.dto.UserDetailDto;
import org.gdou.busstation.model.PageModel;
import org.gdou.busstation.model.User;

import java.util.List;


public interface UserService {

    GetUserResponseDto getUser(GetUserRequestDto request);
}
