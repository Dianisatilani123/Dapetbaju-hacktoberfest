package Program_Nama_Negara;
public class DaftarNegara {
    public static void main(String[] args) {
  
        String[][] negara =
  {  { "INDONESIA", "JAKARTA"},
      { "KOREA SELATAN", "SOUL"},
      { "AMERIKA SERIKAT", "WASHINGTON D.C"},
      { "PANAMA", "PANAMA"},
      { "AUSTRALIA", "CANBERRA"},
      { "BELANDA", "AMSTERDAM"},
      { "BELGIA", "BRUSSEL"},
      { "ITALIA", "ROMA"},
      { "BRITANIA RAYA", "LONDON"},
      { "PRANCIS", "PARIS"} };
       
         String namaNegara;
      
          for (int baris = 0; baris < negara.length; baris++)
          
          {
          namaNegara = negara[baris][0];
          if (namaNegara.charAt(0)== 'A')
                  System.out.println(
                          negara[baris][0] + " - " + 
                          negara[baris][1] );
          
          }  
    }
          
        
    }
    

