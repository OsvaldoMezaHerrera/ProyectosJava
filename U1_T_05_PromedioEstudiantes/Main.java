import Model.Estudiante;

public class Main {
    public static void main(String[] args) {
        Estudiante[] estudiantes = new Estudiante[5];
        
        estudiantes[0] = new Estudiante();
        estudiantes[0].setNombre("Brayan");
        estudiantes[0].setMatricula("2025001");
        estudiantes[0].setNota(0, 80);
        estudiantes[0].setNota(1, 75);
        estudiantes[0].setNota(2, 85);
        estudiantes[0].setNota(3, 90);
        estudiantes[0].setNota(4, 70);
        
        estudiantes[1] = new Estudiante();
        estudiantes[1].setNombre("Alan");
        estudiantes[1].setMatricula("2025002");
        estudiantes[1].setNota(0, 70);
        estudiantes[1].setNota(1, 70);
        estudiantes[1].setNota(2, 78);
        estudiantes[1].setNota(3, 76);
        estudiantes[1].setNota(4, 80);
        
        estudiantes[2] = new Estudiante();
        estudiantes[2].setNombre("Osvaldo");
        estudiantes[2].setMatricula("2025003");
        estudiantes[2].setNota(0, 100);
        estudiantes[2].setNota(1, 100);
        estudiantes[2].setNota(2, 100);
        estudiantes[2].setNota(3, 100);
        estudiantes[2].setNota(4, 100);

        estudiantes[3] = new Estudiante();
        estudiantes[3].setNombre("Nicho");
        estudiantes[3].setMatricula("2025004");
        estudiantes[3].setNota(0, 80);
        estudiantes[3].setNota(1, 90);
        estudiantes[3].setNota(2, 60);
        estudiantes[3].setNota(3, 75);
        estudiantes[3].setNota(4, 85);

        estudiantes[4] = new Estudiante();
        estudiantes[4].setNombre("Jared");
        estudiantes[4].setMatricula("2025005");
        estudiantes[4].setNota(0, 65);
        estudiantes[4].setNota(1, 75);
        estudiantes[4].setNota(2, 68);
        estudiantes[4].setNota(3, 73);
        estudiantes[4].setNota(4, 55);

        for(int i = 0; i < estudiantes.length; i++) {
            System.out.println("Estudiante " + (i + 1) + ": " + estudiantes[i].getNombre());
            System.out.println("Matricula: " + estudiantes[i].getMatricula());
            System.out.println("Promedio: " + estudiantes[i].calcularPromedio());
            System.out.println("Aprobado: " + estudiantes[i].aprobado());
        }
    }
}