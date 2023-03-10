BEGIN;
CREATE SCHEMA IF NOT EXISTS formula_magica ;
DROP TABLE IF EXISTS usuario;
DROP TABLE IF EXISTS ranking;
DROP TABLE IF EXISTS empresa;

CREATE TABLE usuario(
	id BIGINT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(50) NOT NULL,
    email VARCHAR(50) NOT NULL,
    senha VARCHAR(100) NOT NULL,
    ativo BOOLEAN NOT NULL
);

ALTER TABLE usuario ADD CONSTRAINT uk_usuario_email UNIQUE(email);

CREATE TABLE empresa(
	id BIGINT NOT NULL AUTO_INCREMENT PRIMARY KEY,
	ticker VARCHAR(10) NOT NULL,
    nome_empresa VARCHAR(45),
	ebit DOUBLE NOT NULL,
    valor_mercado DOUBLE NOT NULL,
    divida_liquida DOUBLE NOT NULL);

ALTER TABLE empresa ADD CONSTRAINT uk_empresa_ticker UNIQUE(ticker);

CREATE TABLE ranking(
	id BIGINT NOT NULL AUTO_INCREMENT PRIMARY KEY,
	ticker VARCHAR(10) NOT NULL,
	nome_empresa VARCHAR(45),
	earning_yeld DOUBLE NOT NULL);

ALTER TABLE ranking ADD CONSTRAINT fk_ranking_ticker FOREIGN KEY (ticker) REFERENCES empresa(ticker);
ALTER TABLE ranking ADD CONSTRAINT uk_ranking_ticker UNIQUE(ticker);