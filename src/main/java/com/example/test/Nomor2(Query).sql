create table detail_transaksi(
id INT NOT NULL,
id_transaksi INT,
harga int,
jumlah int,
subtotal int,
PRIMARY KEY (id),
CONSTRAINT fk_transaksi
FOREIGN KEY (id_transaksi)
REFERENCES data_transaksi(id));