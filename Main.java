import javax.xml.stream.XMLStreamReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import  java.io.FileReader;
class Main {
  public static void main(String[] args) {
    try{
      FileReader file = new FileReader("point.xml");
      XMLInputFactory input = XMLInputFactory.newInstance();
      XMLStreamReader reader =  input.createXMLStreamReader(file);
reader.next();
      while(reader.hasNext()){
        System.out.println(reader.getLocalName());
        while(reader.next()!=4){reader.next();}

        
      }
    }catch(XMLStreamException e)
      {
        
      }
    catch(Exception e)
      {
        System.out.println(e);
      }
    System.out.println("Hello world!");
  }
}