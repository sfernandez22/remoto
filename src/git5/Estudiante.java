package git5;

public class Estudiante {
private String nombre;
private String apellidos;
private String fecha_nacimiento;
private String dni;
private String estudios_previos;
private String telefono;
/**
 * 
 */
public Estudiante() {
	super();
	// TODO Auto-generated constructor stub
}
/**
 * @param nombre
 * @param apellidos
 * @param fecha_nacimiento
 * @param dni
 * @param estudios_previos
 * @param telefono
 */
public Estudiante(String nombre, String apellidos, String fecha_nacimiento, String dni, String estudios_previos,
		String telefono) {
	super();
	this.nombre = nombre;
	this.apellidos = apellidos;
	this.fecha_nacimiento = fecha_nacimiento;
	this.dni = dni;
	this.estudios_previos = estudios_previos;
	this.telefono = telefono;
}
/**
 * @return the nombre
 */
public String getNombre() {
	return nombre;
}
/**
 * @param nombre the nombre to set
 */
public void setNombre(String nombre) {
	this.nombre = nombre;
}
/**
 * @return the apellidos
 */
public String getApellidos() {
	return apellidos;
}
/**
 * @param apellidos the apellidos to set
 */
public void setApellidos(String apellidos) {
	this.apellidos = apellidos;
}
/**
 * @return the fecha_nacimiento
 */
public String getFecha_nacimiento() {
	return fecha_nacimiento;
}
/**
 * @param fecha_nacimiento the fecha_nacimiento to set
 */
public void setFecha_nacimiento(String fecha_nacimiento) {
	this.fecha_nacimiento = fecha_nacimiento;
}
/**
 * @return the dni
 */
public String getDni() {
	return dni;
}
/**
 * @param dni the dni to set
 */
public void setDni(String dni) {
	this.dni = dni;
}
/**
 * @return the estudios_previos
 */
public String getEstudios_previos() {
	return estudios_previos;
}
/**
 * @param estudios_previos the estudios_previos to set
 */
public void setEstudios_previos(String estudios_previos) {
	this.estudios_previos = estudios_previos;
}
/**
 * @return the telefono
 */
public String getTelefono() {
	return telefono;
}
/**
 * @param telefono the telefono to set
 */
public void setTelefono(String telefono) {
	this.telefono = telefono;
}

}
