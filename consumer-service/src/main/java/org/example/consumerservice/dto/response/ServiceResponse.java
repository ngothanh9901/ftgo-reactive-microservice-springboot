package org.example.consumerservice.dto.response;

import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ServiceResponse<T> {

    private String code;

    @Builder.Default
    private List<String> message = new ArrayList<>();

    private T data;

    public ServiceResponse<T> message(String msg) {
        message.add(msg);
        return this;
    }
    public ServiceResponse<T> message(List<String> msg) {
        message.addAll(msg);
        return this;
    }

    public static <T> ServiceResponse<T> success(T data) {
        ServiceResponse<T> res = ServiceResponse.<T>builder().code(ResponseConst.SUCCESSFUL_CODE).data(data).build();
        res.message(ResponseConst.SUCCESSFUL_MSG);
        return res;
    }

    public static <T> ServiceResponse<T> success(T data, String message) {
        ServiceResponse<T> res = ServiceResponse.<T>builder().code(ResponseConst.SUCCESSFUL_CODE).data(data).build();
        res.message(message);
        return res;
    }

    public static <T> ServiceResponse<T> success(T data, String message, String errorCode) {
        ServiceResponse<T> res = ServiceResponse.<T>builder().code(errorCode).data(data).build();
        res.message(message);
        return res;
    }

    public static <T> ServiceResponse<T> success(String message, String errorCode) {
        ServiceResponse<T> res =  ServiceResponse.<T>builder().code(errorCode).build();
        res.message(message);
        return res;
    }

    public static <T> ServiceResponse<T> error(String message, String errorCode) {
        ServiceResponse<T> res =  ServiceResponse.<T>builder().code(errorCode).build();
        res.message(message);
        return res;
    }

    public static <T> ServiceResponse<T> error(T data, String errorCode, String message) {
        ServiceResponse<T> res =  ServiceResponse.<T>builder().code(errorCode).data(data).build();
        res.message(message);
        return res;
    }

    public static <T> ServiceResponse<T> error(String errorCode, List<String> message) {
        ServiceResponse<T> res =  ServiceResponse.<T>builder().code(errorCode).build();
        res.message(message);
        return res;
    }
}