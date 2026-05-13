# Pre Entrega Java

Proyecto realizado para la pre-entrega del curso BackEnd / Java - Talento Tech.

## Funcionalidades
- Gestión de productos
- Productos físicos y digitales
- Gestión de pedidos
- Validador

## Tecnologías utilizadas
- Java
- IntelliJ IDEA
- Git / GitHub

## Autor 
- Belén Bondoni Salas

## Estructura y Descripción de Clases:

src/
── com.techlab.inicio/
── GestorProductos.java
── Pedido.java
── Producto.java
── ProductoDigital.java
── ProductoFisico.java
── Validador.java

## Package
- com.techlab.inicio/

## GestorProductos.java
- Administra la lógica del sistema, siendo la misma que otorga las funcionalidades tales como buscar, registrar o listar productos.

## Pedido.java
- Gestiona los pedidos realizados por los usuarios y sus respectivos pedidos.

## Producto.java
- Contiene los atributos y comportamientos generales de un producto, como nombre, precio y código(ID).

## ProductoDigital.java
- Representa productos digitales. Hereda de Producto y permite manejar información relacionada a archivos digitales y sus características, tales como tamaño o formato.

## ProductoFisico.java
- Representa productos físicos. Hereda de Producto y agrega características específicas como peso y stock.

## Validador.java
- Contiene métodos de validación para verificar que los datos sean correctos y se corrobore el stock disponible de productos para así evitar errores en el sistema.

## Pendientes
- Eliminar archivos "ScTest y Main" de GitHub