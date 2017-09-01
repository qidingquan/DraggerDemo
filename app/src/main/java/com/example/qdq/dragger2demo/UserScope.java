package com.example.qdq.dragger2demo;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

/**
 * 自定义UserScope注解
 */
@Scope
@Retention(RetentionPolicy.RUNTIME)
public @interface UserScope {

}
