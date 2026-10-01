package es.upm.aled.lab2.kinematics;

import java.util.ArrayList;
import java.util.List;

/**
 * Class representing one segment in the GUI that paints the exoskeleton's bones on
 * the screen. Each segment is identified by its length and the angle it forms with 
 * the previous segment. Every Segment has a List of their
 * children Segments; those it's connected to.
 * 
 * @author alejandro.gomezalcazar
 */
public class Segment {
	
	private double length;
	private double angle;
	private List<Segment> children;
	
	public Segment (double length, double angle) {
		this.length = length;
		this.angle = angle;
		this.children = new ArrayList<>();
	}

	public double getLength() {
		return length;
	}

	public double getAngle() {
		return angle;
	}

	public void setAngle(double angle) {
		this.angle = angle;
	}

	public List<Segment> getChildren() {
		return children;
	}
	
	/**
	 * Adds a new Segment to the List of Segments this one is connected to. Each Segment can
	 * only appear as a child once.
	 * 
	 * @param measurement The Segment to be added.
	 */
	public void addChild (Segment child) {
		if (!this.children.contains(child))
			children.add(child);
	}

}
