# À la découverte des objets avec la Boutique Enchantée

## Un tutoriel interactif d'introduction à la programmation orientée objet avec Java et BlueJ

Bienvenue, apprenti développeur ! Vous venez d'hériter d'une boutique magique dans une ruelle du vieux Paris. Cette boutique, <b>L'Échoppe Enchantée</b>, est connue pour vendre des articles aux propriétés mystérieuses. Mais il y a un problème : vous n'avez aucune idée de comment la gérer !

Heureusement, un vieux grimoire informatique vous attend sur le comptoir poussiéreux. Il contient le savoir nécessaire pour créer un système de gestion à l'aide d'une technologie appelée <b>programmation orientée objet.</b> En suivant ce tutoriel, vous apprendrez à manipuler votre boutique et ses produits magiques dans le monde virtuel, avant de vous lancer dans le monde réel.

Prêt pour l'aventure ? Allons-y !

## Préparation de l'atelier magique

### 1. Télécharger BlueJ

Rendez-vous sur le site mystique http://www.bluej.org/ et téléchargez l'outil BlueJ.
PHOTO

### 2. Installer BlueJ

Installez-le en suivant les instructions du grimoire (assistant d’installation).

### 3. Créer un nouveau projet

Une fois l'atelier préparé, créez un nouvel espace de travail :
- Lancez BlueJ.
- Cliquez sur "Projet" → "Nouveau projet".
- Nommez votre projet <b>BoutiqueEnchantee</b> et choisissez un emplacement.
- Cliquez sur <b>Créer.</b>
PHOTO

## Création de notre première entité magique - la classe Boutique.

### 4. Créer votre classe fétiche
Dans le monde de la programmation, les objets commencent sous forme de <b>classes</b> - des plans qui définissent leurs caractéristiques.
Dans la fenêtre principale de BlueJ, cliquez sur "Nouvelle classe".
Une magie opère ! Nommez cette classe <b>Boutique</b> et sélectionnez "Class" comme type.
Cliquez sur "OK" pour invoquer cette nouvelle entité.
PHOTO

### 5. Compiler la classe

Maintenant, compilons notre création pour lui donner vie :
Cliquez sur "Compiler" dans la barre d'outils.
PHOTO

### 6. Invocation - Créer une instance de notre boutique

Notre plan est prêt, mais il nous faut maintenant créer une boutique réelle - ce que les mages de la programmation appellent une "instance" :
- Faites un clic droit sur la classe "Boutique" dans le diagramme.
- Sélectionnez "new Boutique()" - l'incantation qui crée un nouvel objet.
- Donnez vie à votre boutique en la nommant "echoppe".
- Cliquez sur "OK".
PHOTO

### 7. Enchantement - Doter notre boutique de propriétés magiques

Ouvrons le grimoire (éditeur de code) et ajoutons des propriétés magiques à notre boutique :
PHOTO
Compilez à nouveau votre création en cliquant sur "Compiler". Votre boutique possède maintenant des propriétés et des pouvoirs !


### 8. Expérimentation - Tester les pouvoirs de notre boutique
Il est temps d'explorer les capacités de notre création :
- Supprimez l'ancienne instance (clic droit sur l'objet → Remove)
- Créez une nouvelle boutique : clic droit sur la classe → "new Boutique("Artefacts & Sortilèges", 500.0)"
- Inspectez votre boutique magique : clic droit sur l'objet → "Inspect"
- Admirez ses propriétés : nom = "Artefacts & Sortilèges" et chiffreAffaires = 500.0
- Utilisez son pouvoir de vente : clic droit sur l'objet → realiserTransac(150.0)
Inspectez à nouveau - le chiffre d'affaires est montée à 650.0 !


### 9. Épreuves magiques - Tester notre boutique

Les grands mages le savent : toute création magique doit être testée pour s'assurer de sa fiabilité. Créons un rituel de test :
- Faites un clic droit sur la classe "Boutique" dans le diagramme
- Sélectionnez "Créer une classe de test"
- Nommez-la "BoutiqueTest" et cliquez sur "OK"
- Maintenant, écrivons nos tests :
PHOTO
Exécutez le test en faisant un clic droit sur la classe "BoutiqueTest" et en sélectionnant "Test All".
Magnifique ! Notre boutique fonctionne parfaitement.

## L'extension de notre univers magique.


### 11. Création d'une nouvelle entité - la classe Article.

Notre boutique a besoin d'articles magiques à vendre. Créons-les :
Créez une nouvelle classe nommée "Article"
Ajoutez ce code enchanteur :
PHOTO

### 12. Le test des interactions entre nos entités magiques

Créons maintenant un rituel pour tester l'interaction entre notre boutique et ses articles :
PHOTO
