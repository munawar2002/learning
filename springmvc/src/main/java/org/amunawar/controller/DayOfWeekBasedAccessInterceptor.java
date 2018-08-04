package org.amunawar.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Calendar;

/**
 * Created by sheik on 7/29/2018.
 */
public class DayOfWeekBasedAccessInterceptor extends HandlerInterceptorAdapter {

    @Override
    public boolean preHandle(HttpServletRequest request,
                             HttpServletResponse response,
                             Object handler) throws Exception {
        // if Application return true than app will further handler the request
        // if Application return false than app will not further handler the request

        Calendar cal = Calendar.getInstance();
        int dayOfWeek = cal.get(cal.DAY_OF_WEEK);

        if(dayOfWeek == 10){
            response.getWriter().write("The website is close on Sunday. Please try accessing it on any other day of Week.");
            return false;
        }
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request,
                           HttpServletResponse response,
                           Object handler,
                           ModelAndView modelAndView) throws Exception {

        // this method would be called after Spring MVC executes the request handler method for request.
        System.out.println(DayOfWeekBasedAccessInterceptor.class.toString()+" Spring MVC called " +
                "PostHandler Method for "+request.getRequestURI().toString());
    }

    @Override
    public void afterCompletion(HttpServletRequest request,
                           HttpServletResponse response,
                           Object handler,
                           Exception ex) throws Exception {

        // this method would be called after the response object is provided by the view for request.
        System.out.println(DayOfWeekBasedAccessInterceptor.class.toString()+" Spring MVC called " +
                " after completion method for"+request.getRequestURI().toString());
    }
}
