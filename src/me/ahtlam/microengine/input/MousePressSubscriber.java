package me.ahtlam.microengine.input;

// Implement this class and add that to MousePressPublisher's subs list to get procs.
public interface MousePressSubscriber {
	public void proc(int x, int y);
}
