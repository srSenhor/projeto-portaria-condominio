CREATE DATABASE bd_condominio;
USE bd_condominio;

CREATE TABLE MoradorPrincipal
(
	cpf VARCHAR(15) PRIMARY KEY,
    bloco VARCHAR(2) NOT NULL,
    numero INT  NOT NULL,
    rg VARCHAR(12),
    nome VARCHAR(40),
    telcelular VARCHAR(20),
    telcomercial VARCHAR(20),
    telresidencial VARCHAR(20),
    email VARCHAR(40),
    dataNascimento DATE,
    grupoWhatsapp BOOLEAN,
    locatario BOOLEAN
);
CREATE TABLE Apartamento 
(
	bloco VARCHAR(2) REFERENCES MoradorPrincipal(bloco),
    numero INT REFERENCES MoradorPrincipal(numero),
    situacao VARCHAR(15)
);
CREATE TABLE Morador
(
	cpf_mp VARCHAR(15) NOT NULL REFERENCES MoradorPrincipal(cpf),
    idMorador INT PRIMARY KEY,
    nome VARCHAR(40),
    parentesco VARCHAR(20),
    dataNascimento DATE
);
CREATE TABLE Empregado
(
	cpf_mp VARCHAR(15) NOT NULL REFERENCES MoradorPrincipal(cpf),
    rg VARCHAR(12) PRIMARY KEY,
    nome VARCHAR(40),
    cargo VARCHAR(25),
    turno VARCHAR(8)
);
CREATE TABLE Veiculo
(
	cpf_mp VARCHAR(15) NOT NULL REFERENCES MoradorPrincipal(cpf),
    placa VARCHAR(9) PRIMARY KEY,
    modelo VARCHAR(20),
    marca VARCHAR(20),
    cor VARCHAR(15)    
);
CREATE TABLE Animal
(
	cpf_mp VARCHAR(15) NOT NULL REFERENCES MoradorPrincipal(cpf),
    idAnimal INT PRIMARY KEY,
    tipo VARCHAR(20),
    raca VARCHAR(20),
    cor VARCHAR(15)    
);
CREATE TABLE ContatoEmergencial
(
	cpf_mp VARCHAR(15) NOT NULL REFERENCES MoradorPrincipal(cpf),
    idContato VARCHAR(9) PRIMARY KEY,
    nome VARCHAR(40),
    parentesco VARCHAR(20),
    telefone VARCHAR(20)    
);
CREATE TABLE InfoLocacao
(
	cpf_mp VARCHAR(15) NOT NULL REFERENCES MoradorPrincipal(cpf),
    dataMudanca DATE,
    dataFimContrato DATE,
    nome_empresa VARCHAR(20),
    telefone VARCHAR(20),
    nome_contato VARCHAR(20)    
);