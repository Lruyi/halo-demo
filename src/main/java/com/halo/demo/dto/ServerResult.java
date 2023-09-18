package com.halo.demo.dto;

import com.halo.demo.exception.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.Serializable;

public class ServerResult<T> implements Serializable {
    private static final long serialVersionUID = 1L;
    protected static Logger logger = LoggerFactory.getLogger(ServerResult.class);
    private boolean rlt = true;
    private String message;
    private String code;
    private T data;

    public ServerResult() {
    }

    public static <D> ServerResult<D> build(Command<D> cmd) {
        D data = null;
        ServerResult result = new ServerResult();

        try {
            data = cmd.execute();
            result.setRlt(true);
            result.setMessage("ok");
            result.setCode("000000");
            result.setData(data);
        } catch (ParameterException ex) {
            if (logger.isInfoEnabled()) {
                logger.info("ParameterException:", ex);
            }
            result.setRlt(false);
            result.setCode(ex.getCode());
            result.setMessage(ex.getMessage());
        } catch (ApiClosedException e) {
            logger.info("ApiClosedException:", e);
            result.setRlt(false);
            result.setCode(e.getCode() == null ? ErrorCode.FAILURE.getCode() : e.getCode());
            result.setMessage(e.getMessage());
        } catch (BusinessException e) {
            logger.error("BusinessException:", e);
            result.setRlt(false);
            result.setCode(e.getCode() == null ? ErrorCode.FAILURE.getCode() : e.getCode());
            result.setMessage(e.getMessage());
        } catch (CommonException var4) {
            logger.info("CommonException:", var4);
            result.setRlt(false);
            result.setCode(var4.getCode() == null ? ErrorCode.FAILURE.getCode() : var4.getCode());
            result.setMessage(var4.getMessage());
        } catch (RemoteCallException rcEx) {
            logger.error("RemoteCallException:", rcEx);
            result.setRlt(false);
            result.setCode(ErrorCode.REMOTE_CALL_ERROR.getCode());
            result.setMessage(rcEx.getMessage());
        } catch (IllegalArgumentException e) {
            logger.error("IllegalArgumentException:", e);
            result.setRlt(false);
            result.setCode(ErrorCode.PARAMETER_ERROR.getCode());
            result.setMessage(e.getMessage());
        } catch (Throwable var5) {
            logger.error("Throwable:", var5);
            result.setRlt(false);
            result.setCode(ErrorCode.FAILURE.getCode());
            result.setMessage(ErrorCode.FAILURE.getDesc());
        }

        return result;
    }

    public static <T> ServerResult<T> buildFail(String code, String message) {
        ServerResult<T> serverResult = new ServerResult<>();
        serverResult.setRlt(false);
        serverResult.setCode(code);
        serverResult.setMessage(message);
        return serverResult;
    }

    public boolean isRlt() {
        return this.rlt;
    }

    public void setRlt(boolean rlt) {
        this.rlt = rlt;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public T getData() {
        return this.data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public interface Command<D> {
        D execute();
    }
}
