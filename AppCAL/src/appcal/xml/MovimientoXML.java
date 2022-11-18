/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appcal.xml;


import appcal.json.MovimientoJSON;
import java.io.StringWriter;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
/**
 *
 * @author esteban
 */
public class MovimientoXML {
    
Document doc;
  public String  creaMovimiento(MovimientoJSON objMovimiento) throws TransformerConfigurationException, TransformerException{
      /* RECOJO LOS DETALLES DEL MOVIMIENTO */
      
      /* UNA VEZ CREADO EL MOVIMIENTO LO AGREGO EN EL XML Y LO VUELCO EN EL FLUJO DE DATOS */
         TransformerFactory transformerFactory = TransformerFactory.newInstance();
         Transformer transformer = transformerFactory.newTransformer();
	 DOMSource source = new DOMSource(doc);
         StringWriter writer = new StringWriter(); 
	 StreamResult result = new StreamResult(writer);
         transformer.setOutputProperty(OutputKeys.ENCODING, "ISO-8859-1");
          transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "yes");
          transformer.setOutputProperty(OutputKeys.INDENT, "yes");
          transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "0");
          transformer.transform(source, result);
	  System.out.println("Done");
           
       return writer.toString();
}
}
