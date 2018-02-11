import javax.swing.JOptionPane;

public class Unbirthday {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 String birthday = JOptionPane.showInputDialog(" When is your birthday?");
 if(birthday.equals("2/10")) {
	 JOptionPane.showMessageDialog(null, "Happy Birthday!");
	 
	}
 else {
	 JOptionPane.showMessageDialog(null, "Very Merry UNbirthday");
	}
}
}