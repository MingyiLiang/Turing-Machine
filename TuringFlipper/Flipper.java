package TuringFlipper;

public class Flipper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Turing machine1 = new Turing(2);
		State s0 = new State(0);
		s0.addTransition(new Transition('0','1',Transition.right,0));
		s0.addTransition(new Transition('1','0',Transition.right,0));
		s0.addTransition(new Transition('B','B',Transition.right,1));
		
		// add state to the machine
		machine1.addState(s0);
		// define some input
		String inTape = "0101010101010";
		System.out.println(inTape);
		String outTape = machine1.execute(inTape);
		System.out.println(outTape);

	}

}
