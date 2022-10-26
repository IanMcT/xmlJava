import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import java.io.File;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;


class Main {
    public static void main(String[] args) {

       String FILENAME = "point.xml";
      DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
      try{
        DocumentBuilder db = dbf.newDocumentBuilder();
        Document doc = db.parse(new File(FILENAME));
        doc.getDocumentElement().normalize();
        System.out.println("Root Element :" + doc.getDocumentElement().getNodeName());
        System.out.println("------");

        NodeList point = doc.getElementsByTagName("point");
        for(int i = 0; i < point.getLength(); i++){
          Node node = point.item(i);
          if (node.getNodeType() == Node.ELEMENT_NODE) {
            Element element = (Element) node;
          // get text
            String x = element.getElementsByTagName("x").item(0).getTextContent();
            String y = element.getElementsByTagName("y").item(0).getTextContent();
            System.out.println("x: " + x + ", y: " + y);
          }
        }
      }catch(Exception e){
        System.out.println("Error: " + e.getMessage());
      }
    }
}