import org.testng.annotations.Test;

public class SampleTestNG1 {
	@Test(priority=1)
	public void sub() {
		System.out.println("this is sub");
	}
	@Test(enabled=false)
	public void test() {
		System.out.println("this is test");
	}
	@Test(priority=3)
	public void login() {
		System.out.println("this is login");
	}
	@Test(priority=4)
	public void giveInput() {
		System.out.println("this is giveInput");
	}
	@Test(priority=5)
	public void exit() {
		System.out.println("this is exit");
	}
}
