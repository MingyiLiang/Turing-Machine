package TuringSubtractor;

public class Transition {
	private char input_Symbol;
	private char output_Symbol;
	public int action;
	public int state_Num;
	public static final int RIGHT = 1;
	public static final int LEFT = -1;
	
	public Transition(char input,char output, int action, int state) {
		this.input_Symbol = input;
		this.output_Symbol = output;
		this.action = action;
		this.state_Num = state;
	}
	
	public char getInput(){
		return input_Symbol;
	}
	
	public char getOutput() {
		return output_Symbol;
	}
	
	public int getAction() {
		return action;
	}
	
	public int getState() {
		return state_Num;
	}

}
