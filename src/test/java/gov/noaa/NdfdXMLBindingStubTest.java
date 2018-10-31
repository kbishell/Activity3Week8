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
        try {
            // create JAXB context and initializing Marshaller
            JAXBContext jaxbContext = JAXBContext.newInstance(DwmlType.class);
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();

            NdfdXMLBindingStub binding = (NdfdXMLBindingStub) new NdfdXMLLocator().getndfdXMLPort();
            String result = binding.latLonListZipCode("53711");


            DwmlType dwml = (DwmlType) jaxbUnmarshaller.unmarshal(new StringReader(result));

            assertEquals("43.0798,-89.3875", dwml.getLatLonList());

        } catch(Exception e) {
            e.printStackTrace();
        }

    }

}