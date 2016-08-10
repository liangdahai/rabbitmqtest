package pojo;

import java.io.Serializable;
import java.util.List;

public class MyMessage implements Serializable {
	private static final long serialVersionUID = 7186077915017721388L;
	
	private List<String> names;
	private String id;
	
	public MyMessage(List<String> names, String id) {
		super();
		this.names = names;
		this.id = id;
	}
	public List<String> getNames() {
		return names;
	}
	public void setNames(List<String> names) {
		this.names = names;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "MyMessage [names=" + names + ", id=" + id + "]";
	}
}
