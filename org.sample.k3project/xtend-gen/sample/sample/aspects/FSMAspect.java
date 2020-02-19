package sample.sample.aspects;

import com.google.common.base.Objects;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import java.util.Scanner;
import org.eclipse.emf.common.util.EList;
import sample.FSM;
import sample.Finalstate;
import sample.Initstate;
import sample.State;
import sample.Transition;
import sample.sample.aspects.FSMAspectFSMAspectProperties;

@Aspect(className = FSM.class)
@SuppressWarnings("all")
public class FSMAspect {
  private static State current;
  
  private static String input;
  
  public static void interprete(final FSM _self) {
    final sample.sample.aspects.FSMAspectFSMAspectProperties _self_ = sample.sample.aspects.FSMAspectFSMAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void interprete()
    if (_self instanceof sample.FSM){
    	sample.sample.aspects.FSMAspect._privk3_interprete(_self_, (sample.FSM)_self);
    };
  }
  
  private static Scanner sc(final FSM _self) {
    final sample.sample.aspects.FSMAspectFSMAspectProperties _self_ = sample.sample.aspects.FSMAspectFSMAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# Scanner sc()
    if (_self instanceof sample.FSM){
    	result = sample.sample.aspects.FSMAspect._privk3_sc(_self_, (sample.FSM)_self);
    };
    return (java.util.Scanner)result;
  }
  
  private static void sc(final FSM _self, final Scanner sc) {
    final sample.sample.aspects.FSMAspectFSMAspectProperties _self_ = sample.sample.aspects.FSMAspectFSMAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void sc(Scanner)
    if (_self instanceof sample.FSM){
    	sample.sample.aspects.FSMAspect._privk3_sc(_self_, (sample.FSM)_self,sc);
    };
  }
  
  protected static void _privk3_interprete(final FSMAspectFSMAspectProperties _self_, final FSM _self) {
    EList<State> _state = _self.getState();
    for (final State state : _state) {
      if ((state instanceof Initstate)) {
        FSMAspect.current = state;
        String _name = FSMAspect.current.getName();
        String _plus = ("Start with state : " + _name);
        System.out.println(_plus);
      }
    }
    while ((!(FSMAspect.current instanceof Finalstate))) {
      EList<Transition> _transition = _self.getTransition();
      for (final Transition transition : _transition) {
        {
          System.out.println("Veuillez saisir un trigger :");
          FSMAspect.input = FSMAspect.sc(_self).nextLine();
          System.out.println(("Vous avez saisi : " + FSMAspect.input));
          if ((Objects.equal(transition.getStateFrom().getName(), FSMAspect.current.getName()) && Objects.equal(transition.getTrigger(), FSMAspect.input))) {
            FSMAspect.current = transition.getStateTo();
            String _name_1 = FSMAspect.current.getName();
            String _plus_1 = ("Next state : " + _name_1);
            System.out.println(_plus_1);
          }
        }
      }
    }
    String _name_1 = FSMAspect.current.getName();
    String _plus_1 = ("Finish with state : " + _name_1);
    System.out.println(_plus_1);
  }
  
  protected static Scanner _privk3_sc(final FSMAspectFSMAspectProperties _self_, final FSM _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getSc") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (java.util.Scanner) ret;
    				} else {
    					return null;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.sc;
  }
  
  protected static void _privk3_sc(final FSMAspectFSMAspectProperties _self_, final FSM _self, final Scanner sc) {
    boolean setterCalled = false;
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setSc")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, sc);
    			setterCalled = true;
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    if (!setterCalled) {
    	_self_.sc = sc;
    }
  }
}
