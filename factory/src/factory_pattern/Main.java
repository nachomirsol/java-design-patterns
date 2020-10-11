package factory_pattern;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Mobile mobile = MobileFactory.createMobile(Mobile.SAMSUNG);

        System.out.println(mobile);

    }
}
