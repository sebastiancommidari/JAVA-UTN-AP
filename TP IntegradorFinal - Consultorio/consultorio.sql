create database consultorio;

use consultorio;

create table pacientes(
DNIPaciente int(10) not null,
NombrePaciente varchar(30) not null,
ApellidoPaciente varchar(30) not null,
CalleDomicilioPaciente varchar(30) not null,
NroDomicilioPaciente int(4) not null,
primary key (DNIPaciente)
) engine=innodb;

create table medicos(
MatriculaMedico int(10) not null,
NombreMedico varchar(30) not null,
ApellidoMedico varchar(30) not null,
EspecialidadMedico varchar(30) not null,
primary key (MatriculaMedico)
) engine=innodb;

create table historiaClinica(
NumeroHC int(10) not null,
FechaHC date not null,
DiagnosticoHC varchar(30) not null,
primary key (NumeroHC),
DNIPacHC int(10),
foreign key(DNIPacHC) references pacientes(DNIPaciente) on delete no action on update no action,
MatMedHC int(10),
foreign key(MatMedHC) references medicos(MatriculaMedico) on delete no action on update no action
) engine=innodb;

insert into pacientes(DNIPaciente,NombrePaciente,ApellidoPaciente,CalleDomicilioPaciente,NroDomicilioPaciente) values ('36087030','Sebastian','Commidari','Villegas','676');
insert into pacientes(DNIPaciente,NombrePaciente,ApellidoPaciente,CalleDomicilioPaciente,NroDomicilioPaciente) values ('45876587','Lionel','Scaloni','Campeon', '2023');
insert into pacientes(DNIPaciente,NombrePaciente,ApellidoPaciente,CalleDomicilioPaciente,NroDomicilioPaciente) values ('64453241','Pablo','Aymar','Ayudante', '1111');
insert into pacientes(DNIPaciente,NombrePaciente,ApellidoPaciente,CalleDomicilioPaciente,NroDomicilioPaciente) values ('28987564','Laura','Garro','Recondo', '1234');

insert into medicos(MatriculaMedico,NombreMedico,ApellidoMedico,EspecialidadMedico) values ('32756','Ricardo','Iorio', 'Cardiología');
insert into medicos(MatriculaMedico,NombreMedico,ApellidoMedico,EspecialidadMedico) values ('54738','Luciano','Pereyra', 'Traumatología');
insert into medicos(MatriculaMedico,NombreMedico,ApellidoMedico,EspecialidadMedico) values ('45686','Marcela','Tiner', 'Obstetricia');
insert into medicos(MatriculaMedico,NombreMedico,ApellidoMedico,EspecialidadMedico) values ('51356','Claudia','Villafañe', 'Dermatología');

insert into historiaClinica(NumeroHC,FechaHC,DiagnosticoHC,DNIPacHC,MatMedHC) values ('123456','2023-04-25','Embarazo','28987564','45686');
insert into historiaClinica(NumeroHC,FechaHC,DiagnosticoHC,DNIPacHC,MatMedHC) values ('234567','2023-04-25','Arritmia','36087030','32756');
insert into historiaClinica(NumeroHC,FechaHC,DiagnosticoHC,DNIPacHC,MatMedHC) values ('345678','2023-04-25','Dermatitis','28987564','51356');
insert into historiaClinica(NumeroHC,FechaHC,DiagnosticoHC,DNIPacHC,MatMedHC) values ('456789','2023-04-25','Esguince','64453241','54738');