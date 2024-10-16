INSERT INTO ROLES(rol_Name) VALUES ('admin');
INSERT INTO ROLES(rol_Name) VALUES ('usuario');
INSERT INTO ROlES(rol_Name) VALUES('Manage');
INSERT INTO ROLES(rol_Name) VALUES('Default');

INSERT INTO PERMISOS (title) VALUES ('Crear Usuario');
INSERT INTO PERMISOS (title) VALUES ('Leer Usuario');
INSERT INTO PERMISOS (title) VALUES ('Actualizar Usuario');
INSERT INTO PERMISOS (title) VALUES ('Eliminar Usuario');
INSERT INTO PERMISOS (title) VALUES ('Crear Rol');
INSERT INTO PERMISOS (title) VALUES ('Leer Rol');
INSERT INTO PERMISOS (title) VALUES ('Actualizar Rol');

INSERT INTO ROL_PERMISOS(role_id, permiso_id) VALUES(1,1);
INSERT INTO ROL_PERMISOS(role_id, permiso_id) VALUES(1,2);
INSERT INTO ROL_PERMISOS(role_id, permiso_id) VALUES(1,3);
INSERT INTO ROL_PERMISOS(role_id, permiso_id) VALUES(1,4);
INSERT INTO ROL_PERMISOS(role_id, permiso_id) VALUES(3,5);
INSERT INTO ROL_PERMISOS(role_id, permiso_id) VALUES(3,6);
INSERT INTO ROL_PERMISOS(role_id, permiso_id) VALUES(3,7);
INSERT INTO ROL_PERMISOS(role_id, permiso_id) VALUES(2,2);


INSERT INTO USERS (name, subname, username, password, enabled, rol_id) VALUES ('Carlos', 'Gómez', 'cgomez', 'password1', true, 1);
INSERT INTO USERS (name, subname, username, password, enabled, rol_id) VALUES ('Pedro', 'Hernández', 'phernandez', 'password3', true, 1);
INSERT INTO USERS (name, subname, username, password, enabled, rol_id) VALUES ('Javier', 'Sánchez', 'jsanchez', 'password5', true, 1);
INSERT INTO USERS (name, subname, username, password, enabled, rol_id) VALUES ('Miguel', 'López', 'mlopez', 'password7', true, 1);
INSERT INTO USERS (name, subname, username, password, enabled, rol_id) VALUES ('Antonio', 'Ruiz', 'aruiz', 'password9', true, 1);
INSERT INTO USERS (name, subname, username, password, enabled, rol_id) VALUES ('Raúl', 'Moreno', 'rmoreno', 'password11', true, 1);
INSERT INTO USERS (name, subname, username, password, enabled, rol_id) VALUES ('David', 'Alonso', 'dalonso', 'password13', true, 1);
INSERT INTO USERS (name, subname, username, password, enabled, rol_id) VALUES ('Alberto', 'Molina', 'amolina', 'password15', true, 1);
INSERT INTO USERS (name, subname, username, password, enabled, rol_id) VALUES ('Francisco', 'Ortega', 'fortega', 'password17', true, 1);
INSERT INTO USERS (name, subname, username, password, enabled, rol_id) VALUES ('Jorge', 'Romero', 'jromero', 'password19', true, 1);
INSERT INTO USERS (name, subname, username, password, enabled, rol_id) VALUES ('Laura', 'Martínez', 'lmartinez', 'password2', false, 2);
INSERT INTO USERS (name, subname, username, password, enabled, rol_id) VALUES ('María', 'Rodríguez', 'mrodriguez', 'password4', false, 2);
INSERT INTO USERS (name, subname, username, password, enabled, rol_id) VALUES ('Ana', 'Pérez', 'aperez', 'password6', false, 2);
INSERT INTO USERS (name, subname, username, password, enabled, rol_id) VALUES ('Lucía', 'González', 'lgonzalez', 'password8', false, 2);
INSERT INTO USERS (name, subname, username, password, enabled, rol_id) VALUES ('Isabel', 'Díaz', 'idiaz', 'password10', false, 2);
INSERT INTO USERS (name, subname, username, password, enabled, rol_id) VALUES ('Sara', 'Jiménez', 'sjimenez', 'password12', false, 2);
INSERT INTO USERS (name, subname, username, password, enabled, rol_id) VALUES ('Elena', 'Cruz', 'ecruz', 'password14', false, 2);
INSERT INTO USERS (name, subname, username, password, enabled, rol_id) VALUES ('Verónica', 'Navarro', 'vnavarro', 'password16', false, 2);
INSERT INTO USERS (name, subname, username, password, enabled, rol_id) VALUES ('Natalia', 'Castro', 'ncastro', 'password18', false, 2);
INSERT INTO USERS (name, subname, username, password, enabled, rol_id) VALUES ('Silvia', 'Vargas', 'svargas', 'password20', false, 2);
INSERT INTO USERS (name, subname, username, password, enabled, rol_id) VALUES ('Ana', 'Martínez', 'amartinez', 'password1', true, 3);
INSERT INTO USERS (name, subname, username, password, enabled, rol_id) VALUES ('Luis', 'González', 'lgonzalez', 'password2', true, 3);
INSERT INTO USERS (name, subname, username, password, enabled, rol_id) VALUES ('Carlos', 'Pérez', 'cperez', 'password3', true, 3);
INSERT INTO USERS (name, subname, username, password, enabled, rol_id) VALUES ('María', 'Lopez', 'mlopez', 'password4', true, 3);
INSERT INTO USERS (name, subname, username, password, enabled, rol_id) VALUES ('Sofía', 'Hernández', 'shernandez', 'password5', true, 3);
INSERT INTO USERS (name, subname, username, password, enabled, rol_id) VALUES ('Javier', 'Castillo', 'jcastillo', 'password6', true, 4);
INSERT INTO USERS (name, subname, username, password, enabled, rol_id) VALUES ('Valentina', 'Ramírez', 'vramirez', 'password7', true, 4);
INSERT INTO USERS (name, subname, username, password, enabled, rol_id) VALUES ('Diego', 'Gutiérrez', 'dgutierrez', 'password8', true, 4);
INSERT INTO USERS (name, subname, username, password, enabled, rol_id) VALUES ('Lucía', 'Mendoza', 'lmendoza', 'password9', true, 4);
INSERT INTO USERS (name, subname, username, password, enabled, rol_id) VALUES ('Ricardo', 'Moreno', 'rmoreno', 'password10', true, 4);

