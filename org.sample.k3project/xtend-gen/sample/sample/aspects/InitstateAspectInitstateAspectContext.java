package sample.sample.aspects;

import java.util.Map;
import sample.Initstate;
import sample.sample.aspects.InitstateAspectInitstateAspectProperties;

@SuppressWarnings("all")
public class InitstateAspectInitstateAspectContext {
  public final static InitstateAspectInitstateAspectContext INSTANCE = new InitstateAspectInitstateAspectContext();
  
  public static InitstateAspectInitstateAspectProperties getSelf(final Initstate _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new sample.sample.aspects.InitstateAspectInitstateAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Initstate, InitstateAspectInitstateAspectProperties> map = new java.util.WeakHashMap<sample.Initstate, sample.sample.aspects.InitstateAspectInitstateAspectProperties>();
  
  public Map<Initstate, InitstateAspectInitstateAspectProperties> getMap() {
    return map;
  }
}
