package com.arc.first.model.exception.business;

import com.arc.first.model.enums.ErrorCode;
import com.arc.first.model.exception.BaseException;

/**
 * 业务异常
 *
 * @author Rubin
 * 2018/10/22 12:22
 */
public class BusinessException extends BaseException {

    private static final long serialVersionUID = -8550033535881260599L;

    public BusinessException(Throwable cause, ErrorCode errorCode) {
        super(cause, errorCode);
    }

    public BusinessException(ErrorCode errorCode) {
        super(errorCode);
    }

    public BusinessException(ErrorCode errorCode, String extErrorMsg) {
        super(errorCode, extErrorMsg);
    }
}
