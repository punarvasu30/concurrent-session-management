package com.skb.checkservice.domain.User;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Builder;
import lombok.Getter;


@Builder
public class UserDto {

    @Getter
    @Builder
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
    public static class Response {

        private String newUser;

        public String getNewUser() {
            return newUser;
        }

        public String getExistUser() {
            return existUser;
        }

        private String existUser;

        public Response() {}

        // ✅ all-args constructor
        public Response(String newUser, String existUser) {
            this.newUser = newUser;
            this.existUser = existUser;
        }
    }

}
