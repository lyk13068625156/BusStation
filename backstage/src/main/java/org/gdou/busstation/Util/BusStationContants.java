package org.gdou.busstation.Util;

public class BusStationContants {

    //性别，1-男，2-女
    public static final Integer SEX_MALE = 1;
    public static final Integer SEX_FEMALE = 2;

    //账号状态，1-启用，2-禁用
    public static final Integer STATUS_ENABLED = 1;
    public static final Integer STATUS_DISABLED = 2;

    //角色，1-管理员，2-普通用户
    public static final Integer TYPE_ADMIN = 1;
    public static final Integer TYPE_NORMAL = 2;

    //  时间
    public static final int TIME_HALF_OF_HOUR = 60 * 60 / 2;
    public static final int TIME_FIVE_MINUTE = 60 * 5;

    //  系统错误码
    public static final int SYS_BAD_REQUEST = 400;
    public static final int SYS_NOT_FOUND = 404;
    public static final int SYS_USER_TYPE_ERROR = 50000;

}
