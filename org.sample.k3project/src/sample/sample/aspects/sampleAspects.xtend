package sample.sample.aspects

import fr.inria.diverse.k3.al.annotationprocessor.Aspect


import static extension sample.sample.aspects.FSMAspect.*
import static extension sample.sample.aspects.TransitionAspect.*
import static extension sample.sample.aspects.StateAspect.*
import static extension sample.sample.aspects.InitstateAspect.*
import static extension sample.sample.aspects.FinalstateAspect.*
import sample.Initstate
import sample.FSM
import sample.Transition
import sample.Finalstate
import sample.State
import java.util.Scanner
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.common.util.URI
import sample.SamplePackage

class Interpreter {
	def static void main(String[] args) {
		SamplePackage.eINSTANCE.class
		Resource$Factory.Registry.INSTANCE.extensionToFactoryMap.put("xmi", new XMIResourceFactoryImpl());
		var Resource resource = new ResourceSetImpl().getResource(URI.createURI('/home/parallels/Documents/gemoc/workspace/DSL/sample/model/FSM.xmi'), true);
		var myfsm = resource.contents.get(0) as FSM
		myfsm.interprete
	}
}
@Aspect(className=FSM)
class FSMAspect {
	static State current
	Scanner sc = new Scanner(System.in);
	static String input	
	
	def void interprete()
	{
		
		for (state : _self.state)
		{			
			if (state instanceof Initstate)
			{
				current = state
				System.out.println("Start with state : " + current.getName());
				
			}
		}
		
	
		while (!(current instanceof Finalstate))
		{		
			for (transition : _self.transition)
			{
				System.out.println("Veuillez saisir un trigger :");
				input = _self.sc.nextLine();
				System.out.println("Vous avez saisi : " + input);

				if (transition.stateFrom.name == current.name && transition.trigger == input)
				{
					current = transition.stateTo;
					System.out.println("Next state : " + current.getName());
					
				}
			
			}
		}
	      	System.out.println("Finish with state : " + current.getName());

	}
}

@Aspect(className=Transition)
class TransitionAspect {

}

@Aspect(className=State)
class StateAspect {

}

@Aspect(className=Initstate)
class InitstateAspect extends StateAspect {

}

@Aspect(className=Finalstate)
class FinalstateAspect extends StateAspect {

}



