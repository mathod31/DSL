package sample.sample.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import sample.Finalstate;
import sample.sample.aspects.StateAspect;

@Aspect(className = Finalstate.class)
@SuppressWarnings("all")
public class FinalstateAspect extends StateAspect {
}
