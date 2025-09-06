// create a table using java code in DynamoDB - Maven Project
 
public class CustomerDynamoJava{

	public static void main(String[] args) throws Exception {

		AmazonDynamoDBClient client = new AmazonDynamoDBClient();
 
		.withEndpoint("hhtps://localhost:8000");
 
		DynamoDB dynamoDB = new DynamoDB(client);
 
		String tableName = "Customer";

		try {

		System.out.println("customer table is creating....");
 
		Table table = dynamoDB.createTable(tableName, Arrays.asList(new KeySchemaElement("ID", KeyType.HASH), new KeySchemaElement("No", KeyType.RANGE)), Arrays.asList(new AttributeDefinition("ID"),ScalarAttributeType.N), new AttributeDefinition("No", ScalarAttributeType.S)), new ProvisionedThroughput(5L,5L));
 
		table.waitForActive();
 
		System.out.println("Table is created and is active to use");

		System.out.println(table.getDescription().getTableStatus());

		}catch(Exception ex) {

			System.out.println("sorry cannot create table.. some error");

			// use err instead of out // red color.

			System.out.println(ex.getMessage());

		}		

	}

}
 

/*<dependency>
<groupId>software.amazon.awssdk</groupId>
<artifactId>dynamodb</artifactId>
<version>2.25.61</version> <!-- use latest stable -->
</dependency>*/

/*AmazonDynamoDBClient client = new AmazonDynamoDBClient(new com.amazonaws.auth.BasicAWSCredentials("FakeaccessKey","FakeSecretKey”));
 
DynamoDB dynamoDB = new DynamoDB(client);*/