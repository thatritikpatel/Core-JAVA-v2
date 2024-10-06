interface Radio{
	void powerController();
	void volumeController();
	void bandSelector();
	void channelSelector();
}

class SamsungRadio implements Radio{
	public void powerController(){
		System.out.println("power controller - SamsungRadio");
	}

	public void volumeController(){
		System.out.println("volume controller - SamsungRadio");
	}

	public void bandSelector(){
		System.out.println("band selector - SamsungRadio");
	}

	public void channelSelector(){
		System.out.println("channel selector - SamsungRadio");
	}
}

class LGRadio implements Radio{
	public void powerController(){
		System.out.println("power controller - LGRadio");
	}

	public void volumeController(){
		System.out.println("volume controller - LGRadio");
	}

	public void bandSelector(){
		System.out.println("band selector - LGRadio");
	}

	public void channelSelector(){
		System.out.println("channel selector - LGRadio");
	}
}

class PanasonicRadio implements Radio{
	public void powerController(){
		System.out.println("power controller - PanasonicRadio");
	}

	public void volumeController(){
		System.out.println("volume controller - PanasonicRadio");
	}

	public void bandSelector(){
		System.out.println("band selector - PanasonicRadio");
	}

	public void channelSelector(){
		System.out.println("channel selector - PanasonicRadio");
	}
}

class H{
	public static void main(String[] args){
		LGRadio lr = new LGRadio();
		operateRadio(lr);
		System.out.println("#######################");
		SamsungRadio sr = new SamsungRadio();
		operateRadio(sr);
		System.out.println("#######################");
		PanasonicRadio pr = new PanasonicRadio();
		operateRadio(pr);
	}

	static void operateRadio(Radio r){
		r.powerController();
		r.volumeController();
		r.bandSelector();
		r.channelSelector();
	}

	/*
	static void operateRadio(SamsungRadio r){
		r.powerController();
		r.volumeController();
		r.bandSelector();
		r.channelSelector();
	}
	
	static void operateRadio(LGRadio r){
		r.powerController();
		r.volumeController();
		r.bandSelector();
		r.channelSelector();
	}
	
	static void operateRadio(PanasonicRadio r){
		r.powerController();
		r.volumeController();
		r.bandSelector();
		r.channelSelector();
	}*/
}