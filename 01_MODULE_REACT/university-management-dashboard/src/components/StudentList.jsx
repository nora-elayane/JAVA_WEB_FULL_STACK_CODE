import "/src/styles/StudentList.css";
import StudentCard from "/src/components/StudentCard";
export default function StudentList(props) {
  return (
    <div className="list-students">
      {props.students.map((student) => (
        <StudentCard student={student} key={student.id} />
      ))}
    </div>
  );
}
