package com.xb.service.base.listener;

import javax.servlet.ServletRequest;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpServletRequest;

@WebListener
public class RequestListener implements ServletRequestListener {

	@Override
	public void requestDestroyed(ServletRequestEvent sre) {
		// TODO Auto-generated method stubs
		final ServletRequest servletRequest = sre.getServletRequest();
		final HttpServletRequest request = (HttpServletRequest) servletRequest;
		System.out.println("======requestDestroyed========");
	}

	@Override
	public void requestInitialized(ServletRequestEvent sre) {
		System.out.println("======requestInitialized========");
		
	}

   
}