package git_home;

import javax.swing.JOptionPane;

public class hello {
	public static void main(String[] args) {
		String str = JOptionPane.showInputDialog("Plase Input a String: ");
		f(str);
	}
	public static void f(String s){
		if(s.length()==1){
			System.out.println(s);	
		}else {
			String sub1 = s.substring(0,s.length()-1);
			String sub2 = s.substring(s.length()-1);
			System.out.println(sub2);
			f(sub1);
		}
	}
	
}
