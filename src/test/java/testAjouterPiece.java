import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;

import fr.diginamic.exceptions.NumberFormatException;
import fr.diginamic.maison.Chambre;
import fr.diginamic.maison.Maison;

public class testAjouterPiece {

	@Test
	public void testAjouterPieceChambre() throws NullPointerException, NumberFormatException {
		Maison maison = new Maison();
		maison.ajouterPiece(new Chambre(5, 1));
		// chambre créée attendu
		Assert.assertEquals("Chambre créée", maison);
	}

	@Test
	public void testAjouterPieceNull() throws NullPointerException, NumberFormatException {
		Maison maison = new Maison();
		maison.ajouterPiece(null);
		// exception null attendu
		assertEquals("La pièce est incorrecte", maison);
	}

}
