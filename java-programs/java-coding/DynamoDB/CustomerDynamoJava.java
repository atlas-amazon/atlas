package org.example;

import java.util.Arrays;

import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.client.builder.AwsClientBuilder;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder;
import com.amazonaws.services.dynamodbv2.document.DynamoDB;
import com.amazonaws.services.dynamodbv2.document.Table;
import com.amazonaws.services.dynamodbv2.model.*;

public class CustomerDynamoJava {

    public static void main(String[] args) {
        // Initialize DynamoDB client with dummy credentials for local use
        AmazonDynamoDB client = AmazonDynamoDBClientBuilder.standard()
                .withCredentials(new AWSStaticCredentialsProvider(new BasicAWSCredentials("dummy", "dummy")))
                .withEndpointConfiguration(new AwsClientBuilder.EndpointConfiguration("http://localhost:8000", "us-west-2"))
                .build();

        DynamoDB dynamoDB = new DynamoDB(client);
        String tableName = "Customer";

        try {
            System.out.println("Creating Customer table...");

            Table table = dynamoDB.createTable(
                    tableName,
                    Arrays.asList(
                            new KeySchemaElement("ID", KeyType.HASH),
                            new KeySchemaElement("No", KeyType.RANGE)
                    ),
                    Arrays.asList(
                            new AttributeDefinition("ID", ScalarAttributeType.N),
                            new AttributeDefinition("No", ScalarAttributeType.S)
                    ),
                    new ProvisionedThroughput(5L, 5L)
            );

            table.waitForActive();
            System.out.println("Table created and active!");
            System.out.println("Status: " + table.getDescription().getTableStatus());

        } catch (Exception ex) {
            System.err.println("Failed to create table: " + ex.getMessage());
        }
    }
}
