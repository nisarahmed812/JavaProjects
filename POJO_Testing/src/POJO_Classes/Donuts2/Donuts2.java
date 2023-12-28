package POJO_Classes.Donuts2;

import java.util.List;

public class Donuts2 {

	private String id;
	private String type;
	private String name;
	private double ppu;
	private Batters2 batters;
	private List<Topping2> topping;

	// Getter and Setter methods for each field

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPpu() {
		return ppu;
	}

	public void setPpu(double ppu) {
		this.ppu = ppu;
	}

	public Batters2 getBatters() {
		return batters;
	}

	public void setBatters(Batters2 batters) {
		this.batters = batters;
	}

	public List<Topping2> getTopping() {
		return topping;
	}

	public void setTopping(List<Topping2> topping) {
		this.topping = topping;
	}
}
