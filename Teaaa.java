package task10;

public class Teaaa {
	
	// Tea class
	    private String name;

	    public void Tea(String name) {
	        this.name = name;
	    }

	    public void prepareTea() {
	        boilWater();
	        steepTeaBag();
	        pourInCup();
	        addCondiments();
	    }

	    private void boilWater() {
	        System.out.println("Boiling water...");
	    }

	    private void steepTeaBag() {
	        System.out.println("Steeping the tea bag...");
	    }

	    private void pourInCup() {
	        System.out.println("Pouring the tea into a cup...");
	    }

	    private void addCondiments() {
	        System.out.println("Adding condiments...");
	    }
	}

	// BlackTea subclass
	class BlackTea extends Tea {
	    public BlackTea() {
	        super();
	    }

	    @Override
	    public void addCondiments() {
	        System.out.println("Adding lemon to the black tea...");
	    }
	}

	// GreenTea subclass
	class GreenTea extends Tea {
	    public GreenTea() {
	        super("Green Tea");
	    }

	    @Override
	    public void addCondiments() {
	        System.out.println("Adding honey to the green tea...");
	    }
	}

	// HerbalTea subclass
	class HerbalTea extends Tea {
	    public HerbalTea() {
	        super("Herbal Tea");
	    }

	    @Override
	    public void addCondiments() {
	        System.out.println("Adding mint leaves to the herbal tea...");
	    }
	}

	public class Main {
	    public static void main(String[] args) {
	        Tea blackTea = new BlackTea();
	        Tea greenTea = new GreenTea();
	        Tea herbalTea = new HerbalTea();

	        System.out.println("Preparing Black Tea:");
	        blackTea.prepareTea();

	        System.out.println("\nPreparing Green Tea:");
	        greenTea.prepareTea();

	        System.out.println("\nPreparing Herbal Tea:");
	        herbalTea.prepareTea();
	    }
	}


}
