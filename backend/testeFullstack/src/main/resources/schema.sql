CREATE TABLE usuarios (
  id BIGINT NOT NULL AUTO_INCREMENT PRIMARY KEY,
  nome VARCHAR(60) NOT NULL,
  login VARCHAR(15) NOT NULL,
  senha VARCHAR(500) NOT NULL
);

CREATE TABLE planos (
  id BIGINT NOT NULL AUTO_INCREMENT PRIMARY KEY,
  nome VARCHAR(100) NOT NULL,
  valor DECIMAL(10, 2) NOT NULL,
  data_cadastro TIMESTAMP NULL,
  data_atualizacao TIMESTAMP NULL,
  id_usuario BIGINT,
  CONSTRAINT fk_plano_usuario FOREIGN KEY (id_usuario) REFERENCES usuarios(id)
);

CREATE TABLE beneficiarios (
  id BIGINT NOT NULL AUTO_INCREMENT PRIMARY KEY,
  id_plano BIGINT NOT NULL,
  id_usuario BIGINT,
  nome VARCHAR(100) NOT NULL,
  cpf VARCHAR(14) UNIQUE NOT NULL,
  email VARCHAR(100),
  idade INT,
  data_cadastro TIMESTAMP NULL,
  data_atualizacao TIMESTAMP NULL,
  CONSTRAINT fk_beneficiario_plano FOREIGN KEY (id_plano) REFERENCES planos(id),
  CONSTRAINT fk_beneficiario_usuario FOREIGN KEY (id_usuario) REFERENCES usuarios(id)
);