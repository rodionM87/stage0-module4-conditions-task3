package school.mjc.stage0.conditions.task3;

public class SalaryCalculator {
    public void calculateSalary(int salary) {
        if (salary <= 10000) {
	    double afterTaxes = salary * (1 - 0.15);
	    int afterTaxesX = (int) afterTaxes;
	    System.out.println(afterTaxes);
	}
	if (10000 < salary && salary <= 20000) {
	    double afterTaxes = salary * (1 - 0.18);
	    int afterTaxesX = (int) afterTaxes;
	    System.out.println(afterTaxes);
	}
	if (salary > 20000) {
	    double afterTaxes = salary * (1 - 0.20);
	    int afterTaxesX = (int) afterTaxes;
	    System.out.println(afterTaxes);
	}
	if (salary < 0) {
	    System.out.println("wrong input!");
	}
    }
}
