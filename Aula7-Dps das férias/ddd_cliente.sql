CREATE TABLE ddd_cliente(
  id_cliente NUMBER PRIMARY KEY,
  nome_cliente VARCHAR2(30),
  placa VARCHAR2(7) NOT NULL,
  FOREIGN KEY(placa) REFERENCES ddd_carro(placa)
);
