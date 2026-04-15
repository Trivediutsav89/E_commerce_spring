package com.example.demo.util;

import com.example.demo.exception.ApiException;
import org.springframework.http.HttpStatus;
import java.util.regex.Pattern;

public class ValidationUtil {
    private static final Pattern EMAIL_PATTERN = Pattern.compile(
            "^[A-Za-z0-9+_.-]+@(.+)$"
    );

    private static final Pattern PASSWORD_PATTERN = Pattern.compile(
            "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=]).{8,}$"
    );

    public static void validateEmail(String email) {
        if (email == null || email.trim().isEmpty()) {
            throw new ApiException(AppConstants.EMAIL_INVALID, HttpStatus.BAD_REQUEST);
        }
        if (!EMAIL_PATTERN.matcher(email).matches()) {
            throw new ApiException(AppConstants.EMAIL_INVALID, HttpStatus.BAD_REQUEST);
        }
    }

    public static void validatePassword(String password) {
        if (password == null || password.isEmpty()) {
            throw new ApiException(AppConstants.PASSWORD_WEAK, HttpStatus.BAD_REQUEST);
        }
        if (password.length() < 8) {
            throw new ApiException(AppConstants.PASSWORD_WEAK, HttpStatus.BAD_REQUEST);
        }
    }

    public static void validateProductName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new ApiException(AppConstants.PRODUCT_NAME_EMPTY, HttpStatus.BAD_REQUEST);
        }
    }

    public static void validateProductPrice(Double price) {
        if (price == null || price <= 0) {
            throw new ApiException(AppConstants.PRODUCT_PRICE_INVALID, HttpStatus.BAD_REQUEST);
        }
    }

    public static void validateNotNull(Object object, String fieldName) {
        if (object == null) {
            throw new ApiException(fieldName + " cannot be null", HttpStatus.BAD_REQUEST);
        }
    }

    public static void validateNotEmpty(String value, String fieldName) {
        if (value == null || value.trim().isEmpty()) {
            throw new ApiException(fieldName + " cannot be empty", HttpStatus.BAD_REQUEST);
        }
    }
}
