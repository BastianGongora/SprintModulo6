

-- CREACION DE USUARIOS Y RELACIONES DE TABLA DE ROLES
insert into user (username,password) values('userCliente','123');
insert into user (username,password) values('userAdministrativo','123');
insert into user (username,password) values('userProfesional','123');

insert into autorities (name) values ("CLIENTE");
insert into autorities (name) values ("ADMINISTRATIVO");
insert into autorities (name) values ("PROFESIONAL");

insert into user_authority (username,authority_id) values("userCliente",1);
insert into user_authority (username,authority_id) values("userAdministrativo",2);
insert into user_authority (username,authority_id) values("userProfesional",3);

-- POBLADO DE TABLAS
INSERT INTO capacitaciones (detalle, fecha, hora_inicio, hora_termino, lugar, nombre, nro_asistentes)
VALUES ('Introducción a la Electricidad', '2023-09-05', '09:00', '12:00', 'Sala A', 'Capacitación A', 30);

INSERT INTO capacitaciones (detalle, fecha, hora_inicio, hora_termino, lugar, nombre, nro_asistentes)
VALUES ('Seguridad en Instalaciones Eléctricas', '2023-09-10', '10:30', '14:00', 'Sala B', 'Capacitación B', 25);

INSERT INTO capacitaciones (detalle, fecha, hora_inicio, hora_termino, lugar, nombre, nro_asistentes)
VALUES ('Mantenimiento de Sistemas Eléctricos', '2023-09-18', '13:00', '17:00', 'Sala C', 'Capacitación C', 20);

INSERT INTO capacitaciones (detalle, fecha, hora_inicio, hora_termino, lugar, nombre, nro_asistentes)
VALUES ('Diseño de Circuitos Eléctricos', '2023-09-22', '14:30', '18:00', 'Sala A', 'Capacitación D', 25);

INSERT INTO capacitaciones (detalle, fecha, hora_inicio, hora_termino, lugar, nombre, nro_asistentes)
VALUES ('Instalación de Paneles Solares', '2023-09-30', '10:00', '13:00', 'Sala B', 'Capacitación E', 15);

INSERT INTO capacitaciones (detalle, fecha, hora_inicio, hora_termino, lugar, nombre, nro_asistentes)
VALUES ('Normativas Eléctricas Actuales', '2023-10-05', '09:00', '11:30', 'Sala C', 'Capacitación F', 30);

INSERT INTO capacitaciones (detalle, fecha, hora_inicio, hora_termino, lugar, nombre, nro_asistentes)
VALUES ('Control de Calidad en Instalaciones', '2023-10-12', '11:00', '15:00', 'Sala A', 'Capacitación G', 20);

INSERT INTO capacitaciones (detalle, fecha, hora_inicio, hora_termino, lugar, nombre, nro_asistentes)
VALUES ('Automatización en Sistemas Eléctricos', '2023-10-20', '13:30', '17:30', 'Sala B', 'Capacitación H', 18);

INSERT INTO capacitaciones (detalle, fecha, hora_inicio, hora_termino, lugar, nombre, nro_asistentes)
VALUES ('Gestión Eficiente de la Energía', '2023-10-25', '10:30', '14:30', 'Sala C', 'Capacitación I', 25);

INSERT INTO usuarios (rut, apellido, contrasena, correo, nombre, rol)
VALUES ('12345678-9', 'Pérez', 'clave123', 'perez@example.com', 'Juan', 'Cliente');

INSERT INTO usuarios (rut, apellido, contrasena, correo, nombre, rol)
VALUES ('98765432-1', 'Gómez', 'abc456', 'gomez@example.com', 'María', 'Cliente');

INSERT INTO usuarios (rut, apellido, contrasena, correo, nombre, rol)
VALUES ('54321678-0', 'López', 'pass789', 'lopez@example.com', 'Andrés', 'Cliente');

INSERT INTO usuarios (rut, apellido, contrasena, correo, nombre, rol)
VALUES ('21098765-4', 'Rodríguez', 'qwerty', 'rodriguez@example.com', 'Laura', 'Administrativo');

INSERT INTO usuarios (rut, apellido, contrasena, correo, nombre, rol)
VALUES ('87654321-2', 'Martínez', '123abc', 'martinez@example.com', 'Carlos', 'Cliente');

INSERT INTO usuarios (rut, apellido, contrasena, correo, nombre, rol)
VALUES ('43215678-5', 'Fernández', '456def', 'fernandez@example.com', 'Ana', 'Cliente');

INSERT INTO usuarios (rut, apellido, contrasena, correo, nombre, rol)
VALUES ('76543210-8', 'Díaz', '789ghi', 'diaz@example.com', 'Diego', 'Cliente');

INSERT INTO usuarios (rut, apellido, contrasena, correo, nombre, rol)
VALUES ('10987654-3', 'García', 'abc123', 'garcia@example.com', 'Sofía', 'Administrativo');

INSERT INTO usuarios (rut, apellido, contrasena, correo, nombre, rol)
VALUES ('65432109-6', 'Hernández', 'def456', 'hernandez@example.com', 'Miguel', 'Cliente');

INSERT INTO usuarios (rut, apellido, contrasena, correo, nombre, rol)
VALUES ('54321098-7', 'Pérez', 'ghi789', 'perez2@example.com', 'Javiera', 'Cliente');

INSERT INTO usuarios (rut, apellido, contrasena, correo, nombre, rol)
VALUES ('87654321-0', 'Gómez', '123qwe', 'gomez2@example.com', 'Felipe', 'Cliente');

INSERT INTO usuarios (rut, apellido, contrasena, correo, nombre, rol)
VALUES ('21098765-1', 'López', '456asd', 'lopez2@example.com', 'Valentina', 'Administrativo');

INSERT INTO pagos (monto, rut)
VALUES (500000.0, '12345678-9');

INSERT INTO pagos (monto, rut)
VALUES (750000.0, '98765432-1');

INSERT INTO pagos (monto, rut)
VALUES (300000.0, '54321678-0');

INSERT INTO pagos (monto, rut)
VALUES (1000000.0, '21098765-4');

INSERT INTO pagos (monto, rut)
VALUES (150000.0, '87654321-2');

INSERT INTO pagos (monto, rut)
VALUES (800000.0, '43215678-5');

INSERT INTO visitas (detalle, estado, fecha, lugar)
VALUES ('Reparación de cortocircuito', 'Pendiente', '2023-08-27', 'Residencia A');

INSERT INTO visitas (detalle, estado, fecha, lugar)
VALUES ('Instalación de tomas eléctricas', 'Completo', '2023-09-02', 'Oficina B');

INSERT INTO visitas (detalle, estado, fecha, lugar)
VALUES ('Mantenimiento preventivo', 'Completo', '2023-09-10', 'Local Comercial C');

INSERT INTO visitas (detalle, estado, fecha, lugar)
VALUES ('Diagnóstico de falla en iluminación', 'Pendiente', '2023-09-15', 'Residencia D');

INSERT INTO visitas (detalle, estado, fecha, lugar)
VALUES ('Cableado para equipo industrial', 'Completo', '2023-09-18', 'Fábrica E');

INSERT INTO visitas (detalle, estado, fecha, lugar)
VALUES ('Sustitución de tablero eléctrico', 'Completo', '2023-09-25', 'Oficina F');

INSERT INTO visitas (detalle, estado, fecha, lugar)
VALUES ('Solución de fluctuaciones de voltaje', 'Pendiente', '2023-10-03', 'Residencia G');

INSERT INTO visitas (detalle, estado, fecha, lugar)
VALUES ('Revisión de sistemas de tierra', 'Completo', '2023-10-08', 'Local Comercial H');

INSERT INTO visitas (detalle, estado, fecha, lugar)
VALUES ('Instalación de iluminación exterior', 'Completo', '2023-10-15', 'Parque I');

INSERT INTO visitas (detalle, estado, fecha, lugar)
VALUES ('Diagnóstico de apagones frecuentes', 'Pendiente', '2023-10-22', 'Residencia J');

INSERT INTO visitas (detalle, estado, fecha, lugar)
VALUES ('Optimización de eficiencia energética', 'Pendiente', '2023-10-30', 'Oficina K');
