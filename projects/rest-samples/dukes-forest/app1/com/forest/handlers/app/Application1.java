package com.forest.handlers.app;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import com.forest.handlers.app.res.Resource1;

@ApplicationPath("/payment")
public class Application1 extends Application {

	@Override
	public Set<Class<?>> getClasses() {
	    final Set<Class<?>> classes = new HashSet<>();
	    classes.add(Resource1.class);
	    return classes;
	}
}