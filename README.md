# finalProject
Dans notre projet, nous utilisons deux composants clés pour faciliter la communication entre les différents services. 
Tout d'abord, **Eureka** joue un rôle essentiel en tant que registre de services. Il enregistre et localise dynamiquement les microservices déployés, offrant ainsi une vue d'ensemble du système. 
Grâce à Eureka, chaque microservice peut s'inscrire et signaler son état, permettant ainsi une gestion efficace des mises à jour et des modifications de services.
Ensuite, nous utilisons l'**API Gateway** comme point d'entrée centralisé pour les demandes d'API externes.
Son rôle principal est de simplifier l'accès aux différents microservices. 
Les clients envoient leurs demandes vers une seule URL, et l'API Gateway se charge de router la demande vers le microservice approprié en fonction des règles de routage prédéfinies.
Cela réduit la complexité pour les clients et centralise la gestion des routes et des politiques de sécurité au niveau de l'API Gateway.
Dans notre application, nous avons **dockerisé l'ensemble de nos services** . 
Tous les conteneurs nécessaires sont spécifiés et regroupés dans le fichier docker-compose.
Cette approche nous permet de gérer facilement et de déployer l'ensemble de notre application en utilisant Docker. Grâce au fichier docker-compose, nous pouvons définir les différentes configurations des conteneurs,
leurs dépendances et les liens entre eux, simplifiant ainsi le déploiement de notre application.
## Architecture 
![image](https://github.com/azbc1/finalProject/assets/86234200/3fea3e8a-2d38-4630-9ae6-2426553a82a1)


## Service 1: Microservice User  
Pour la getions des utilisateur 
**- Nom de l'application :** user-service
**- Les services :**
getAllUsers : /api/users GET 
getUserBySiteId : /api/site/{siteID} GET
getUserByOrganisationId : /api/site/{organisationId} GET
addUser :  /api/users POST
## Service 2: Microservice Rendez-vous
Pour la getions des Rendez-vous 
**- Nom de l'application :** rendezvouss-service
**- Les services :**
- Obtenir tous les rendez-vous
- Ajouter un rendez-vous
- Obtenir un rendez-vous avec son ID
## Service 3: Microservice Compte
**- Nom de l'application :** gestionCompte
**- Les services :**
## Service 4: Microservice Credit
**- Nom de l'application :** credit-Service
**- Les services :**
## Service 5: Microservice Carte Credit
**- Nom de l'application :** 
**- Les services : 
http://127.0.0.2:5000/api/python/front   : la partie front 
http://127.0.0.2:5000/api/python/cads : le select/all
http://127.0.0.2:5000/api/python/create Post : la ceration du carte credit 

 d'aller vers le projet CarteBancaireMicroservice et lancer le docker-compose: 
 docker-compose up --build -d 
 ![image](https://github.com/azbc1/finalProject/assets/86234200/cbfd46b1-e61b-4366-8369-ef587368dd60)

## Service 5: Microservice  Credit
**- Nom de l'application :** credit-service
**- Les services :** simulateur /http://localhost:8054/api/simulator/carSimulator?loanAmount=65&months=60
creation demande credit  http://localhost:8054/api/creditrequests/10
affichage demande credit http://localhost:8085/api/creditrequests/2
front Simulateur : 
http://localhost:4200/
![image](https://github.com/azbc1/finalProject/assets/86858336/06a43d5d-24a7-4d9a-950d-af3827b06d47)

## Service 6: Microservice Echange monnaie
**- Nom de l'application :** 
**- Les services :**
## Echange entre micro service
Nous avons connecté les deux microservices "Utilisateur" et "Crédit". Lorsque le service de demande de crédit reçoit une demande, il vérifie d'abord si l'utilisateur existe en appelant le microservice "Utilisateur" via le service d'ajout d'utilisateurs. Si l'utilisateur n'existe pas, le service d'ajout d'utilisateurs créera un nouvel utilisateur. Dans le cas où l'utilisateur existe déjà, le service de demande de crédit procède directement à la demande de crédit.

