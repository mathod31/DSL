package sample.sample.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import sample.Initstate;
import sample.sample.aspects.StateAspect;

@Aspect(className = Initstate.class)
@SuppressWarnings("all")
public class InitstateAspect extends StateAspect {
}
