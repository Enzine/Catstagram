#####Web-palvelinohjelmointi Java syksy 2017

`Sonja Mäkipaja, Elsa Nyrhinen & Harri Kähkönen`

##Updates
When | Who | What
--------------- | ----- | ------
03.12.2016 | Sonja | Github repo created, documentation started, project files created for testing, project working on heroku now http://catstagrama.herokuapp.com/
04.12.2016 | Sonja | Base structure for project ready. pom.xml uptodate. Classes created: CatstagramApplication.java for running the app, in package *config* SecurityConfiguration.java for permission configuring (authentication), in package *service* CustomUserDetailsService.java for user details, in package *domain* Cat.java and Account.java, in package *repository* jpa-repositories for Cat and Account and in package *controller* DefaultController for init() and CatController for other things (not specified yet).
13.12.2016 | Harri & Elsa | Repository forked.
13.12.2016 | Sonja & Elsa | Front page html page created with a nice cat picture and background image. Login and logout are working nicely now and are redirecting correctly.
13.12.2016 | Elsa | Class structure & dependencies between classes thought over. Came up with the idea that cats could join clubs. Worked with registration matters: added classes etc.
