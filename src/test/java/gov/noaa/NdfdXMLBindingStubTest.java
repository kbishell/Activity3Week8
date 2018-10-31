package gov.noaa;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.StringReader;

import static org.junit.jupiter.api.Assertions.*;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;


class NdfdXMLBindingStubTest {
    @Test
    void latLonListZipCode() throws Exception {
        NdfdXMLBindingStub binding = (NdfdXMLBindingStub) new NdfdXMLLocator().getndfdXMLPort();
        String result = binding.latLonListZipCode("53711");

        // create JAXB context and initializing Marshaller
        JAXBContext jaxbContext = JAXBContext.newInstance(DwmlType.class);
        Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();

        // specify the location and name of xml file to be read
        File XMLfile = new File('C:\\arpit\\CountryRecord.xml');

        // this will create Java object - country from the XML file
        Country countryIndia = (Country) jaxbUnmarshaller.unmarshal(XMLfile);

        assertEquals("???", result);

    }

}