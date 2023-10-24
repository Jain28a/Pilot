
// Compoennts require are 
//  1) Feed Reader 2) Filter 3)Enricher 4) Feed Writer 
// Feed Reader - Assume feeds are available on the File system or Data lake with predefined file naming convetion and format
// Filter - Business rules to confifured to to figure out unwanted records from incomng feeds based on biz rules 
// Enricher - Ex. Enriching position files using reference data (Fx Spot Rate)
// Options are " Joins " 
// Broadcast Join example 

import org.apache.spark.sql.SparkSession
import org.apache.spark.sql.functions.broadcast

// Create a SparkSession
val spark = SparkSession.builder()
  
// Create a DataFrame for the "orders" dataset
val orders = spark.read.csv("path/orders.csv")

// Create a DataFrame for the "customers" dataset
val customers = spark.read.csv("path/to/customers.csv")

// Perform a broadcast join by broadcasting the "customers" DataFrame

val joinedDF = orders.join(broadcast(customers), "customer_id")

// Perform any further operations on the joined data
joinedDF.show()

// Stop the SparkSession
spark.stop()
