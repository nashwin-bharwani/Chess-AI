public class test {

	

	public static void main(String[] args) {
		Piece a = new Pawn(true, 1, 3);
		Piece b = a.getCopyOf();
		a.setCoordinates(2, 5);
		System.out.println(a.row+" "+a.col);
		System.out.println(b.row+" "+b.col);
		Board c = new Board(8);
		Board d = new Board(c, true);
		//Move m = new Move(0, 2, )
		
	}
}
