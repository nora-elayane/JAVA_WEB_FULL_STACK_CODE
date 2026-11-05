export const TVA = 0.2;
export function ttc(prix) {
  return prix + prix * TVA;
}

export default class Panier {
  constructor() {
    this.articles = [];
  }
  ajouter(nom, prix) {
    this.articles.push({ nom, prix });
  }
  total() {
    return this.articles.reduce((a, b) => a + b.prix, 0);
  }
}
