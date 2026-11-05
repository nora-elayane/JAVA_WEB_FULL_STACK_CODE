import "/src/styles/StudentCard.css";
import { calculerMoyenne, obtenirMention } from "/src/utils/studentUtils.js";
export default function studentCard({ student }) {
  return (
    <div className={!student.actif ? "card-student inactif" : "card-student"}>
      <h3>{student.nom}</h3>
      <p>{student.filiere}</p>
      <p>Moyenne</p>
      <h5>{calculerMoyenne(student)}</h5>
      <p className={obtenirMention(student)}>{obtenirMention(student)}</p>
    </div>
  );
}
