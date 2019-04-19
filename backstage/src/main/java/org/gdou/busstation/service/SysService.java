package org.gdou.busstation.service;

import org.gdou.busstation.dto.*;

import javax.servlet.http.HttpServletResponse;

public interface SysService {

    public CommonResponseDto register(RegisterInputDto request);

    public CommonResponseDto login(LoginInputDto request);

    public CommonResponseDto reset(ResetRequestDto request);
}
