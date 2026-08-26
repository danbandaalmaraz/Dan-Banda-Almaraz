package org.example.ESTUDIANTES;
import java.util.ArrayList;
import java.util.List;
public class BaseDatos {
    ArrayList<Estudiante>estudiantes = new ArrayList();
    ArrayList<Materia>materias = new ArrayList();
    ArrayList<Examen>examenes = new ArrayList();
    public BaseDatos(){
        materias.add(new Materia("100","Fisica"));
        materias.add(new Materia("101","Programacion"));
        materias.add(new Materia("102","Algebra"));
        materias.add(new Materia("103","Quimica"));
        materias.add(new Materia("104","Matematicas"));
        materias.add(new Materia("105","Español"));

        examenes.add(new Examen(2,"101","2025-12-01","12:00"));
        examenes.add(new Examen(3,"101","2025-12-01","16:00"));
        examenes.add(new Examen(4,"102","2025-12-02","18:00"));
        examenes.add(new Examen(5,"103","2025-12-02","10:00"));
        examenes.add(new Examen(6,"104","2025-12-03","14:00"));
        examenes.add(new Examen(7,"105","2025-12-03","13:00"));

        estudiantes.add(new Estudiante("Karla Mendoza",10001));
        estudiantes.add(new Estudiante("Dan Banda",10002));
        estudiantes.add(new Estudiante("Jose Luis",10003));
        estudiantes.add(new Estudiante("Valeria Fabiola",10004));
        estudiantes.add(new Estudiante("Maria Rosales",10005));
        estudiantes.add(new Estudiante("Kleber Saravia",10006));

        for(int i = 0; i < estudiantes.size(); i++ ){
            if(i % 3 == 0){
                estudiantes.get(i).aggMateria(materias.get(0));
                estudiantes.get(i).aggMateria(materias.get(1));
                estudiantes.get(i).aggMateria(materias.get(2));
            }else if(i % 3 == 1){
                estudiantes.get(i).aggMateria(materias.get(3));
                estudiantes.get(i).aggMateria(materias.get(4));
                estudiantes.get(i).aggMateria(materias.get(5));
            }else{
                estudiantes.get(i).aggMateria(materias.get(6));
                estudiantes.get(i).aggMateria(materias.get(7));
                estudiantes.get(i).aggMateria(materias.get(8));
            }
            for(Materia materia : estudiantes.get(i).getMaterias()){
                List<Examen> opcionesExamen = new ArrayList();
                for(Examen examen : examenes){
                    if(examen.materiaId.compareTo(materia.id) == 0){
                        opcionesExamen.add(examen);
                    }
                }
                if(i % 2 == 0){
                    estudiantes.get(i).aggExamen(opcionesExamen.get(0));
                }else{
                    estudiantes.get(i).aggExamen(opcionesExamen.get(1));
                }
            }
        }
    }
}
