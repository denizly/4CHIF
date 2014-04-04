package at.irian.jsfatwork.gui.page;

import javax.faces.context.FacesContext;
import javax.faces.event.ValueChangeEvent;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ManagedBean;

/*
 * customer profile
 */
@ManagedBean
@SessionScoped
public class Customer {
	

	private String name;
	private int alter2;
	private int grose;
	

	public int getGrose() {
		return grose;
	}

	public void setGrose(int grose) {
		this.grose = grose;
	}

	public String getName() {
		return name;
	}

	public int getAlter2() {
		return alter2;
	}

	public void setAlter2(int alter2) {
		if(alter2 >5 && alter2 <50)
		{
			this.alter2 = alter2;
		}
		else
		{
			this.alter2=0;
			fehler();
		}
		
	}

	public void setName(String name) {
		this.name = name;
	}

	
	public String fehler()
	{
		
		return "/fehler.xhtml";
	}

	public String save() {
		return "/showCustomer.xhtml";
	}
	public String cancel(){
		name="";
		alter2=0;
		return "/editCustomer.xhtml";
	}


}
