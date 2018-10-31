package gov.noaa;

import org.junit.jupiter.api.Test;

import java.io.StringReader;

import static org.junit.jupiter.api.Assertions.*;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;


class NdfdXMLBindingStubTest {
    @Test
    void latLonListZipCode() throws Exception {
        NdfdXMLBindingStub binding = (NdfdXMLBindingStub) new NdfdXMLLocator().getndfdXMLPort();
        String result = binding.latLonListZipCode("53711");

        JAXBContext jaxbContext = JAXBContext.newInstance(DwmlType.class);
        Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
        DwmlType dwml = (DwmlType) jaxbUnmarshaller.unmarshal(new StringReader(result));
        assertEquals("???", result);

    }

}