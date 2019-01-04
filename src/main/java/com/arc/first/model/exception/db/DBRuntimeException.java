package com.arc.first.model.exception.db;

import com.arc.first.model.enums.ErrorCode;
import com.arc.first.model.exception.BaseRuntimeException;

/**
 * DB运行时异常
 *
 * @author Rubin
 * 2018/10/22 11:52
 */
public class DBRuntimeException extends BaseRuntimeException {

    private static final long serialVersionUID = 1L;

    public DBRuntimeException(Throwable cause, ErrorCode errorCode) {
        super(cause, errorCode);
    }

    public DBRuntimeException(Throwable cause, ErrorCode errorCode, String extErrorMsg) {
        super(cause, errorCode, extErrorMsg);
    }

    public DBRuntimeException(ErrorCode errorCode) {
        super(errorCode);
    }

    public DBRuntimeException(ErrorCode errorCode, String extErrorMsg) {
        super(errorCode, extErrorMsg);
    }
}
