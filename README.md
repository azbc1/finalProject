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
**- Les services :**
## Service 6: Microservice Echange monnaie
**- Nom de l'application :** 
**- Les services :**

