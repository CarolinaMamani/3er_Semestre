-- Comenzamos con CRUD: Create, Read, Update, Delete

-- Read Listamos los estudiantes
SELECT * FROM estudiantes2024.estudiantes;
-- Create, insertar estudiantes
INSERT INTO estudiantes(nombre, apellido, telefono, email) VALUES ("Elsa","Pato","445521","elsapato@mail");
-- Update modificamos o actualizamos
UPDATE estudiantes SET nombre = "Lola", apellido = "Landa" WHERE idestudiantes = 1;
-- Delete 
DELETE FROM estudiantes WHERE idestudiantes = 3;
-- Para modificar el id y comience en 1 (nunca se usa, no es recomendado)
ALTER TABLE estudiantes AUTO_INCREMENT = 1;
