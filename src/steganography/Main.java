package steganography;

public class Main 
{
  public static void main(String[] args) 
  {
    try
    {
      Embedder emb = new Embedder("this is good", "/home/rahul/Documents/ppfApril.pdf", "/home/rahul/Documents/image1.jpg", "/home/rahul/Documents/image02.jpg");
     // Embedder emb = new Embedder("this is good", "f:/soft/hello.txt", "f:/hanu.jpg", "f:/qqq.png");
      emb.embed();

      //Extractor ext = new Extractor("this is good", "f:/qqq.png", "f:/soft/result");
      //ext.extract();
      
    }
    catch(Exception ex)
    {
      System.out.println("Err: " + ex);
    }
  }
}
