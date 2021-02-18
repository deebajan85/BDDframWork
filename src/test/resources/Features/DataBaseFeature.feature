Feature: DataBase SQL query Feature Scenario

@testDB
Scenario: Execute all information from Actor Table
Given User connect to PostgreSql DataBase
When User sends querry 'Select * from public.actor'
Then User should get all information from that table 



