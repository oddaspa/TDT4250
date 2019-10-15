package no.tdt4250.assignment2.helloworld;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class Activator implements BundleActivator {

	private static BundleContext context;

	static BundleContext getContext() {
		return context;
	}

	public void start(BundleContext bundleContext) throws Exception {
		System.out.println("Hello world");
	}

	public void stop(BundleContext bundleContext) throws Exception {
		System.out.println("Goodbye World");
	}

}
