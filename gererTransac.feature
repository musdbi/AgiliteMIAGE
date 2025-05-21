Feature: US_001 Gérer les transactions commerciales

En tant que Gérant de boutique
Je veux enregistrer chaque transaction commerciale avec son montant
Afin de suivre le chiffre d'affaires et maintenir des données financières précises

Scenario Outline: ajout d'une transaction au chiffre d'affaires
Given une boutique <boutique> avec un chiffre d'affaires initial de <ca_initial>
When le gérant réalise une transaction de <montant>
Then le nouveau chiffre d'affaires doit être de <ca_final>

Examples:
| boutique       | ca_initial | montant | ca_final |
| "Boulangerie"  | 1000       | 25      | 1025     |
| "Librairie"    | 5000       | 42.50   | 5042.50  |
| "Café"         | 0          | 3.50    | 3.50     |
