package ch6.sec9;

interface Network { // 定义Network接口
	public void browse(); // 定义浏览的抽象方法
}

class Real implements Network { // 真实的上网操作
	public void browse() { // 覆写抽象方法
		System.out.println("上网浏览信息");
	}
}

class Proxy implements Network { // 代理上网
	private Network network;

	public Proxy(Network network) { // 设置代理的真实操作
		this.network = network; // 设置代理的子类
	}

	public void check() {
		System.out.println("检查用户是否合法");
	}

	public void browse() {
		this.check();   //可以同时调用多个与具体业务相关的操作
		this.network.browse();  //调用真实上网操作
	}

}

public class ProxyDemo {
	public static void main(String[] args) {
		Network net = null;   //定义接口对象
		net = new Proxy(new Real());  //实例化代理，同时传入代理的真实操作
		net.browse();  //客户只关心上网浏览一个功能
	}
}
