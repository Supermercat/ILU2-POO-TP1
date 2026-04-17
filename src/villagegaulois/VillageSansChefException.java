package villagegaulois;

//TODO appliquer les bonnes pratiques exceptions personnaliser 
public class VillageSansChefException extends Exception{
	
	private static final long serialVersionUID = 1L;

    public VillageSansChefException() {
        super();
    }

    public VillageSansChefException(String message) {
        super(message);
    }

    public VillageSansChefException(Throwable cause) {
        super(cause);
    }

    public VillageSansChefException(String message, Throwable cause) {
        super(message, cause);
    }
    //888

}
