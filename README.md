Sistema de Monitoreo y Gestión Integral de Atletas de Alto Nivel - Guatemala
Enunciado:
El Comité Olímpico Guatemalteco desea evolucionar su sistema de control de rendimiento de atletas hacia una herramienta más robusta e integral. Esta nueva versión deberá incorporar no solo el registro de entrenamientos, sino también la gestión financiera (planilla) y la administración de entrenamientos internacionales, con persistencia en archivos JSON/CSV y una base de datos relacional para garantizar mayor confiabilidad y escalabilidad.

Requerimientos del sistema:
1. Gestión de atletas
Registrar un nuevo atleta con los siguientes datos:

Nombre completo

Edad

Disciplina (atletismo, natación, pesas, etc.)

Departamento de Guatemala

Nacionalidad (para distinguir entrenamientos en el extranjero)

Fecha de ingreso al comité

2. Entrenamientos
Registrar sesiones de entrenamiento:

Fecha

Tipo de entrenamiento (ej. resistencia, técnica, fuerza)

Valor de rendimiento (tiempo en segundos, peso levantado, distancia recorrida, etc.)

Ubicación (nacional o internacional, indicando país en caso de extranjero)

3. Estadísticas
Mostrar historial completo de entrenamientos de un atleta.

Calcular y mostrar:

Promedio de rendimiento.

Mejor marca.

Evolución en el tiempo (valores ordenados por fecha).

Comparar rendimiento nacional vs. internacional.

4. Gestión financiera (planilla)
Calcular el pago mensual de un atleta en función de:

Número de entrenamientos registrados.

Bonificación adicional por entrenamientos en el extranjero.

Bonificación por superar su mejor marca.

5. Persistencia de datos
Guardar y cargar información desde:

Archivos JSON (respaldo de atletas y entrenamientos).

Archivos CSV (exportación de reportes para análisis en Excel).

Base de datos relacional (MySQL o PostgreSQL) para almacenamiento principal.

6. Diseño y arquitectura
El sistema debe estar implementado en Java con Programación Orientada a Objetos.

Uso de patrones de diseño.

7. Interfaz de usuario
Aplicación de consola con menú interactivo que permita:

Registrar atletas y entrenamientos.

Consultar estadísticas.

Generar reportes en CSV.

Procesar pagos de planilla.

Guardar/cargar información desde JSON y BD.
