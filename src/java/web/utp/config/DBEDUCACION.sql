CREATE TABLE USUARIO(
	ID INT IDENTITY(1,1),
	NOM_APE VARCHAR(50) NOT NULL,
	CORREO VARCHAR(20) NOT NULL,
	CONTRASEŅA VARCHAR(16) NOT NULL,
	FEC_NAC VARCHAR(10) NOT NULL,
	IMAGEN VARCHAR(200),
	CREATED_AT DATETIME,
	UPDATED_AT DATETIME,
	CONSTRAINT PK_USUARIO PRIMARY KEY(ID)
)


CREATE TABLE CATEGORIA(
	ID INT IDENTITY(1,1),
	TITULO VARCHAR(30) NOT NULL,
	CREATED_AT DATETIME,
	UPDATED_AT DATETIME,
	CONSTRAINT PK_CATEGORIA PRIMARY KEY(ID)
)



CREATE TABLE COMENTARIO(
	ID INT IDENTITY(1,1),
	VIDEO_ID INT NOT NULL,
	USUARIO_ID INT NOT NULL,
	BODY TEXT,
	CREATED_AT DATETIME,
	UPDATED_AT DATETIME,
	CONSTRAINT PK_COMENTARIO PRIMARY KEY(ID),
	CONSTRAINT FK_COMENTARIO_USUARIO FOREIGN KEY(USUARIO_ID) REFERENCES USUARIO(ID),
	CONSTRAINT FK_COMENTARIO_VIDEO FOREIGN KEY(VIDEO_ID) REFERENCES VIDEO(ID)
)

CREATE TABLE VIDEO(
	ID INT IDENTITY(1,1),
	USUARIO_ID INT NOT NULL,
	CATEGORIA_ID INT NOT NULL,
	TITULO VARCHAR(30) NOT NULL,
	IMAGEN VARCHAR(200),
	ESTADO VARCHAR(10),
	VIDEO_PATH VARCHAR(200),
	DESCRIPCION TEXT,
	CREATED_AT DATETIME,
	UPDATED_AT DATETIME
	CONSTRAINT PK_VIDEO PRIMARY KEY(ID),
	CONSTRAINT FK_VIDEO_USUARIO FOREIGN KEY(USUARIO_ID) REFERENCES USUARIO(ID),
	CONSTRAINT FK_VIDEO_CATEGORIA FOREIGN KEY(CATEGORIA_ID) REFERENCES CATEGORIA(ID),
)


SELECT*FROM VIDEO
SELECT*FROM USUARIO
SELECT*FROM CATEGORIA
SELECT*FROM COMENTARIO




DROP TABLE COMENTARIO
DROP TABLE VIDEO
DROP TABLE USUARIO
DROP TABLE CATEGORIA




	INSERT INTO CATEGORIA VALUES('MATEMATICA',GETDATE(),GETDATE())
	INSERT INTO CATEGORIA VALUES('INGLES',GETDATE(),GETDATE())
	INSERT INTO CATEGORIA VALUES('LENGUAJE',GETDATE(),GETDATE())
	INSERT INTO CATEGORIA VALUES('HISTORIA',GETDATE(),GETDATE())
	INSERT INTO CATEGORIA VALUES('COMPUTACION',GETDATE(),GETDATE())
	INSERT INTO CATEGORIA VALUES('FISICA',GETDATE(),GETDATE())
	INSERT INTO CATEGORIA VALUES('QUIMICA',GETDATE(),GETDATE())
	INSERT INTO CATEGORIA VALUES('GEOGRAFIA',GETDATE(),GETDATE())
	INSERT INTO CATEGORIA VALUES('DESARROLLO PERSONAL',GETDATE(),GETDATE())
	
	

	INSERT INTO VIDEO VALUES(1,6,'APRENDIENDO FISICA','FISICA.JPG','ACTIVO','QUIMICA.MP4','QUIMICA BASICA PARA ESCOLARES',GETDATE(),GETDATE())
	INSERT INTO VIDEO VALUES(2,7,'APRENDIENDO QUIMICA','QUIMICA.JPG','ACTIVO','QUIMICA.MP4','QUIMICA BASICA PARA ESCOLARES',GETDATE(),GETDATE())
	INSERT INTO VIDEO VALUES(3,1,'APRENDIENDO MATEMATICA','MATEMATICA.JPG','ACTIVO','MATEMATICA.MP4','MATEMATICA BASICA PARA ESCOLARES',GETDATE(),GETDATE())
	INSERT INTO VIDEO VALUES(3,4,'APRENDIENDO HISTORIA','HISTORIA.JPG','ACTIVO','HISTORIA.MP4','HISTORIA BASICA PARA ESCOLARES',GETDATE(),GETDATE())
	INSERT INTO VIDEO VALUES(1,3,'APRENDIENDO LITERATURA','LITERATURA.JPG','ACTIVO','LITERATURA.MP4','LITERATURA BASICA PARA ESCOLARES',GETDATE(),GETDATE())

	INSERT INTO COMENTARIO VALUES(1,2,'VIDEO MUY BIEN EXPLICADO',GETDATE(),GETDATE())
	INSERT INTO COMENTARIO VALUES(1,2,'VIDEO MUY BIEN EXPLICADO',GETDATE(),GETDATE())
	INSERT INTO COMENTARIO VALUES(3,2,'VIDEO MUY BIEN EXPLICADO',GETDATE(),GETDATE())
	INSERT INTO COMENTARIO VALUES(5,1,'VIDEO MUY BIEN EXPLICADO',GETDATE(),GETDATE())

	INSERT INTO USUARIO VALUES('marco perez','marco@marco.com','12345','01-02-2003','',GETDATE(),GETDATE())
	INSERT INTO USUARIO VALUES('juan perez','juan@juan.com','12345','01-02-2003','',GETDATE(),GETDATE())
	INSERT INTO USUARIO VALUES('juan quispe','quispe@quispe.com','12345','01-02-2003','',GETDATE(),GETDATE())





