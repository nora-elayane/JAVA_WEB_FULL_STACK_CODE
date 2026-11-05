import Panier, { TVA, ttc as prixTTC } from "./Panier";

let p1 = new Panier();
p1.ajouter("Livre", 50);
p1.ajouter("cahier", 10);
console.log(p1.total());
