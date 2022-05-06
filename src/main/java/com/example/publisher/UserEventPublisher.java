package com.example.publisher;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

import com.example.event.UserEvent;
import com.example.model.User;

@Service
public class UserEventPublisher {
	@Autowired
	ApplicationEventPublisher publisher;
	
	public String userPublisher(User user) {
		UserEvent userEvent = new UserEvent(this, user);
		publisher.publishEvent(userEvent);
		return "Event Publisher";
	}
}
