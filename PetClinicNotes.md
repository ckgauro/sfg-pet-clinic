#Pet Clinic


Lect 47 --Done
``` 
https://github.com/springframeworkguru/sfg-pet-clinic

https://github.com/springframeworkguru/sfg-pet-clinic/tree/master/pet-clinic-data/src/main/java/guru/springframework/sfgpetclinic/model
[Revise according to video]

Create Person
https://github.com/springframeworkguru/sfg-pet-clinic/blob/master/pet-clinic-data/src/main/java/guru/springframework/sfgpetclinic/model/Person.java

https://github.com/springframeworkguru/sfg-pet-clinic/blob/master/pet-clinic-data/src/main/java/guru/springframework/sfgpetclinic/model/Vet.java

Owner
Person
Pet
PetType
Vet
``` 
--------

Lect 48  --Done
```  New>Module>Maven>Next>Artificate-->pet-clinic-data >finish

New>Module>Maven>Artificate-->pet-clinic-web
``` 

-----Lect 49
``` 
mvn release:prepare

<scm>
    
    
mvn release:perform
``` 
---------

Lect 50 --Done
``` 
pet-clinic-data
    services
        OwnerService [4.18]
        PetServices [5.15]
        VetServices

Issue- Implment Interface for services, Closes #5
``` 
-----------

Lect 51  --Done
``` 
pet-clinic-data
    model
        BaseEntity [2]
        Person [3]
        Pet
        PetType
        
adding base entity close#10        
``` 
-------
Section 4
Lect 61  --Done

```  pet-clinic-data
    services
        CrudService
            findAll
            findById
            save
            deelte
            deleteById
        OwnerService
        PetServices
        VetSErvices
```         
        
---------------------
Lect 62 --Done

```  pet-clinic-data
    services
        map
            AbstractMapService
                private map
                findAll
                findById
                save [3:30] look
                deleteById
                delete
            OwnerServiceMap
                findAll
                findById
                save[8:30]
                      return super.save(object.getId(),object);
                delete
                deleteById
            PetServiceMap
                findAll
                findById
                save
                   return super.save(object.getId(),object);
                delete
                deleteById
            VetServiceMap
                findAll
                findById
                save
                   return super.save(object.getId(),object);
                delete
                deleteById
  ```               
-----------
Lect 63--Done

``` pet-clinic-web
    application.properties
        spring.banner.image.location=vizsla.jpg
    vizsla.jpg
    run it
```     
-------

Lect 64 -- Done
``` pet-clinic-web
    resourcs
        templates
            index.html
                <h1 th:text="'Index Page'">Index Page</h1>
    java
        controller
            IndexController
                index
[run it]
localhost:8080/index.html
```

-----------

Lect 65 

--------
Lect 66  --Done
```

pet-clinic-web
    resourcs
        templates
            vets
                index.html
    java
        controller
            VetController
                listVets
  [run it]
localhost:8080/vets
```
------------
Lect 67 --Done
```
pet-clinic-web
    resourcs
        templates
            owners
                index.html
    java
        controller
            OwnerController
                listOwners
  [run it]
localhost:8080/owners
              
```              
---------      
# Section 5

Lect 80  ---Ongoing

```
{revise Video}
Create branch of pet-clinic-web project

pet-clinic-web
        https://github.com/springframeworkguru/sfg-pet-clinic/blob/master/pet-clinic-web/src/main/java/guru/springframework/sfgpetclinic/bootstrap/DataLoader.java
        OwnerServiceMap
        VetSericeMap
        PetServiceMap
        
```
--------------

Lect 81 
```

{revise Video}


```
--------------

Lect 82 
```

{revise Video}
pet-clinic-web
    Ownercontroller
    Owners/Index.html

  [run it]
localhost:8080/owners/index
```
--------------

Lect 83 
```

{revise Video}
pet-clinic-web
    Vetcontroller
    vet/Index.html

  [run it]
localhost:8080/vet/index

```
--------------

Lect 84 
```

{revise Video}



        