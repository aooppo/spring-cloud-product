package cc.voox.product.utils;

import cc.voox.product.vo.ResultVO;

public final class ResultUtils {

    public static final Integer SUCCESS = 200;
    public static final Integer ERROR = 500;



    public static ResultVO success(Object  data) {
        ResultVO rt = new ResultVO();
        rt.setCode(SUCCESS);
        rt.setMsg("Success");
        rt.setData(data);
        return rt;
    }

    public static ResultVO error(Object  data) {
        ResultVO rt = new ResultVO();
        rt.setCode(ERROR);
        rt.setMsg("error");
        rt.setData(data);
        return rt;
    }
}
