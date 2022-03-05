package com.superhan.dvdrentalspringbootbackend.common.enumerator;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public interface BaseResultCode {

    HttpStatus getStatusCode();
    String getResultCode();
    String getDescription();
    boolean isNeededRedirection();

    default GlobalResponse<String> createGlobalResponse() {
        return new GlobalResponse<String>(this.getResultCode(), this.getDescription(), this.isNeededRedirection(), "None");
    }

    default <T> GlobalResponse<T> createGlobalResponse(T data) {
        return new GlobalResponse<T>(this.getResultCode(), this.getDescription(), this.isNeededRedirection(), data);
    }

    default ResponseEntity<GlobalResponse<String>> createGlobalEntity() {
        GlobalResponse<String> resultResponse = new GlobalResponse<String>(this.getResultCode(), this.getDescription(), this.isNeededRedirection(),"None");
        return ResponseEntity.ok(resultResponse);
    }

    @Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor
    class GlobalResponse <T> {
        private String resultCode;
        private String description;
        private boolean needRedirect;
        T resultDat;
    }
}
