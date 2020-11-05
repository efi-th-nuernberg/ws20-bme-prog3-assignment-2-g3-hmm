
class TextFormatter {
private int maxLength;


  private static final String text = "Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy " +
          "eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et " +
          "accusam et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est Lorem " +
          "ipsum dolor sit amet. Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod " +
          "tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et " +
          "justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est " +
          "Lorem ipsum dolor sit amet.";

        

  public static void main(String[] args) {

    TextFormatter formatter = new TextFormatter(30); 
    formatter.print(text);
  }

  // Konstruktor
  public TextFormatter(int maxLineLength) {
     maxLength = maxLineLength;
  }
  
  // Ausgabe
  public void print(String aText) {
    String[] words = aText.split(" ");
    int letterCounter = 0;
	  for(int i = 0; i < words.length; i++) {
      int wordLength = words[i].length();
	    if(letterCounter + wordLength <= maxLength) {
	      letterCounter += wordLength + 1;
	    	System.out.print(words[i] + " ");
	    }else{
	    	System.out.print("\n" + words[i] + " ");
        letterCounter = wordLength + 1;
      }
    }
      System.out.println();
  }
} 	


