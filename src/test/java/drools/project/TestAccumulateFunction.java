package drools.project;

import org.kie.api.runtime.rule.AccumulateFunction;

import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.util.Set;

public class TestAccumulateFunction implements AccumulateFunction<TestAccumulateFunction.Context> {
    public Context createContext() {
        return new Context();
    }

    // Initialize the context to a null latest (i.e. we haven't found one yet)
    public void init(Context context) {
        context = null;
    }

    public void accumulate(Context context, Object value) {
        Measurement other = (Measurement) value;
        context.set.add(other);

    }

    public Object getResult(Context context) {
        return context;
    }

    // We're not sharing this accumulator between sessions, so we don't need to
    // implement these methods.
    public void readExternal(ObjectInput in) {
        throw new RuntimeException("readExternal not supported");
    }

    public void writeExternal(ObjectOutput out) {
        throw new RuntimeException("writeExternal not supported");
    }

    // We do not support reversing this (this can be implemented for performance
    // benefits if needed, but
    // would require the context to store a list of objects.
    @Override
    public boolean supportsReverse() {
        return false;
    }

    public void reverse(Context context, Object value,Object value1) {
        throw new RuntimeException("reverse not supported");
    }

    @Override
    public Class<?> getResultType() {
        return Set.class;
    }

    // This class serves as "storage" for the accumulate function. It holds the
    // latest Temporal object encountered
    public static class Context implements Serializable {
        private static final long serialVersionUID = 1L;
        public Set<Measurement> set;
    }

	@Override
	public void reverse(Context arg0, Object arg1) throws Exception {
		// TODO Auto-generated method stub
		
	}
}
