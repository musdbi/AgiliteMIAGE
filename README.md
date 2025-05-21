# À la découverte des objets avec la Boutique Enchantée

## Un tutoriel interactif d'introduction à la programmation orientée objet avec Java et BlueJ

Bienvenue, apprenti développeur ! Vous venez d'hériter d'une boutique magique dans une ruelle du vieux Paris. Cette boutique, <b>L'Échoppe Enchantée</b>, est connue pour vendre des articles aux propriétés mystérieuses. Mais il y a un problème : vous n'avez aucune idée de comment la gérer !

Heureusement, un vieux grimoire informatique vous attend sur le comptoir poussiéreux. Il contient le savoir nécessaire pour créer un système de gestion à l'aide d'une technologie appelée <b>programmation orientée objet.</b> En suivant ce tutoriel, vous apprendrez à manipuler votre boutique et ses produits magiques dans le monde virtuel, avant de vous lancer dans le monde réel.

Prêt pour l'aventure ? Allons-y !

## Préparation de l'atelier magique

### 1. Télécharger BlueJ

Rendez-vous sur le site mystique http://www.bluej.org/ et téléchargez l'outil BlueJ.

![1 (2)](https://github.com/user-attachments/assets/047ce921-a1c5-4f17-8a54-cc571f44344b)

### 2. Installer BlueJ

Installez-le en suivant les instructions du grimoire (assistant d’installation).


### 3. Créer un nouveau projet

Une fois l'atelier préparé, créez un nouvel espace de travail :
- Lancez BlueJ.
- Cliquez sur "Projet" → "Nouveau projet".
- Nommez votre projet <b>BoutiqueEnchantee</b> et choisissez un emplacement.
- Cliquez sur <b>Créer.</b>

![2 (2)](https://github.com/user-attachments/assets/203079a1-a664-481c-bb4d-9b065c4f785e)


## Création de notre première entité magique - la classe Boutique.

### 4. Créer votre classe fétiche
Dans le monde de la programmation, les objets commencent sous forme de <b>classes</b> - des plans qui définissent leurs caractéristiques.
Dans la fenêtre principale de BlueJ, cliquez sur "Nouvelle classe".
Une magie opère ! Nommez cette classe <b>Boutique</b> et sélectionnez "Class" comme type.
Cliquez sur "OK" pour invoquer cette nouvelle entité.

![3 (2)](https://github.com/user-attachments/assets/4a3d22bc-162b-4106-925e-44e5e4d655e3)

### 5. Compiler la classe

Maintenant, compilons notre création pour lui donner vie :
Cliquez sur "Compiler" dans la barre d'outils.

![4 (2)](https://github.com/user-attachments/assets/4a522d01-9f10-4137-a6d0-0a9776cb4b20)

### 6. Invocation - Créer une instance de notre boutique

Notre plan est prêt, mais il nous faut maintenant créer une boutique réelle - ce que les mages de la programmation appellent une "instance" :
- Faites un clic droit sur la classe "Boutique" dans le diagramme.
- Sélectionnez "new Boutique()" - l'incantation qui crée un nouvel objet.
- Donnez vie à votre boutique en la nommant "echoppe".
- Cliquez sur "OK".
  
![5 (2)](https://github.com/user-attachments/assets/7b8fd12c-ca10-4cc8-bbf6-05cfc237b7c0)

### 7. Enchantement - Doter notre boutique de propriétés magiques

Ouvrons le grimoire (éditeur de code) et ajoutons des propriétés magiques à notre boutique :

![6](https://github.com/user-attachments/assets/42e57922-e6ee-4c94-b90b-227f52395fab)

![7](https://github.com/user-attachments/assets/b7699ad3-fde8-4d12-a12e-b7edca98a903)

Compilez à nouveau votre création en cliquant sur "Compiler". Votre boutique possède maintenant des propriétés et des pouvoirs !


### 8. Expérimentation - Tester les pouvoirs de notre boutique
Il est temps d'explorer les capacités de notre création :
- Supprimez l'ancienne instance (clic droit sur l'objet → Remove)
- Créez une nouvelle boutique : clic droit sur la classe → "new Boutique("Artefacts & Sortilèges", 500.0)"
  
![8](https://github.com/user-attachments/assets/106adfa3-80df-4823-be2b-cd493ae5240a)

- Inspectez votre boutique magique : clic droit sur l'objet → "Inspect"
- Admirez ses propriétés : nom = "Artefacts & Sortilèges" et chiffreAffaires = 500.0
- Utilisez son pouvoir de vente : clic droit sur l'objet → realiserTransac(150.0)
- 
![9](https://github.com/user-attachments/assets/73315442-0d2d-489b-bd7c-d62e17edc850)

Inspectez à nouveau - le chiffre d'affaires est montée à 650.0 !

![10](https://github.com/user-attachments/assets/3885e54d-9a0e-4863-9792-c745524691c1)

### 9. Épreuves magiques - Tester notre boutique

Les grands mages le savent : toute création magique doit être testée pour s'assurer de sa fiabilité. Créons un rituel de test :
- Faites un clic droit sur la classe "Boutique" dans le diagramme
- Sélectionnez "Créer une classe de test"
- Nommez-la "testBoutique" et cliquez sur "OK"
- Maintenant, écrivons nos tests :

  ![11](https://github.com/user-attachments/assets/2835be36-ac1b-4375-9ef9-0a75a065f727)
  
Exécutez le test en faisant un clic droit sur la classe "BoutiqueTest" et en sélectionnant "Test All".

![12](https://github.com/user-attachments/assets/60d1ab30-8443-4b3c-a243-c8090e97d155)
Magnifique ! Notre boutique fonctionne parfaitement.

## L'extension de notre univers magique.

### 11. Création d'une nouvelle entité - la classe Article.

Notre boutique a besoin d'articles magiques à vendre. Créons-les :
Créez une nouvelle classe nommée "Article"
Ajoutez ce code enchanteur :

![test](https://github.com/user-attachments/assets/65c70751-089f-4e11-b0dc-2345d2ac7fcd)

![test2](https://github.com/user-attachments/assets/3c46b47c-f6ba-427a-a0a5-5c943108f788)

Ajoutez un objet Article à votre boutique pour associer Boutique unilatéralement à Article.

![15](https://github.com/user-attachments/assets/6592d756-b972-47f6-b882-772fae9fc005)

### 12. Le test des interactions entre nos entités magiques

Créons maintenant un rituel pour tester l'interaction entre notre boutique et ses articles :

![16](https://github.com/user-attachments/assets/5927cbc7-61dc-4f87-bdb7-cca4ba616728)

![17](https://github.com/user-attachments/assets/f0cd699f-2bfa-4296-9387-c0f8a1f7af86)

### 13. Création d'une relation bidirectionnelle entre boutique et articles

Pour qu'une boutique puisse gérer plusieurs articles, et que chaque article connaisse sa boutique, nous devons modifier nos classes pour créer une relation bidirectionnelle parfaite :
Modifions la classe Article :

![18](https://github.com/user-attachments/assets/2176ec8d-8d1a-46ae-ad68-6b8ea07f9ff6)

Et modifions la classe Boutique pour qu'elle gère une collection d'articles :

![19](https://github.com/user-attachments/assets/99224f58-49d9-4e4e-9658-91a2831c2797)

![20](https://github.com/user-attachments/assets/51c3aa69-ca19-48db-bfc2-b3c0d5c2c9a2)

![21](https://github.com/user-attachments/assets/b0cd19d8-b4b8-43fa-a12e-a063f921ee56)

Testons notre implémentation dans un nouveau scénario interactif :
- Créez une boutique : Boutique magasin = new Boutique("Potions & Enchantements", 500.0);
- Créez plusieurs articles :
    1. Article baguette = new Article("Baguette en bois de rose", 150.0);
    2. Article grimoire = new Article("Grimoire des éléments", 200.0);
    3. Article amulette = new Article("Amulette lunaire", 80.0);

- Ajoutez-les à la boutique : 
    1. magasin.ajouterArticle(baguette);
    2. magasin.ajouterArticle(grimoire);
    3. magasin.ajouterArticle(amulette);



- Affichez l'inventaire : magasin.afficherInventaire();
- Vérifiez la relation bidirectionnelle : baguette.getBoutique().getNom()





