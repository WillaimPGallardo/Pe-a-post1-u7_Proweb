 Productos Web - Spring Boot MVC
 Descripción

Aplicación web desarrollada con **Spring Boot** que implementa el patrón **MVC** para la gestión de productos.
El sistema permite realizar operaciones CRUD utilizando **Thymeleaf** como motor de vistas y almacenamiento en memoria.

---

 Tecnologías

* Java 17
* Spring Boot 3
* Spring Web
* Thymeleaf
* Maven

---
 Estructura

```text
productosweb/
 ├── controller/
 ├── model/
 ├── service/
 └── resources/templates/productos/
```

---

## 🚀 Ejecución

1. Compilar:

```bash
mvn clean install
```

2. Ejecutar:

```bash
mvn spring-boot:run
```

3. Abrir en navegador:

```text
http://localhost:8080/productos
```

---

Funcionalidades

* Listar productos
* Crear productos
* Editar productos
* Eliminar productos
* Patrón MVC implementado
* Persistencia en memoria

---
<img width="1066" height="866" alt="image" src="https://github.com/user-attachments/assets/5cbe8fda-b9df-4164-b15c-2ec65e4349f4" />

<img width="800" height="830" alt="image" src="https://github.com/user-attachments/assets/669902ae-6d9d-41d0-99c1-effbda8a78e5" />

<img width="807" height="707" alt="image" src="https://github.com/user-attachments/assets/a108e75b-44b0-42ca-a1f1-a2fcc2dd2c62" />

Validación

El sistema cumple con:

* Arquitectura MVC desacoplada
* Flujo Post/Redirect/Get (PRG)
* Controlador con rutas RESTful
* Renderización dinámica con Thymeleaf

