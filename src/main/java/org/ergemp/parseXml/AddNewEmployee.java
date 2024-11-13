package org.ergemp.parseXml;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class AddNewEmployee {
    public static void main(String[] args){

        DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = null;

        try {
            builder = builderFactory.newDocumentBuilder();
            Document document = builder.parse(new FileInputStream("mockdata/employees.xml"));

            XPath xPath =  XPathFactory.newInstance().newXPath();
            String expression = "/Employees";

            NodeList employees = (NodeList) xPath.compile(expression).evaluate(document, XPathConstants.NODESET);

            Element employee = document.createElement("employee");
            employee.setAttribute("emplid","5555");

            Element firstname = document.createElement("firstname");
            firstname.setTextContent("ergem");
            Element lastname = document.createElement("lastname");
            lastname.setTextContent("peker");
            Element age = document.createElement("age");
            age.setTextContent("40");
            Element email = document.createElement("email");
            email.setTextContent("ergemp@ergemp");

            employee.appendChild(firstname);
            employee.appendChild(lastname);
            employee.appendChild(age);
            employee.appendChild(email);

            employees.item(0).appendChild(employee);

            Transformer transformer = TransformerFactory.newInstance().newTransformer();
            DOMSource sourceIndex = new DOMSource(document);

            StreamResult consoleResult = new StreamResult("mockdata/employees2.xml");
            transformer.transform(sourceIndex, consoleResult);

        } catch (TransformerConfigurationException e) {
            e.printStackTrace();
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (TransformerException e) {
            e.printStackTrace();
        } catch (XPathExpressionException e) {
            e.printStackTrace();
        }
    }
}
