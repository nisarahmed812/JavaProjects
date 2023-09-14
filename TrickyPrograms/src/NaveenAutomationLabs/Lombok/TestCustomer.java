package NaveenAutomationLabs.Lombok;

public class TestCustomer {

	public static void main(String[] args) {
		Customer c1 = new Customer("tom", 20, "NY", true, "01-01-2000");
		System.out.println(c1);

		System.out.println(c1.getName() + c1.getDob());
		c1.setActive(false);
		System.out.println(c1.isActive());
	}

}
