package ch.fhnw.oop2.module08.ab2;

public enum StateButton {

	On("On"), Off("Off");
	
	String state;
	
	StateButton(String state){
		this.state = state;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
	
}
