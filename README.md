# Activité Pratique N°5 - Web services SOAP
## Inroduction
Ce projet présente le développement, le déploiement et le test d'un service web SOAP pour la gestion de comptes bancaires en utilisant JAX-WS. Le service offre les fonctionnalités suivantes:
- Conversion de montants en euros vers dirhams (DH)
- Consultation de comptes individuels
- Consultation d'une liste de comptes
## Création du Webservice
### 1-Création d'un projet Maven Java:
On commence par créer un projet Maven Java simple et ajoutez la dépendance suivante:
![image](https://github.com/AnassSSG/TP-SOAP/assets/133109998/0042ce15-e4d0-4cc4-aabf-49e41c84e6fe)
### 2-Définition du modèle de données:
![image](https://github.com/AnassSSG/TP-SOAP/assets/133109998/297474ee-fbf3-4ce9-8c3d-eb77804935b8)<br>
La classe doit inclure un constructeur , ainsi que des getters et des setters pour chaque attribut.
### 3-Développement du Webservice:
On crée une classe annotée `@WebService` pour définir le service web. Spécifiez le nom du service avec l'annotation `serviceName` et annotez chaque méthode avec `@WebMethod`.
![image](https://github.com/AnassSSG/TP-SOAP/assets/133109998/ab62e349-f590-4e92-85e3-827572a4f02b)
## Déploiement du Webservice
![image](https://github.com/AnassSSG/TP-SOAP/assets/133109998/21c2bd38-a17c-4eb4-83fd-36c2f0131c29)
## Consultation du WSDL
![image](https://github.com/AnassSSG/TP-SOAP/assets/133109998/63b7ddba-eb89-4ec5-a8e0-e5204d48f20b)
## Test du Webservice avec SoapUI
![image](https://github.com/AnassSSG/TP-SOAP/assets/133109998/d6570906-25b6-48ab-8512-c115a2d5d9d7)
### 1-Convertir un montant de l’euro en DH
![image](https://github.com/AnassSSG/TP-SOAP/assets/133109998/6df365d4-44c6-469a-a78e-9bab4f54f850)
### 2-Consulter un Compte
![image](https://github.com/AnassSSG/TP-SOAP/assets/133109998/0ea1b067-ec24-4baf-ad4a-df0471572d2d)
### 3-Consulter Consulter une Liste de comptes
![image](https://github.com/AnassSSG/TP-SOAP/assets/133109998/2819e737-4b39-45d3-93cd-63284dbee765)
## Création du Client SOAP Java
### 1-Création d'un projet Maven Java:
On crée un projet Maven Java distinct pour le client SOAP et ajoutez la même dépendance que pour le service web.
### 2-Génération du stub du client:
On utilise un plugin Maven  pour générer le stub(proxy) du client SOAP à partir du fichier WSDL.
![image](https://github.com/AnassSSG/TP-SOAP/assets/133109998/40bfd73c-8156-4dd3-ab63-d13f61a18c41)<br>
![image](https://github.com/AnassSSG/TP-SOAP/assets/133109998/53fd4e24-cef7-4794-ad0e-56547487b683)
### 3-Appel des méthodes du service web:
![image](https://github.com/AnassSSG/TP-SOAP/assets/133109998/59be03ac-8dd6-419f-b0ff-f893fbbafae1)
![image](https://github.com/AnassSSG/TP-SOAP/assets/133109998/626c6d0f-31f8-4e5f-ba37-2c749f811454)
## Conclusion
Ce projet démontre la création, le déploiement et le test d'un service web SOAP fonctionnel pour la gestion de comptes bancaires. Il fournit un exemple concret de l'utilisation de JAX-WS et des outils associés pour développer des services web SOAP robustes et interopérables.
