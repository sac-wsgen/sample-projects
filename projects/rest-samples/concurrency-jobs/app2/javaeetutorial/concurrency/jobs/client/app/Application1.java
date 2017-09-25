package javaeetutorial.concurrency.jobs.client.app;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import javaeetutorial.concurrency.jobs.client.app.res.Resource1;

@ApplicationPath("/JobService/process")
public class Application1 extends Application {

	@Override
	public Set<Class<?>> getClasses() {
	    final Set<Class<?>> classes = new HashSet<>();
	    classes.add(Resource1.class);
	    return classes;
	}
}