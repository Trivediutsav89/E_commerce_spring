package com.example.demo.util;

public class AppConstants {
    // JWT Constants
    public static final long JWT_EXPIRATION_TIME = 1000 * 60 * 24; // 24 hours in milliseconds
    public static final long REFRESH_TOKEN_EXPIRATION = 604800000; // 7 days in milliseconds
    public static final String JWT_ALGORITHM = "HS256";

    // API Response Messages
    public static final String USER_CREATED_SUCCESS = "User registered successfully";
    public static final String USER_LOGIN_SUCCESS = "User authenticated successfully";
    public static final String PRODUCT_CREATED_SUCCESS = "Product created successfully";
    public static final String PRODUCT_DELETED_SUCCESS = "Product deleted successfully";
    public static final String PRODUCT_UPDATED_SUCCESS = "Product updated successfully";

    // Error Messages
    public static final String USER_NOT_FOUND = "User not found";
    public static final String PRODUCT_NOT_FOUND = "Product not found";
    public static final String INVALID_CREDENTIALS = "Invalid email or password";
    public static final String USER_ALREADY_EXISTS = "User already exists with this email";
    public static final String INVALID_TOKEN = "Invalid or expired token";

    // Validation Messages
    public static final String EMAIL_INVALID = "Invalid email format";
    public static final String PASSWORD_WEAK = "Password must be at least 8 characters";
    public static final String PRODUCT_NAME_EMPTY = "Product name cannot be empty";
    public static final String PRODUCT_PRICE_INVALID = "Product price must be greater than zero";
}
