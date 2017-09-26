package com.nirvana.web.common.api;

/**
 * 返回码。
 */
public interface Result {

    Result SUCCESS = new Result() {
        @Override
        public String getCode() {
            return "000000";
        }

        @Override
        public String getDesc() {
            return "成功";
        }
    };

    Result FAILURE = new Result() {
        @Override
        public String getCode() {
            return "999999";
        }

        @Override
        public String getDesc() {
            return "失败";
        }
    };

    String getCode();

    String getDesc();
}
