package task10;

public class Teaa {
	
	    private String name;

	    public void Tea(String name) {
	        this.name = name;
	    }

	    public void brew() {
	        System.out.println(name + " tea is brewed.");
	    }
	}

	class GreenTea extends Tea {
	    public GreenTea() {
	        super();
	    }

	    @Override
	    public void brew() {
	        System.out.println("Brewing Green Tea.");
	    }
	}

	class BlackTea extends Tea {
	    public BlackTea() {
	        super("Black");
	    }

	    @Override
	    public void brew() {
	        System.out.println("Brewing Black Tea.");
	    }
	}

	public class TeaPolymorphismExample {
	    public static void main(String[] args) {
	        Tea[] teas = new Tea[3];
	        teas[0] = new GreenTea();
	        teas[1] = new BlackTea();
	        teas[2] = new Tea("Herbal");

	        for (Tea tea : teas) {
	            tea.brew();
	        }
	    }
	}


}
