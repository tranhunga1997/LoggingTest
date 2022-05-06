package com.example.listener;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import com.example.event.UserEvent;

@Component
public class UserEventListener {
	
	@EventListener
	public void handleUserEvent(UserEvent event) {
		System.out.println(event.getUser().getName());
		System.out.println(event.getUser().getStatus());
	}
}
