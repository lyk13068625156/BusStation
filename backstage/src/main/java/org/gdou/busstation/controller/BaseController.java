package org.gdou.busstation.controller;

import java.util.HashMap;
import java.util.Map;

public class BaseController {

    public Map ajaxReturn(boolean st, String msg){
        Map map = new HashMap();
        map.put("status", st);
        map.put("message", msg);
        return map;
    }

}
