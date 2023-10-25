<!-- Technology Transition Planning:
Scenario: "Our organization has decided to transition from MongoDB to Oracle as the backend database for our loan system. 
How would you plan and lead this transition, considering the impact on the existing microservices and Angular front end? 
What steps would you take, and how would you ensure a smooth transition without disrupting the current system?"
This scenario evaluates their ability to plan and execute a major technology transition, manage the associated risks, and communicate effectively with the team.
 -->

<!-- Apparoch :
What is Size of MongoDB ?  20 GB

1. Understnad structure , schema of exisiting MongoDB
2. Setup Oracle and check connection through credentials ( Authentication setup)
3. Compare data structure /schema in MongoDB & Oracle. Identify differences -
        If the data structures in MongoDB and Oracle differ significantly, then need to transform the data  
        Create Tables in Oracle DB to match structure of Mongo DB
        Data type conversion
        Mapping MongoDB documents to Oracle tables.
        Handling nested documents or arrays.
4. There can be multiple approaches for data transition a. ETL b. using scripts c. Data Migration Tools
a. Extract Transfer Load 
        Write script to Extract Data from MongoDB in CSV file
        Load Data from CSV into Oracle SQL INSERT statements / scripts which executes SQL queries 
        INSERT INTO LoansTable (field1, field2) VALUES (Value1, Value2)
5. Data Validation:
        After loading the data, verify the integrity of data by running checks and validation queries to ensure nothing was lost or corrupted during migration.
6. Incremental Data Migration (Data baseline one time and Eventual consistency)
        If  MongoDB data is frequently changing, need to setup incremental data migration process to keep the Oracle database up-to-date with changes in MongoDB. 
7. Code Changes for DB connections in API Code
8. Testing and QA:  
        Perform thorough testing to ensure that data in Oracle matches the source data in MongoDB.
9. Deployment, Backup and Rollback Plan:
        Backup of your MongoDB data 
        Based on UAT , deploy it to your production environment.
        Rollback plan in case the migration encounters issues or fails.
10. Monitoring and Maintenance:
        After migration, establish monitoring and maintenance procedures to ensure data consistency and performance.
11. Documentation:
   

-->


