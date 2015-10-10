package exercise_05;

import java.security.Provider;
import java.security.Security;

public class ListProviders {
    /*
     * test java.security.Provider API;
     */
	public static void main(String[] args) {
		System.out.println("List of All Cryptographic Service"
				+ " Providers and their versions\n");
		for (Provider provider : Security.getProviders()) {
			System.out.println("Name : " + provider.getName());
			System.out.println("Information About Provider : " + provider.getInfo());
			System.out.println("Version : " + provider.getVersion());
			System.out.println("\n");
		}

	}

}
