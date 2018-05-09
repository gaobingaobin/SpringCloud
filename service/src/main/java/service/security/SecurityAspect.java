package service.security;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * aop面向切面
 * Created by Administrator on 2018-05-09.
 */
@Aspect
@Component
public class SecurityAspect {
    @Pointcut("@annotation(AdminOnly)")
    public void adminOnly(){

    }
    @Before("adminOnly()")
    public void check(){
        System.out.println("执行切面操作");
    }
    @Pointcut("within(service.controller.UserController)")
    public void matchType(){

    }
    @Before("matchType()")
    public void checkWithIn(){
        System.out.println("测试within");
    }
    @Pointcut("args(Long)&&within(service.controller.*)")
    public void argsDemo(){

    }
    @Before("argsDemo()")
    public void checkArgsDemo(){
        System.out.println("####################-------argsDemo");
    }
    @Pointcut("this(service.controller.UserController)")
    public void thisDemo(){

    }
    @Before("argsDemo()")
    public void checkThisDemo(){
        System.out.println("####################-------thisDemo");
    }
    @Pointcut("this(service.repository.UserRepository.save(..))")
    public void securitySave(){
        System.out.println("####################-------拦截保存的方法");
    }

}
