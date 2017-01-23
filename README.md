## Countries of the World
Spring web application that displays information about 5 countries.

Project initial files (like html mockups and initial css styling) where provided by project idea creators (https://teamtreehouse.com).
Project was meant to follow a set of requirements.

Base requirements were as follows:

1. Contains three packages for application code: web/controller, data/repository, model/entity
2. All routes are mapped corectly:
  - index page mapped as "/"
  - details page mapped as "/countries/{id}" or similar
3. Includes a separate class marked as @Component or @Repository, which is injected into the controller with @Autowired. 
   This class includes at least two methods - one for fetching all countries and one for fetching a single country using its identifier
4. All information is present: Country flags, flag thumbnails, accurate and clickable links
5. Detail view shows:
  - Country name
  - Population
  - Capital city
  - Official Language(s)
  - Image of flag
  
Additional requirements (also implemented):

1. Uses streams to filter data for finding a single country using its identifier
2. List of countries offers at least two options for sorting (eg. name and population)
3. At least one country has multiple official languages and these languages are presented as an HTML list

To check my other work please go to:

- https://github.com/grzegorzkonczak/instateam-with-spring-and-hibernate - Project team management web application using Spring with Hibernate.
- https://github.com/grzegorzkonczak/todo-api-with-spark - REST API for "TODO" application using Spark framework
- https://github.com/grzegorzkonczak/analyze-public-data-with-hibernate - Console application for managing Countries data using Hibernate and H2 file database.
- https://github.com/grzegorzkonczak/personal-blog - Simple web blog application built using Spark Framework
- https://github.com/grzegorzkonczak/Soccer-League-Organizer - Console based soccer team management application
- https://github.com/grzegorzkonczak/how_many_in_jar_game - Console based implementation of "How many in jar" game
