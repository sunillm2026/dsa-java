package strivers_60_Days;

public class Day27_P1_Method_OverLoading {
	static class Zomato{
	    void searchHotel(String name) {
	        System.out.println("Hotel name: " + name);
	    }
	    void searchHotel(String name, String address) {
	        System.out.println("Hotel name: " + name + "Hotel address: " + address);
	    }
	    void searchHotel(String name, String address, double rating) {
	        System.out.println("Hotel name: " + name + "Hotel address: " + address + "Hotel rating: " + rating);
	    }
	}

	static class Main {
	    public static void main(String[] args) {
	        Zomato h1 = new Zomato();
	        h1.searchHotel("Brahmin's Cafe");
	        h1.searchHotel("Brahmin's Cafe", "Padmanabhanagar");
	        h1.searchHotel("Brahmin's Cafe", "Padmanabhanagar", 4.5);
	    }
	}
}

