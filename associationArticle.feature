Feature: US_002 Associer des articles à une boutique

En tant que Vendeur
Je veux associer des articles à ma boutique avec leurs noms et prix
Afin de gérer mon inventaire et vérifier la disponibilité des produits

Scenario Outline: vérification de la présence d'un article dans une boutique
Given un article "<article>" au prix de <prix>
And une boutique "<boutique>"
When l'article est associé à la boutique
Then la vérification de présence de l'article dans la boutique doit retourner <resultat>

Examples:
| article      | prix  | boutique     | resultat |
| Croissant    | 1.20  | Boulangerie  | true     |
| Roman        | 19.90 | Librairie    | true     |
| Café         | 2.50  | Boulangerie  | false    |

Scenario Outline: modification du prix d'un article
Given un article "<article>" avec un prix initial de <prix_initial>
When le vendeur modifie le prix à <nouveau_prix>
Then le prix de l'article doit être <nouveau_prix>

Examples:
| article       | prix_initial | nouveau_prix |
| Pain          | 1.10         | 1.20         |
| Livre poche   | 7.90         | 8.50         |
| Café espresso | 1.80         | 2.00         |
