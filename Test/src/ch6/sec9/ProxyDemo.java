package ch6.sec9;

interface Network {
	public void browse();
}

class Real implements Network {
	public void browse() {
		System.out.println("Access the net work!");
	}
}

class Proxy implements Network {
	private Network network;

	public Proxy(Network network) {
		this.network = network;
	}

	public void browse() {
		this.check();
		this.network.browse();
	}

	public void check() {
		System.out.println("Check the user valid or not");

	}
}

public class ProxyDemo {
	public static void main(String[] args) {
		Network net = null;
		net = new Proxy(new Real());
		net.browse();
	}
}
