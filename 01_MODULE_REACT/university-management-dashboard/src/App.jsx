import Header from "./components/Header";
import Footer from "./components/Footer";
import StudentList from "./components/StudentList";
import "/src/styles/index.css";
import Statistics from "./components/Statistics";
import {
  etudiantsActifs,
  moyenneGeneral,
  nbEtudiantsFiliere,
  etudiantsExellences,
} from "./utils/studentUtils";
import { students } from "./data/students";

function App() {
  return (
    <>
      <Header />
      <main>
        <Statistics
          etudiantsActifs={etudiantsActifs}
          moyenneGeneral={moyenneGeneral}
          nbEtudiantsFiliere={nbEtudiantsFiliere}
          etudiantsExellences={etudiantsExellences}
        />
        <StudentList students={students} />
      </main>
      <Footer />
    </>
  );
}

export default App;
