package edu.wpi.rail.jrosbridge;

import org.glassfish.tyrus.server.Server;

public class DummyServer {

	private Server s;

	public DummyServer(int port) {
	    //Had to add an additional parameter since constructor was updated in the latest tyrus server.
		this.s = new Server("localhost", port, "",null,DummyHandler.class);
	}

	public boolean start() {
		try {
			this.s.start();
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public void stop() {
		this.s.stop();
	}
}
