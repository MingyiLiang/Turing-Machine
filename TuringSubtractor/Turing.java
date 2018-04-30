package TuringSubtractor;

public class Turing {
	public static final int tape = 100;
	public State states[];
	public Turing(int state_Number) {
		states = new State[state_Number];
	}
	
	public void addState(State thisState){
        states[thisState.getStateId()] = thisState;
    }
	
	public String execute(String input) {		
		State currentState = states[0];
		int head = 0;
		char output[] = new char[tape];
		for(int i = 0; i < tape; i ++) {
			if(i < input.length()) {
				output[i] = input.charAt(i);
			}else {
				output[i] = 'B';
			}
		}


		while(currentState.transitions[output[head]] !=null){
            Transition temp = currentState.transitions[output[head]];
            output[head]= temp.getOutput();
            head = head + temp.getAction();
            if(temp.getState() == states.length-1)
                break;
            else
                currentState = states[temp.getState()];
        }
		return String.valueOf(output);
		
	}

}
