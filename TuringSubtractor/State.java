package TuringSubtractor;


public class State {
	 public int state_Num;
	    public Transition transitions[];
	    
	    public State(int stateId){
	        this.state_Num = stateId;
	        this.transitions = new Transition[256];
	    }

	    public int getStateId() {
	        return state_Num;
	    }

	    public void setStateId(int Id) {
	        this.state_Num = Id;
	    }

	    public Transition[] getTransition() {
	        return transitions;
	    }
	    
	    // set transitions for the state
	    public void setTransitions(Transition[] transitions) {
	        this.transitions = transitions;
	    }
	    
	    // add transition to the state
	    public void addTransition(Transition train){
	        transitions[train.getInput()] = train;
	    }

}
