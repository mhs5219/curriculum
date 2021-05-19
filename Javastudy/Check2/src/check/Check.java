package check;
import constants.Constants;

public class Check {
		private static String firstName = "太郎";
		private static String lastName = "山田";

	private static void printName(String firstName,String lastName){
		System.out.println("printNameメソッド → " + lastName + firstName);
	}

	public static void main(String[] args) {
		printName(firstName,lastName);
	    Pet p = new Pet(Constants.CHECK_CLASS_JAVA,Constants.CHECK_CLASS_HOGE);
	    p.introduce();
	    RobotPet r = new RobotPet(Constants.CHECK_CLASS_R2D2, Constants.CHECK_CLASS_LUKE);
	    r.introduce();
	}
}
