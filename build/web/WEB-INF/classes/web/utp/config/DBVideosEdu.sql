CREATE TABLE usuario(
	id INT IDENTITY(1,1),
	nom_ape VARCHAR(50) NOT NULL,
	correo VARCHAR(20) NOT NULL,
	contraseña VARCHAR(100) NOT NULL,
	CONSTRAINT pk_usuario PRIMARY KEY(id)
)

CREATE TABLE articulo(
	id INT IDENTITY(1,1),
        usuario_id INT NOT NULL,
        titulo VARCHAR(100) NOT NULL,
        categoria VARCHAR(100) NOT NULL,
        descripcion TEXT,	
	dir_url TEXT,
        estado VARCHAR(50),
	CONSTRAINT pk_articulo PRIMARY KEY(id),
	CONSTRAINT fk_articulo_usuario FOREIGN KEY(usuario_id) REFERENCES usuario(id)
)




CREATE TABLE video(
	id INT IDENTITY(1,1),
        id_usuario INT NOT NULL,
        titulo VARCHAR(100) NOT NULL,
        categoria VARCHAR(100) NOT NULL,
        descripcion TEXT,	
        imagen TEXT,
	video_path TEXT,
        estado VARCHAR(50),
	CONSTRAINT pk_video PRIMARY KEY(id),
	CONSTRAINT fk_video_usuario FOREIGN KEY(id_usuario) REFERENCES usuario(id)
)

	  INSERT INTO usuario(nom_ape, correo, contraseña, imagen) VALUES('administrador','admin@admin.com','administrador','')

	
