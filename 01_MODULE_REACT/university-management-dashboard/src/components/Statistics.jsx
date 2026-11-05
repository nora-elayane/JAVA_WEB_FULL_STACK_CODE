import "/src/styles/Statistics.css";
export default function Statistics(props) {
  console.log(props.nbEtudiantsFiliere);
  let chaine = "";
  for (const [key, value] of Object.entries(props.nbEtudiantsFiliere)) {
    chaine += `${key} : ${value} -`;
  }
  return (
    <section className="statistics">
      <div className="card">
        <h2>{props.etudiantsActifs ?? "err"}</h2>
        <p>Actifs</p>
      </div>
      <div className="card">
        <h2>{props.moyenneGeneral.toFixed(2) ?? "err"} </h2>
        <p>Moyenne promo</p>
      </div>
      <div className="card">
        <h2>{props.etudiantsExellences ?? "err"}</h2>
        <p>Exellents</p>
      </div>
      <div className="card">
        <h2>{chaine}</h2>
        <p>par filiere</p>
      </div>
    </section>
  );
}
