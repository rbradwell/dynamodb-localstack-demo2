#!/bin/bash

export AWS_ACCESS_KEY_ID="test"
export AWS_SECRET_ACCESS_KEY="test"
export AWS_DEFAULT_REGION="eu-east-2"

# -- > Create DynamoDb Table
echo Creating  DynamoDb \'ItemInfo\' table ...
echo $(aws --endpoint-url=http://localhost:4566 dynamodb create-table --cli-input-json '{"TableName":"ItemInfo", "KeySchema":[{"AttributeName":"id","KeyType":"HASH"}], "AttributeDefinitions":[{"AttributeName":"id","AttributeType":"S"}],"BillingMode":"PAY_PER_REQUEST"}')

# --> List DynamoDb Tables
echo Listing tables ...
echo $(aws --endpoint-url=http://localhost:4566 dynamodb list-tables)
