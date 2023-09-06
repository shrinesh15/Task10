package task10;

public class Tea {
	
	    private boolean isPrepared;
	    private boolean hasMilk;
	    private boolean hasSugar;

	    public void Tea() {
	        isPrepared = false;
	        hasMilk = false;
	        hasSugar = false;
	    }

	    public void prepareTea() {
	        if (!isPrepared) {
	            System.out.println("Preparing basic tea with hot water and tea leaves.");
	            isPrepared = true;
	        } else {
	            System.out.println("Tea is already prepared.");
	        }
	    }

	    public void addMilk() {
	        if (isPrepared && !hasMilk) {
	            System.out.println("Adding milk to the tea.");
	            hasMilk = true;
	        } else if (!isPrepared) {
	            System.out.println("Please prepare the tea first.");
	        } else {
	            System.out.println("Milk is already added.");
	        }
	    }

	    public void addSugar() {
	        if (isPrepared && !hasSugar) {
	            System.out.println("Adding sugar to the tea.");
	            hasSugar = true;
	        } else if (!isPrepared) {
	            System.out.println("Please prepare the tea first.");
	        } else {
	            System.out.println("Sugar is already added.");
	        }
	    }

	    public static void main(String[] args) {
	        Tea tea = new Tea();
	        tea.prepareTea();
	        tea.addMilk();
	        tea.addSugar();
	        tea.prepareTea(); 
	        tea.addMilk();     
	        tea.addSugar();    
	    }

		public void brew() {
			
		}

		public void addCondiments() {
			
			
		}
}



