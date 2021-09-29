package x00.Introduction.x10.IntToString;

import java.security.Permission;
import java.util.Scanner;

/**
 * @author Nelson Migliarini
 */
public class Solution {
	public static void main(String[] args) {
		DoNotTerminate.forbidExit();
		try {
			Scanner in = new Scanner(System.in);
			int n = in.nextInt();
			in.close();
			String s = Integer.toString(n);
			if(n == Integer.parseInt(s))
				System.out.println("Good job");
			else
				System.out.println("Wrong answer.");
		} catch(DoNotTerminate.ExitTrappedException e) {
			System.out.println("Unsuccessful Termination!!");
		}
	}
}


class DoNotTerminate {
	
	private DoNotTerminate() {}
	
	public static class ExitTrappedException extends SecurityException {
		private static final long serialVersionUID = 1;
	}

	public static void forbidExit() {
		final SecurityManager securityManager = new SecurityManager() {
			@Override
			public void checkPermission(Permission permission) {
				if(permission.getName().contains("exitVM"))
					throw new ExitTrappedException();
			}
		};
		System.setSecurityManager(securityManager);
	}
}
