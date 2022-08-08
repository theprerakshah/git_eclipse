package mavenQuestion;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.databind.JsonNode;

public class Question3 {
	public static void main(String[] args) {
		List<String> fname = new ArrayList<String>();
		File[] files = new File("/home/yagneshpancholi/Downloads/Problem_Input/3/AmazonMed_Json").listFiles();
		for (File file : files) {
			if (file.isFile()) {
				System.out.println(file.getName());
				try {
					ObjectMapper om = new ObjectMapper();

					JsonNode rootNode = om.readTree(file);
					if (rootNode == null) {
						continue;
					}
					JsonNode enNode = rootNode.path("Entities");
					for (JsonNode child : enNode) {

						double score = child.path("Score").asDouble();
						if (score < 0.9) {
							String s = child.path("Text").textValue();

							System.out.println(s);
							System.out.println(score);
							
							
						}
					}

				} catch (IOException e) {
					System.out.println(e);

				}
			}
		}

	}
}