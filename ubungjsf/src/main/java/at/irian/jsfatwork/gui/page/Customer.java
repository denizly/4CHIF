package at.irian.jsfatwork.gui.page;

import java.util.Date;

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
	private int tag;
	private int monat;
	private int jahr;
	private Date datum;
	
	

	public Date getDatum() {
		Date dt = new Date();
		dt.setDate(tag);
		dt.setMonth(monat-1);
		dt.setYear(jahr);
		datum=dt;
		return datum;
	}

	public void setDatum(Date datum) {
		Date dt = new Date();
		dt.setDate(tag);
		dt.setMonth(monat-1);
		dt.setYear(jahr);
		datum=dt;
		
	}

	public int getTag() {
		return tag;
	}

	public void setTag(int tag) {
		this.tag = tag;
	}

	public int getMonat() {
		return monat;
	}

	public void setMonat(int monat) {
		this.monat = monat;
	}

	public int getJahr() {
		return jahr;
	}

	public void setJahr(int jahr) {
		this.jahr = jahr;
	}

	public void Datum(){
		Date dt = new Date();
		dt.setDate(tag);
		dt.setMonth(monat);
		dt.setYear(jahr);
	}
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
