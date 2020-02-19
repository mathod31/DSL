package sample.sample.aspects;

import java.util.Map;
import sample.Finalstate;
import sample.sample.aspects.FinalstateAspectFinalstateAspectProperties;

@SuppressWarnings("all")
public class FinalstateAspectFinalstateAspectContext {
  public final static FinalstateAspectFinalstateAspectContext INSTANCE = new FinalstateAspectFinalstateAspectContext();
  
  public static FinalstateAspectFinalstateAspectProperties getSelf(final Finalstate _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new sample.sample.aspects.FinalstateAspectFinalstateAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Finalstate, FinalstateAspectFinalstateAspectProperties> map = new java.util.WeakHashMap<sample.Finalstate, sample.sample.aspects.FinalstateAspectFinalstateAspectProperties>();
  
  public Map<Finalstate, FinalstateAspectFinalstateAspectProperties> getMap() {
    return map;
  }
}
