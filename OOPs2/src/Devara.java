
public class Devara  {
	
	int movieId;
	String mName;
	String mDirector;
	
	public Devara(int movieId, String mName, String mDirector) {
		super();
		this.movieId = movieId;
		this.mName = mName;
		this.mDirector = mDirector;
	}
	@Override
	public String toString() {
		return "Devara [movieId= Manava" + movieId + ", mName=" + mName + ", mDirector=" + mDirector + "]";
	}
//	public String mName(){
//		System.out.println("Welcome Java");
		
	public int hashCode() {
		return movieId;
	}
//	public String hashCode() {
//		return mName;
//	}

}
