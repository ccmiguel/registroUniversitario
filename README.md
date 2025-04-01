# 🎓 Registro Universitario

Proyecto CRUD en **Spring Boot** para la gestión de estudiantes, docentes y materias en una universidad. Implementa operaciones **CRUD** (🔄 Crear, Leer, Actualizar y Eliminar) sobre los estudiantes con **Java 21**, **Spring Boot**, **JPA** y **H2 Database**.

## 📊 Funcionalidades

- 🔄 **CRUD de Estudiantes** (Crear, Leer, Actualizar, Eliminar)
- 📝 **Gestor de Materias** (Consulta de materias disponibles)
- 👨‍🎓 **Gestor de Docentes** (Manejo de profesores en la universidad)
- 🔧 **DTOs para transferencia de datos**
- 🔢 **Uso de patrones de diseño como Service y Repository**
- ⚙️ **Persistencia con JPA e H2 Database**
- 🔍 **Pruebas de endpoints con Postman y cURL**

## 📚 Tecnologías utilizadas

- ☕ **Java 21**
- 🌟 **Spring Boot**
- 🏙️ **Spring Data JPA**
- 🌐 **Spring Web** (REST API)
- 📃 **H2 Database** (Base de datos en memoria)
- 📝 **Lombok** (Para reducir el código boilerplate)
- 🕹️ **Maven** (Gestor de dependencias)

## 🗂️ Estructura del Proyecto

```
registroUniversitario/
  src/
    main/
      java/
        com/
          example/
            universidad/
              controller/
                EstudianteController.java
              dto/
                DocenteDTO.java
                EstudianteDTO.java
                MateriaDTO.java
              model/
                Docente.java
                Estudiante.java
                Materia.java
                Persona.java
              repository/
                EstudianteRepository.java
              service/
                impl/
                  EstudianteServiceImpl.java
                IEstudianteService.java
      resources/
        application.properties
```

## 🛠️ Instalación y Ejecución

1. **Clonar el repositorio**:
   ```sh
   git clone https://github.com/tu_usuario/registroUniversitario.git
   cd registroUniversitario
   ```

2. **Compilar y ejecutar**:
   ```sh
   mvn spring-boot:run
   ```

3. **Acceder a la API**:
   - API disponible en: `http://localhost:8080/api/estudiantes`

## 📝 Endpoints Principales

### 👨‍🎓 Estudiantes

- **Obtener todos los estudiantes**
  ```http
  GET /api/estudiantes
  ```
- **Obtener un estudiante por ID**
  ```http
  GET /api/estudiantes/{id}
  ```
- **Crear un nuevo estudiante**
  ```http
  POST /api/estudiantes
  ```
- **Actualizar un estudiante**
  ```http
  PUT /api/estudiantes/{id}
  ```
- **Eliminar un estudiante**
  ```http
  DELETE /api/estudiantes/{id}
  ```

## 💪 Pruebas y Validación

Las pruebas se realizaron con **Postman** y **cURL**. A continuación, ejemplos:

- **Crear estudiante con cURL**
  ```sh
  curl -X POST "http://localhost:8080/api/estudiantes" -H "Content-Type: application/json" -d '{"nombre": "Juan", "apellido": "Pérez", "email": "juan@example.com", "numeroInscripcion": "S001"}'
  ```

- **Actualizar estudiante con cURL**
  ```sh
  curl -X PUT "http://localhost:8080/api/estudiantes/1" -H "Content-Type: application/json" -d '{"nombre": "Juan", "apellido": "Pérez", "email": "juan.perez@example.com", "numeroInscripcion": "S002"}'
  ```

- **Eliminar estudiante con cURL**
  ```sh
  curl -X DELETE "http://localhost:8080/api/estudiantes/1"

## 💎 Autor

Desarrollado por **Miguel Angel Calderon Conde** 🚀

## 🔗 Enlace al Repositorio

[GitHub - Registro Universitario](https://github.com/tu_usuario/registroUniversitario)

