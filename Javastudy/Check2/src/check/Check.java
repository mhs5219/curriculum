package check;

public class Check {
		private String firstName = "太郎";
		private String lastName = "山田";

	public void printName(){
		System.out.println("printNameメソッド → " + this.lastName + this.firstName);
	}

	public static void main(String[] args) {
		Check c = new Check();
	    c.printName();
	    Pet p = new Pet(constants.Constants.CHECK_CLASS_JAVA,constants.Constants.CHECK_CLASS_HOGE);
	    p.introduce();
	    RobotPet r = new RobotPet(constants.Constants.CHECK_CLASS_R2D2, constants.Constants.CHECK_CLASS_LUKE);
	    r.introduce();}
}
