package org.gdou.busstation.service;

import org.gdou.busstation.dto.*;
import org.gdou.busstation.model.PageModel;
import org.gdou.busstation.model.User;

import java.util.List;


public interface UserService {

    GetUserResponseDto getUser(GetUserRequestDto request);

    CommonResponseDto updateUser(UpdateUserInputDto inputDto);
}
