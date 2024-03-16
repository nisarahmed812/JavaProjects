package Main_Classes;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import POJO_Classes.PojoData;

public class JsonSerializationDemo {

	public static void main(String[] args) throws JsonProcessingException {

		// Serialization
		PojoData pdata = new PojoData();
		pdata.setName("Alan");
		pdata.setValue(12);

		ObjectMapper mapper = new ObjectMapper();
		String serializedData = mapper.writeValueAsString(pdata);
		System.out.println("Serialized Data: " + serializedData);

		System.out.println("**************************************");

		// Deserialization
		PojoData deserializedData = mapper.readValue(serializedData, PojoData.class);
		System.out.println("Deserialized Data:");
		System.out.println("Name: " + deserializedData.getName());
		System.out.println("Value: " + deserializedData.getValue());
	}
}
