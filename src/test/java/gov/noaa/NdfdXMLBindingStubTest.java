package gov.noaa;

import org.junit.jupiter.api.Test;

import java.io.StringReader;

import static org.junit.jupiter.api.Assertions.*;

class NdfdXMLBindingStubTest {
    @Test
    void latLonListZipCode() throws Exception {
        NdfdXMLBindingStub binding = (NdfdXMLBindingStub) new NdfdXMLLocator().getndfdXMLPort();
        String result = binding.latLonListZipCode("53711");

        DwmlType dwml = (DwmlType) jaxbUnmarshaller.unmarshal(new StringReader(response));
        assertEquals("???", result);

    }

}