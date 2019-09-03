# TDT4250
### Advanced Software Design

#### Table of content
1. [Assignment 1](#ass_1)  
  1.1 [Assignement information](#ass_1_info)  
  1.2 [Progress](#ass_1_prog) 
2. [Assignment 2](#ass_2)

<a name="ass_1"></a>
## Assignment 1

<a name="ass_1_info"></a>
### 1.1 Assignment information
The goal of the first assignment is to get experience with all important aspect of Ecore-modelling and code generation. This assignment is based on the case description for study plans, but it is not required to cover all of the case. Since the final goal is to be able to generate a web page for a program, the following should be covered:

* Study plan with semesters, courses and groups of courses to select among for electives (slots).
* Specializations, i.e. points where students can choose between several possible continuations of their plan.

Features of Ecore that must be used:
* classes and datatypes (enums are a kind of datatype)
* attributes and references, both ordinary and containment references, oppsites
* constraints (preferrably both manually written and with OCL) and derived features
You need no write tests in assignment 1, but need to for assignment 2, so you should start now!

The submission should be a link to the repository to clone for assessment. The repo should include a README with explanation of the repo structure and content.

<a name="ass_1_prog"></a>
### 1.2 Assignment 1 Progress
![alt text](https://github.com/oddaspa/TDT4250/blob/master/img/first_iteration.png "Plant UML first iteration")
The Ecore model now supports the following EClasses:
* Programme
  * EString name - e.g Master Data Science, Bachelor Information Technology, etc.
  * EString code - e.g MTDT, BKOM, etc.
  * EInt duration - e.g 10, 6, etc. (number of semesters for a given programme)
* Specialisation
  * EString name - e.g Information Systems, Aritifical Intelligence, etc.
* Semester 
  * EInt position - e.g 1, 6 (where in the programme the semester should be. 1 means first semester, first year. 6 means second semester third year)
  * float totalCredits - e.g 30. Should be considered as a constraint.
* ProgrammeCourse
  * EString type - e.g Mandatory, Specialisation, Complementary, etc. 
* Course
  * EString name - e.g Advanced Software Design, Algorithms and Data Structures, etc.
  * EString code - e.g TDT4250, TDT4120, etc.
  * float credit - e.g 7.5, 15, etc.
  * EString level - e.g Master level, Bachelor level, etc.

No constraints yet. As you see in the UML there are some containment relationships. These are visable in the following screenshot:  <br />
![alt text](https://github.com/oddaspa/TDT4250/blob/master/img/ecore_v1.png "Ecore first iteration")
