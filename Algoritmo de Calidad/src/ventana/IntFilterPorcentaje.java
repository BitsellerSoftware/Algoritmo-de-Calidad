package ventana;

import javax.swing.JOptionPane;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.DocumentFilter;

public class IntFilterPorcentaje extends DocumentFilter {
	
	/* esto nose para q seria; no parece hacer falta
	@Override
	   public void insertString(FilterBypass fb, int offset, String string, AttributeSet attr) throws BadLocationException {
	      Document doc = fb.getDocument();
	      StringBuilder sb = new StringBuilder();
	      sb.append(doc.getText(0, doc.getLength()));
	      sb.insert(offset, string);

	      if (test(sb.toString())) {
	         System.out.println("todo bien papu");
	    	  super.insertString(fb, offset, string, attr);
	         
	      } else {
	         // warn the user and don't allow the insert
	    	  System.out.println("mandaste cualquiera mostro 1");
	      }
	   }
	*/

	   private boolean test(String text) {
	      int numero;
		   try {
	         numero = Integer.parseInt(text); 
	         if(numero > 100 || numero < 0 ) {
		    	 // mandaste un numero muy grande o muy chiiqui
	        	 return false;
	         }
	        	
	         return true;
	      } catch (NumberFormatException e) {
	    	  //no mandaste un numero
	         return false;
	      }
	   }
	   
	   
	   @Override
	   public void replace(FilterBypass fb, int offset, int length, String text,
	         AttributeSet attrs) throws BadLocationException {

	      Document doc = fb.getDocument();
	      StringBuilder sb = new StringBuilder();
	      sb.append(doc.getText(0, doc.getLength()));
	      sb.replace(offset, offset + length, text);

	      if (test(sb.toString())) {
	         super.replace(fb, offset, length, text, attrs);
	      } else {
	         // no ingresas nada y le avisas al tipo que mando cualquiera
	    	  JOptionPane.showMessageDialog( null, "Ingrese un valor entre 0 y 100");
	      }

	   }
	   
	   
	   @Override
	   public void remove(FilterBypass fb, int offset, int length)
	         throws BadLocationException {
	      Document doc = fb.getDocument();
	      StringBuilder sb = new StringBuilder();
	      sb.append(doc.getText(0, doc.getLength()));
	      sb.delete(offset, offset + length);
	      
	      //if ( sb.equals("") || test(sb.toString()) ) {
	      // borra siempre
	      super.remove(fb, offset, length);
	      //} else {
	         // warn the user and don't allow the insert
	      //  System.out.println("mandaste cualquiera mostro 3");
	      //}

	   }
}
