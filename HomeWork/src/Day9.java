import java.util.Objects;

public class Day9 {
	
	int clgId;
	String clgName;
	String principle;
	int clgFee;
	
	public Day9(int clgId, String clgName, String principle, int clgFee) {
		super();
		this.clgId = clgId;
		this.clgName = clgName;
		this.principle = principle;
		this.clgFee = clgFee;
	}
	
	@Override 
	public String toString() {
		return "Day9 [clgId=" + clgId + ", clgName=" + clgName + ", principle=" + principle + ", clgFee=" + clgFee
				+ "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(clgFee, clgId);
	}
	public Object Clone() throws  CloneNotSupportedException{
		return super.clone();
	}
	
	
}
