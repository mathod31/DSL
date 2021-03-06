/*
 * generated by Xtext 2.14.0
 */
package org.xtext.example.mydsl.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import sample.FSM
import sample.Finalstate
import sample.Initstate
import sample.finalstate

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class MyDslGenerator extends AbstractGenerator {

		
		
		override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		var myFsm = resource.contents.get(0) as FSM
		fsa.generateFile("main.java", contentMain(myFsm))
		fsa.generateFile(myFsm.name + ".java", contentFSM(myFsm.name))
		fsa.generateFile("State.java", contentAbstractState("State"))
		fsa.generateFile("Initstate.java", contentExtendState("Initstate"))
		fsa.generateFile("Finalstate.java", contentExtendState("Finalstate"))
		for (state : myFsm.state) {
			if (!(state instanceof Finalstate) && !(state instanceof Initstate)){
				fsa.generateFile(state.name + ".java", contentExtendState(state.name))
			}
		}
		
	}



def contentFSM(String name)
'''
public class «name» {

    String name;
    Initstate initstate;
    Finalstate finalstate;
    State currentState;
    public «name»(String name, Initstate initstate, Finalstate finalState) {
        this.name = name;
        this.initstate = initstate;
        this.finalstate = finalState;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Initstate getInitstate() {
        return initstate;
    }

    public void setInitstate(Initstate initstate) {
        this.initstate = initstate;
    }

    public Finalstate getFinalstate() {
        return finalstate;
    }

    public void setFinalstate(Finalstate finalstate) {
        this.finalstate = finalstate;
    }

    public State getCurrentState() {
        return currentState;
    }

    public void setCurrentState(State currentState) {
        this.currentState = currentState;
    }
}

'''
def contentAbstractState(String name)
'''
public abstract class «name» {
	private String name;
	    public «name»(String name) {
	    }
	public String getName() { return name;}
}

'''	
def contentExtendState(String name)
'''
public class «name» extends State {
	private String name;
	
	public «name» (String name){
			super(name);
		}

}

'''
	
def contentMain(FSM fsm)
	'''
	import java.util.Scanner;
	
	public class main {
			public static void main (String[] args){
		
			«FOR s:fsm.state»
				«IF s instanceof Initstate»
					Initstate initstate = new Initstate("«s.name»");
				«ELSEIF s instanceof Finalstate »
					Finalstate finalState = new Finalstate("«s.name»");
				«ELSE»
					State «s.name» = new «s.name»("«s.name»");
				«ENDIF»
			«ENDFOR»
			
			«fsm.name» dsl = new «fsm.name»("«fsm.name»", initstate, finalState);
			dsl.setCurrentState(initstate);
			System.out.println("Start with state : " + dsl.getCurrentState().getName());
			
			while (!(dsl.getCurrentState() instanceof Finalstate)){
				Scanner sc = new Scanner(System.in);
				System.out.println("Saisir un trigger :");
				String input = sc.nextLine();
				switch(dsl.getCurrentState().getName()) {
				 «FOR tr : fsm.transition»
				 case "«tr.stateFrom.name»" :
				 	if (input.equals("«tr.trigger»")) {
					 «IF tr.stateTo instanceof Finalstate»
					 	dsl.setCurrentState(finalState);
					 «ELSE»
					 	dsl.setCurrentState(«tr.stateTo.name»);
					  «ENDIF»
					 }	
					 break;
				 «ENDFOR»	
				 
			}
			System.out.println("Next state : " + dsl.getCurrentState().getName());
			
	      }
	      	System.out.println("Finish with state : " + dsl.getCurrentState().getName());
	   }
	}
	'''
	
	
}
