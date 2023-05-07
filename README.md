# DAWII_CL1_ARMANDO_LOPEZ_TORRES

* Error en la carga de de la data - el servicio no devuelve data de BD
* Verificar AlumnoController, linea comentada

### script de la BD

````


CREATE TABLE especialidad (
IdEsp CHAR(3) NOT NULL PRIMARY KEY,
NomEsp VARCHAR(30) NOT NULL,
Costo NUMERIC(8,1) NOT NULL
);

CREATE TABLE alumno (
IdAlumno CHAR(5) NOT NULL PRIMARY KEY,
ApeAlumno VARCHAR(30) NOT NULL,
NomAlumno VARCHAR(30) NOT NULL,
IdEsp CHAR(3) NOT NULL,
Proce CHAR(1),
FOREIGN KEY (IdEsp) REFERENCES especialidad(IdEsp)
);

-- Agregar Datos a la Tabla Especialidad
-- ==============================
Insert Into especialidad Values('1','Educacion Informatica',2500);
Insert Into especialidad Values('2','Administracion',1800);
Insert Into especialidad Values('3','Contabilidad',2000);
Insert Into especialidad Values('4','Idiomas',1800);
Insert Into especialidad Values('5','Ingenier�a de Sistemas',2800);

-- Agregar Datos a la Tabla Alumno
-- ==============================
Insert Into alumno Values('1','Valencia Salcedo','Christian','1','N');
Insert Into alumno Values('2','Ortiz Rodriguez','Freddy','1','P');
Insert Into alumno Values('3','Silva Mejia','Ruth Ketty','2','N');
Insert Into alumno Values('4','Melendez Noriega','Liliana','3','P');
Insert Into alumno Values('5','Huerta Leon','Silvia','4','N');
Insert Into alumno Values('6','Carranza Fuentes','Maria Elena','2','P');
Insert Into alumno Values('7','Prado Castro','Gabriela','1','N');
Insert Into alumno Values('8','Atuncar Mesias','Juan','5','P');
Insert Into alumno Values('9','Aguilar Zavala','Patricia Elena','1','P');
Insert Into alumno Values('10','Rodruigez Trujillo','Rubén Eduardo','1','N');
Insert Into alumno Values('11','Canales Ruiz','Gino Leonel','2','P');
Insert Into alumno Values('12','Ruiz Quispe','Edgar','2','N');
Insert Into alumno Values('13','PanduroTerrazas','Omar','3','P');
Insert Into alumno Values('14','Zita Padilla','Peter Wilmer','3','N');
Insert Into alumno Values('15','Ternero Ubillas','Luis','5','P');
Insert Into alumno Values('16','Rivera Garcia','Raul Joel','4','P');
Insert Into alumno Values('17','Pomar Garcia','Ana','4','P');
Insert Into alumno Values('18','Palomares Venegas','Mercedes','4','N');
Insert Into alumno Values('19','Ruiz Venegaz','Luis Alberto','4','P');
Insert Into alumno Values('20','Tejada Bernal','Janet','4','P');
Insert Into alumno Values('21','Sotelo Canales','Juan Carlos','5','P');
Insert Into alumno Values('22','LLosa Montalvan','Karla','5','P');
Insert Into alumno Values('23','Galarza Torres','Hugo','3','P');
Insert Into alumno Values('24','Valverde Jaramillo','Saul','5','N');
Insert Into alumno Values('25','Cipriano Avila','Roxana','4','N');
Insert Into alumno Values('26','Rodriguez Quispe','Luis Alberto','5','P');
Insert Into alumno Values('27','Huerta Leon','Marco Antonio','5','N');
Insert Into alumno Values('28','Ortiz Fuentes','Ana Marta','4','P');
Insert Into alumno Values('29','Rivera Jaramillo','Martha','5','P');
Insert Into alumno Values('30','Bustamante Campos','Guino','5','N');

````
