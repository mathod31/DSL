public class main(FSM fsm) {
		public static void main (String[] args){
	
		Initstate initstate = new Initstate(s1);
		Finalstate finalState = new Finalstate(s3);
		State s2 = new s2(s2);
		
		sample dsl = new sample("sample", initstate, finalState);
		
		while (!(dsl.getCurrentState() instanceof Final)){
			Scanner sc = new Scanner(System.in);
			System.out.println("Saisir un trigger :");
			String input = sc.nextLine();
			 if (dsl.getCurrent().getName() == "s1" && input == "next"{
			 dsl.setState(s1);
			 }	
			 if (dsl.getCurrent().getName() == "s2" && input == "next"{
			 dsl.setState(s2);
			 }	
		}	

      }

}
