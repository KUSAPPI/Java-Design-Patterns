package ProxyPatternDemo;
import ProxyClasses.Proxy;

public class ProxyPattern {

	public static void main(String[] args) {
		System.out.println("***Proxy pattern Demo\n");
		Proxy px = new Proxy();
		px.doSomeWork();

	}

}
