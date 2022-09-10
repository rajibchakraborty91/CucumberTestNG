#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""0000000000000000
## (Comments)
#Sample Feature Definition Template
#@tag
Feature: Cucumber Selenium Feature
  I want to use this template for my feature file

Background: Initiate the learning
Given you are ready to learn



@smoke 
	Scenario Outline: Print Hello World
		Given Print hello world
		Then Print your name as "<name>"
		Examples:
		|name|
		|Esha Naskar Chakraborty|
@Regression
	Scenario: Print Hello India
		Given Print hello india again
		When you enter a sixteen digit number as "2134567890123456"
		Then Verify it is visa or master
		Then Print your wife's name





