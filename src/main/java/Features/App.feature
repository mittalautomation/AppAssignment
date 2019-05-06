Feature: Create Application 

Scenario Outline: 
When User enter fromDate "<fromDate>"
And User enter toDate "<toDate>"
Then Calculate Instrumentwise traded volume and List of instrument not traded between the daterange
   
    Examples:
    |	fromDate	|	toDate	|
    |	28/12/2017  |08/03/2018 |