package com.nt.interceptor;

import java.time.LocalDateTime;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;

public class TimeoutCheckInterceptor implements HandlerInterceptor {

		@Override
		public boolean preHandle(HttpServletRequest request, HttpServletResponse resp, Object handler)
				throws Exception {
			// check the times
			LocalDateTime ltd = LocalDateTime.now();
			//get current hour of the day
			int hour=ltd.getHour();
			if(hour<9 || hour > 17) {
				RequestDispatcher rd = request.getRequestDispatcher("/timeout.jsp");
				rd.forward(request, resp);
				return false;
			}
			return true;
		}
}
