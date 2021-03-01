package facility.model;

import inspection.model.I_Inspection;
import inspection.model.Inspection;
import maintenance.model.IMaintenance;
import maintenance.model.MaintLog;
import use.model.IUse;
import use.model.UseLog;

public class Facility {

	private IFacility facility;
	private IMaintenance maint;
	private IUse use;
	private I_Inspection inspection;
	
	public Facility() {
		this.facility = new FacilityInfo();
		this.maint = new MaintLog();
		this.use = new UseLog();
		this.inspection = new Inspection();
	}
	
	public FacilityInfo getFacilityInfo() {
		return (FacilityInfo) this.facility;
	}
	
	public MaintLog getMaintLog() {
		return (MaintLog) this.maint;
	}
	
	public UseLog getUseLog() {
		return (UseLog) this.use;
	}
	
	public Inspection getInspection() {
		return (Inspection) this.inspection;
	}
	
}
