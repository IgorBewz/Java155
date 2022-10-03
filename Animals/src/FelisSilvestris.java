class FelisSilvestris {
	private String name = "unknown";
	private String color = "unknown";
	
	public FelisSilvestris(String name){
		if (name != null && name != "") {
			this.name = name;
		} else {
			System.out.println("You didn't enter a name.");
		}
	}

	public FelisSilvestris(String name, String color){
		if (name != null && name != "") {
			this.name = name;
		} else {
			System.out.println("You didn't enter a name.");
		}
		
		if (color != null && color != "") {
			this.name = name;
		} else {
			System.out.println("You didn't enter a color.");
		}
	}
}
