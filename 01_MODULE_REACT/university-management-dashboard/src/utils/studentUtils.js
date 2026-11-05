import { students } from "../data/students";

export function calculerMoyenne(student) {
  if (student.notes.length !== 0) {
    return (
      student.notes.reduce((acc, note) => acc + note, 0) / student.notes.length
    ).toFixed(2);
  } else {
    return 0;
  }
}

export function obtenirMention(student) {
  if (!student.actif) return "Inactif";
  if (student.notes.length === 0) return "Aucune note !";

  const moyenne = calculerMoyenne(student);

  if (moyenne >= 16) return "Très bien";
  if (moyenne >= 14) return "Bien";
  if (moyenne >= 12) return "Assez bien";
  if (moyenne >= 10) return "Passable";
  return "Echec";
}

export function obtenirEtudiantsAdmis(students) {
  return students
    .filter((student) => {
      if (
        student.actif &&
        calculerMoyenne(student) >= 10 &&
        student.absences <= 5
      ) {
        return student;
      }
    })
    .map((student) => student.nom);
}

export const etudiantsActifs = students.reduce(
  (acc, student) => (student.actif ? acc + 1 : acc + 0),
  0,
);

export const moyenneGeneral =
  students.reduce((acc, student) => {
    return student.actif ? acc + parseFloat(calculerMoyenne(student)) : acc;
  }, 0) / etudiantsActifs;

export const nbEtudiantsFiliere = students.reduce((acc, student) => {
  let filiere = student.filiere;
  if (filiere in acc) {
    acc[filiere]++;
  } else {
    acc[filiere] = 1;
  }
  return acc;
}, {});

export const etudiantsExellences = students.reduce(
  (acc, student) => (calculerMoyenne(student) >= 16 ? acc + 1 : acc + 0),
  0,
);

export const etudiantsTries = students.toSorted(
  (a, b) => calculerMoyenne(b) - calculerMoyenne(a),
);
