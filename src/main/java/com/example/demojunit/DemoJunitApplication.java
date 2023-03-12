package com.example.demojunit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoJunitApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoJunitApplication.class, args);
	}

	public static boolean isAllowedToEnterLiquorStore(int age, boolean inCompanyOfAParent, boolean hasADog, boolean isBlind) {
		// Tester
		// is blind with dog -> true
		// is blind without dog -> true
		// is not blind with dog -> false
		// is not blind without dog -> true
		if(!isBlind && hasADog){
			return false;
		}

		// with parent, under 20 -> true
		// with parent, over 20 -> true
		// without parent, under 20 -> false
		// without parent, over 20 -> true
		if(!inCompanyOfAParent && age < 20){
			return false;
		}
		return true;
	}
}
